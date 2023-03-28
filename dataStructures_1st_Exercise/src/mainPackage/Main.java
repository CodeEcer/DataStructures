package mainPackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		 final byte[] zeroBytes = new byte[256];
		 
		//Dhmiourgia ton DataClass object
		int [] numberOfInstances = {5, 100, 200, 500, 800, 1000, 2000, 5000, 10000, 50000, 100000, 200000};
		
		int[] testKeys = {1,2,3,4,5};
		
		DataClass[] data = new DataClass[numberOfInstances[0]];
		
		
		//int [] nonUniqueKeys = RandomGenerator.GenerateNonQniqueKeys(numberOfInstances[0]);
		
		
		
		for(int i=0; i<numberOfInstances[0]; i++) {
			data[i] = new DataClass(testKeys[i],RandomGenerator.GenerateString(55)); 
		}
		
		
		//REFACTOR!!!!!
		DataPage dataPage = new DataPage();
		ByteBuffer RealDataPage = DataPage.makeDataPage();
		RandomAccessFile MyFile = new RandomAccessFile ("DataPages", "rw"); 
		
		int numberOfSavedPages = 0;
		int i = 0;
		
		MyFile.seek(0);

			
		while(i!=data.length) { //REFACTOOOOR
			RealDataPage.putInt(data[i].getKey());
			RealDataPage.put(data[i].convertStringToBytes().array());
		
			i++;
			
				if((i%4) == 0 || i==data.length) {
					MyFile.seek(256*numberOfSavedPages);
					MyFile.write(RealDataPage.array());
					numberOfSavedPages++;
						
					RealDataPage.rewind(); 
					RealDataPage.put(zeroBytes);
					RealDataPage.rewind();
										}
						
				else continue;
						
						}
					
				
				
				byte[] ReadDataPage = new byte[256]; //Gia na valo to data page	
				byte [] dataOfrecord = new byte[55];
				int numberOfReadPages = 0;
		        int key = 0;
		        boolean keyFound = false;
				
			   
			    
		       
		        int wantedkey = 3;
				
		        
		        //A tropos
		        MyFile.seek(0);
				while(numberOfReadPages < numberOfSavedPages || MyFile.read()!=-1) {
						if(keyFound) {break;}
						
						else {
					
						MyFile.seek(numberOfReadPages*256);
						MyFile.read(ReadDataPage);
						numberOfReadPages++;
						
						ByteArrayInputStream bis= new ByteArrayInputStream(ReadDataPage);
				        DataInputStream din= new DataInputStream(bis);
				        
				        		
				        while(din.available() > 59) {//an oti emeine sto stream einai mirkotero ap to 59 tote den uparxei
						       // kati allo sto page, ara allazo page
						
				        
				        	System.out.println("\n================== Result from file ==================");
				        	key = din.readInt();
				        
				        	if(key!=0) { // an to key einai 0 tote teleiose to datapage
				        		if(key == wantedkey) {
				        			keyFound = true;
				        			System.out.println("To kleidi vrethike");
				        			break;
				        		}
				        		din.read(dataOfrecord); //anagkastiko read gia na proxorhsei to stream
				        		//String stringOfRecord = new String(dataOfrecord,java.nio.charset.StandardCharsets.US_ASCII);
				        		//newData[k] = new DataClass (key,stringOfRecord);
				        		//k++;
				        		
				        	}
				        
				        	else break;
				       
				        }
		
						   
				        
					}
		              
							
				MyFile.close();		
				}
					
		
		
		
		
	}
					
				
}

	