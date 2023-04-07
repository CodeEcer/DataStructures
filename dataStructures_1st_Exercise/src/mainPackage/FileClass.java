package mainPackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class FileClass {
	
	public KeyDataPagePair [] pairs;
	public int counter; 	
	
	public FileClass(int numOfRecords) {
		
		this.pairs = new KeyDataPagePair [numOfRecords];
		this.counter = 0;
		}
	
	
	
	
	
	public RandomAccessFile writeRecordsToFile (String Name, DataClass[] data, int divider) throws FileNotFoundException {
		
		final byte[] zeroBytes = new byte[256];
		
		//DataPage dataPage = new DataPage();
		ByteBuffer RealDataPage = DataPage.makeDataPage();
		
		RandomAccessFile MyFile = new RandomAccessFile (Name, "rw"); 
		
		int numberOfSavedPages = 1;
		int i = 0;
		
		try {
			MyFile.seek(0);
		 
		
		while(i!=data.length) { //REFACTOOOOR
			RealDataPage.putInt(data[i].getKey());
			RealDataPage.put(data[i].convertStringToBytes().array());
			this.pairs[i] = new KeyDataPagePair(data[i].getKey(), numberOfSavedPages);
			
		
			i++;
			
				if((i%divider) == 0 || i==data.length) { // I want to write a dataPage every 4 for 59 byte size or every 8 for 31 bytes 
					MyFile.seek(256*(numberOfSavedPages-1));
					MyFile.write(RealDataPage.array());
					numberOfSavedPages++;
						
					RealDataPage.rewind(); 
					RealDataPage.put(zeroBytes);
					RealDataPage.rewind();
										}
						
				else continue;
						
						}
		
		 
			}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		return MyFile;
	}
	
	
	
	public RandomAccessFile writeIndexFile (String name) throws FileNotFoundException {
		
		final byte[] zeroBytes = new byte[256];
		
		//DataPage dataPage = new DataPage();
		ByteBuffer RealDataPage = DataPage.makeDataPage();
		
		RandomAccessFile MyFile = new RandomAccessFile (name, "rw"); 
		
		int numberOfSavedPages = 1;
		int i = 0;
		
		try {
			MyFile.seek(0);
		 
		
		while(i!=pairs.length) { //REFACTOOOOR
			RealDataPage.putInt(pairs[i].getKey());
			RealDataPage.putInt(pairs[i].getDataPage());
			
			
		
			i++;
			
				if(RealDataPage.position()==256 || i==pairs.length) { //
					MyFile.seek(256*(numberOfSavedPages-1));
					MyFile.write(RealDataPage.array());
					numberOfSavedPages++;
						
					RealDataPage.rewind(); 
					RealDataPage.put(zeroBytes);
					RealDataPage.rewind();
										}
						
				else continue;
						
						}
		
		 
			}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		return MyFile;
	}
	
	
	
	
	
	public void sortPairs() {
		 Arrays.sort(pairs);
	}

	
	public DataClass searchDataPageforWantedPair(KeyDataPagePair wantedPair , RandomAccessFile MyFile ,int stringSize ) {
		if (wantedPair == null) {return null;} // an einai null shmainei oti to pair den vrethike sto index file, ara apla gurnao piso
		else {
		return searchDataPageforWantedKey(wantedPair.getKey(), wantedPair.getDataPage(),MyFile,stringSize);
		}
	}
	
	
	
	public DataClass searchDataPageforWantedKey(int wantedKey ,int DataPageIndex, RandomAccessFile MyFile, int stringSize) {
		byte[] ReadDataPage = new byte[256]; //Gia na valo to data page	
		byte [] dataOfrecord = new byte[stringSize];
		int numberOfDataPage = 0;
        int key = 0;
        boolean keyFound = false;
		
        if(DataPageIndex != 0) { /* Ean to dataPageIndex exei kapoia timh, tote h methodos tha trejei os sumplhromatikh kapoiou allou tropoy
        kai tha psajei mono ena data page. Ean einai 0 tha psajei se olo to arxeio */
        	numberOfDataPage = DataPageIndex-1; // an thelo thn 1h selida ua prepei na kano seek sto 1 - 1 = 0 gia na thn diavaso
        }
	   
        
	   
		
        
        //A tropos
        try {
			MyFile.seek(0);
		
		while(MyFile.read()!=-1) {

			
				MyFile.seek(numberOfDataPage*256); //
				MyFile.read(ReadDataPage);
				numberOfDataPage++;
				
				ByteArrayInputStream bis= new ByteArrayInputStream(ReadDataPage);
		        DataInputStream din= new DataInputStream(bis);
		        
		        this.counter++; // Se kathe prosvash diskou aujano ton counter kata ena
		        		
		        while(din.available() > (stringSize+4) ) {//an oti emeine sto stream einai mirkotero ap to megethos ton data tou dataclass tote den uparxei
				       // kati allo sto page, ara allazo page
				
		        
		        	
		        	key = din.readInt();
		        
		        	if(key!=0) { // an to key einai 0 tote teleiose to datapage
		        		if(key == wantedKey) {
		        			keyFound = true;
		        			din.read(dataOfrecord);
		        			String stringOfRecord = new String(dataOfrecord,java.nio.charset.StandardCharsets.US_ASCII);
		        			
		        			DataClass wantedDataClass = new DataClass (key,stringOfRecord); 
			        		//newData[k] = new DataClass (key,stringOfRecord);
		        			//MyFile.close();
		        			//System.out.println("To kleidi vrethike");
		        			return wantedDataClass;
		        			
		        			
		        		}
		        		din.read(dataOfrecord); //anagkastiko read gia na proxorhsei to stream
		        		//String stringOfRecord = new String(dataOfrecord,java.nio.charset.StandardCharsets.US_ASCII);
		        		//newData[k] = new DataClass (key,stringOfRecord);
		        		//k++;
		        		
		        	}
		        
		        	else break;
		       
		        }

				   
		        
			}
              
					
				
		//MyFile.close();
		
        }
	
        catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
				}
		return null;
	
	}


	public  KeyDataPagePair searchWholeIndexFile(int wantedKey , RandomAccessFile MyFile) {
		byte[] ReadDataPage = new byte[256]; //Gia na valo to data page
		int numberOfDataPage = 0;
        int key = 0;
        
		
        
        try {
			MyFile.seek(0);
		
		while(MyFile.read()!=-1) {

			
				MyFile.seek(numberOfDataPage*256);
				MyFile.read(ReadDataPage);
				numberOfDataPage++;
				
				ByteArrayInputStream bis= new ByteArrayInputStream(ReadDataPage);
		        DataInputStream din= new DataInputStream(bis);
		        
		        this.counter++; // Se kathe prosvash diskou aujano ton counter kata ena
		        		
		        while(din.available() > 0) {// epeidh to indexfile diavazete ana 8 tote mono otan ftasei sto 0 teleiose to dataPage
				       //
				
		        
		        	
		        	key = din.readInt();
		        
		        	if(key!=0) { // an to key einai 0 tote teleiose to datapage
		        		if(key == wantedKey) {
		        			
		        			int dataPageOfWantedKey = din.readInt(); // edo tha mpei to dataPage
		        			//System.out.println("To kleidi vrethike");
		        			KeyDataPagePair wantedPair = new KeyDataPagePair(key, dataPageOfWantedKey);
		        		//	MyFile.close();
		        			return wantedPair;
		        			
		        			
		        		}
		        		din.readInt(); //anagkastiko read gia na proxorhsei to stream
		        		//String stringOfRecord = new String(dataOfrecord,java.nio.charset.StandardCharsets.US_ASCII);
		        		//newData[k] = new DataClass (key,stringOfRecord);
		        		//k++;
		        		
		        	}
		        
		        	else break;
		       
		        }

				   
		        
			}
              
					
				
		//MyFile.close();
		
        }
	
        catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
				}
		return null;
		
	
	}
	
	
	public  KeyDataPagePair LookSpecificDataPageInIndexFile(int wantedKey , RandomAccessFile MyFile,int DataPageIndex) {
		byte[] ReadDataPage = new byte[256]; //Gia na valo to data page
		
		
        int key, smallestKey = 0;
        
		
        
        try {
        	MyFile.seek((DataPageIndex-1)*256);
			MyFile.read(ReadDataPage);
			
			ByteArrayInputStream Fbis= new ByteArrayInputStream(ReadDataPage);
	        DataInputStream Fdin= new DataInputStream(Fbis);
	        
	        smallestKey = Fdin.readInt(); // find the smallest Key so that i can return it if i dont find the wantedKey
	        Fdin.read();
		

			
				MyFile.seek((DataPageIndex-1)*256);
				MyFile.read(ReadDataPage);
				
				
				ByteArrayInputStream bis= new ByteArrayInputStream(ReadDataPage);
		        DataInputStream din= new DataInputStream(bis);
		        
		        this.counter++; // Se kathe prosvash diskou aujano ton counter kata ena
		        		
		        while(din.available() > 0) {//oso exeis dedomena fere giati ta pairs einai ana 8ades
				
		        
		        	
		        	key = din.readInt();
		        
		        	if(key!=0) { // an to key einai 0 tote teleiose to datapage
		        		if(key == wantedKey) {
		        			
		        			int dataPageOfWantedKey = din.readInt(); // edo tha mpei to dataPage
		        		//	System.out.println("To kleidi vrethike");
		        			KeyDataPagePair wantedPair = new KeyDataPagePair(key, dataPageOfWantedKey);
		        		//	MyFile.close();
		        			return wantedPair;
		        			
		        			
		        		}
		        		din.readInt(); //anagkastiko read gia na proxorhsei to stream
		        		//String stringOfRecord = new String(dataOfrecord,java.nio.charset.StandardCharsets.US_ASCII);
		        		//newData[k] = new DataClass (key,stringOfRecord);
		        		//k++;
		        		
		        	}
		        
		        	else break;
		       
		        }

				   
		        
			
              
					
				
		//MyFile.close();
		
        }
	
        catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
				}
        KeyDataPagePair smallPair = new KeyDataPagePair (smallestKey,0); 
		return smallPair; 
		
	
	}
	
	
	
	
	
	public int findFileLength(RandomAccessFile IndexFile) {
		int numOfDataPages =0;
		try {
			do {
			numOfDataPages++; //an vro to EOF thelo na metrhso thn selida, ara aujano prokatavolika ton metrhth
			IndexFile.seek(numOfDataPages*256);
			
			
			}
			 while(IndexFile.read()!=-1);
			return numOfDataPages;
			
			
	}
		
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return 0;
}
	
	
	
	
	
	public KeyDataPagePair BinarySearchIndexFile (int wantedKey ,RandomAccessFile IndexFile , int low , int high) {
		
		
		KeyDataPagePair pair = null;
		
			
			 if (high >= low){
		            int midDataPage = low + (high - low) / 2;
		            pair= LookSpecificDataPageInIndexFile(wantedKey, IndexFile, midDataPage);
		            
		            if(pair.getKey() == wantedKey){
		            	return pair;
		            }
		            
		            if(pair.getKey() > wantedKey) {
		            	return BinarySearchIndexFile(wantedKey, IndexFile, low, high-1);
		            }
		            
		            else {return BinarySearchIndexFile(wantedKey, IndexFile, low+1, high);}
		            	
		       }
			 return null;
			 
			 
			 
			 
			 }
			

	
	
	
	
	
	
	public void resetCounter () {
		this.counter =0;
	}
	
	
	
	

	public KeyDataPagePair[] getPairs() {
		return pairs;
	}




	public void setPairs(KeyDataPagePair[] pairs) {
		pairs = pairs;
	}





	public int getCounter() {
		return counter;
	}





	public void setCounter(int counter) {
		this.counter = counter;
	}	
	
	
	
	
	
}