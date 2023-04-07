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
		//  NA GINOUN SXOLIA
		long start = System.currentTimeMillis();
		
		
		final int stringSize1 = 55;
		final int stringSize2 = 27;
		final int numOfSearches = 1000;
		
		int [] numberOfInstances = {50, 100, 200, 500, 800, 1000, 2000, 5000, 10000, 50000, 100000, 200000};
		
		
		int[] UniqueKeys0 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[0]);
		int[] UniqueKeys1 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[1]);
		int[] UniqueKeys2 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[2]);
		int[] UniqueKeys3 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[3]);
		int[] UniqueKeys4 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[4]);
		int[] UniqueKeys5 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[5]);
		int []UniqueKeys6 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[6]);
		int []UniqueKeys7 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[7]);
		int []UniqueKeys8 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[8]);
		int []UniqueKeys9 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[9]);
		int []UniqueKeys10 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[10]);
		int []UniqueKeys11 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[11]);
		
		DataClass[] data0 = new DataClass[numberOfInstances[0]];
		DataClass[] data1 = new DataClass[numberOfInstances[1]];
		DataClass[] data2 = new DataClass[numberOfInstances[2]];
		DataClass[] data3 = new DataClass[numberOfInstances[3]];
		DataClass[] data4 = new DataClass[numberOfInstances[4]];
		DataClass[] data5 = new DataClass[numberOfInstances[5]];
		DataClass[] data6 = new DataClass[numberOfInstances[6]];
		DataClass[] data7 = new DataClass[numberOfInstances[7]];
		DataClass[] data8 = new DataClass[numberOfInstances[8]];
		DataClass[] data9 = new DataClass[numberOfInstances[9]];
		DataClass[] data10 = new DataClass[numberOfInstances[10]];
		DataClass[] data11 = new DataClass[numberOfInstances[11]];
		
		
		
		for(int i=0; i<numberOfInstances[0]; i++) {
			data0[i] = new DataClass(UniqueKeys0[i],RandomGenerator.GenerateString(stringSize1)); 
		}
		
		
		for(int i=0; i<numberOfInstances[1]; i++) {
			data1[i] = new DataClass(UniqueKeys1[i],RandomGenerator.GenerateString(stringSize1)); 
		}
		
		
		for(int i=0; i<numberOfInstances[2]; i++) {
			data2[i] = new DataClass(UniqueKeys2[i],RandomGenerator.GenerateString(stringSize1)); 
		}
		
		
		for(int i=0; i<numberOfInstances[3]; i++) {
			data3[i] = new DataClass(UniqueKeys3[i],RandomGenerator.GenerateString(stringSize1)); 
		}
		
		
		for(int i=0; i<numberOfInstances[4]; i++) {
			data4[i] = new DataClass(UniqueKeys4[i],RandomGenerator.GenerateString(stringSize1)); 
		}
		
		for(int i=0; i<numberOfInstances[5]; i++) {
			data5[i] = new DataClass(UniqueKeys5[i],RandomGenerator.GenerateString(stringSize1)); 
		}
		
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		
		for(int i=0; i<numberOfInstances[6]; i++) {
			data6[i] = new DataClass(UniqueKeys6[i],RandomGenerator.GenerateString(stringSize1)); 
		}
		
		for(int i=0; i<numberOfInstances[7]; i++) {
			data7[i] = new DataClass(UniqueKeys7[i],RandomGenerator.GenerateString(stringSize1)); 
		}
		
		for(int i=0; i<numberOfInstances[8]; i++) {
			data8[i] = new DataClass(UniqueKeys8[i],RandomGenerator.GenerateString(stringSize1)); 
		}
		
		for(int i=0; i<numberOfInstances[9]; i++) {
			data9[i] = new DataClass(UniqueKeys9[i],RandomGenerator.GenerateString(stringSize1)); 
		}
		
		for(int i=0; i<numberOfInstances[10]; i++) {
			data10[i] = new DataClass(UniqueKeys10[i],RandomGenerator.GenerateString(stringSize1)); 
		}
		
		for(int i=0; i<numberOfInstances[11]; i++) {
			data11[i] = new DataClass(UniqueKeys11[i],RandomGenerator.GenerateString(stringSize1)); 
		}
		
		
		
		
		
		
		
		int []wantedKeys0 = RandomGenerator.GenerateNonQniqueKeys(numberOfInstances[0],20);
		int []wantedKeys1 = RandomGenerator.GenerateNonQniqueKeys(numberOfInstances[1],10);
		int []wantedKeys2 = RandomGenerator.GenerateNonQniqueKeys(numberOfInstances[2],5);
		int []wantedKeys3 = RandomGenerator.GenerateNonQniqueKeys(numberOfInstances[3],2);
		int []wantedKeys4 = RandomGenerator.GenerateNonQniqueKeys(numberOfInstances[4],2);
		int []wantedKeys5 = RandomGenerator.GenerateNonQniqueKeys(numberOfInstances[5],1);
		
		
		int [] wantedKeys6 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[6]);
		int [] wantedKeys7 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[7]);
		int [] wantedKeys8 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[8]);
		int [] wantedKeys9 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[9]);
		int [] wantedKeys10 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[10]);
		int [] wantedKeys11 = RandomGenerator.GenerateQniqueKeys(numberOfInstances[11]);
		
		
		
		
		
		
		
		
		
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		
		
		
		FileClass NewFile0 = new FileClass(numberOfInstances[0]);
		FileClass NewFile1 = new FileClass(numberOfInstances[1]);
		FileClass NewFile2 = new FileClass(numberOfInstances[2]);
		FileClass NewFile3 = new FileClass(numberOfInstances[3]);
		FileClass NewFile4 = new FileClass(numberOfInstances[4]);
		FileClass NewFile5 = new FileClass(numberOfInstances[5]);
		FileClass NewFile6 = new FileClass(numberOfInstances[6]);
		FileClass NewFile7 = new FileClass(numberOfInstances[7]);
		FileClass NewFile8 = new FileClass(numberOfInstances[8]);
		FileClass NewFile9 = new FileClass(numberOfInstances[9]);
		FileClass NewFile10 = new FileClass(numberOfInstances[10]);
		FileClass NewFile11 = new FileClass(numberOfInstances[11]);
		
		
		int [] Αcounters = new int [12];
		int [] Bcounters = new int [12];
		int [] Ccounters = new int [12];
		
		long [] Atimer = new long [12]; 
		long [] Btimer = new long [12];
		long [] Ctimer = new long [12];
		
		
		
/////////////////////////////////////////////// DHMIOURGIA ARXEION ///////////////////////////////////////////////////////////////////////////////////////////////////
		
			/////////////////////////////////Dhmiourgia arxeion RawData GIA 59 MEGETHOS /////////////////////////////////////////////////////////
		
		RandomAccessFile DataFile0 = NewFile0.writeRecordsToFile("SavedData0",data0,4);
		RandomAccessFile DataFile1 = NewFile1.writeRecordsToFile("SavedData1",data1,4);
		RandomAccessFile DataFile2 = NewFile2.writeRecordsToFile("SavedData2",data2,4);
		RandomAccessFile DataFile3 = NewFile3.writeRecordsToFile("SavedData3",data3,4);
		RandomAccessFile DataFile4 = NewFile4.writeRecordsToFile("SavedData4",data4,4);
		RandomAccessFile DataFile5 = NewFile5.writeRecordsToFile("SavedData5",data5,4);
		RandomAccessFile DataFile6 = NewFile6.writeRecordsToFile("SavedData6",data6,4);
		RandomAccessFile DataFile7 = NewFile7.writeRecordsToFile("SavedData7",data7,4);
		RandomAccessFile DataFile8 = NewFile8.writeRecordsToFile("SavedData8",data8,4);
		RandomAccessFile DataFile9 = NewFile9.writeRecordsToFile("SavedData9",data9,4);
		RandomAccessFile DataFile10 = NewFile10.writeRecordsToFile("SavedData10",data10,4);
		RandomAccessFile DataFile11 = NewFile11.writeRecordsToFile("SavedData11",data11,4);
		
			//////////////////////////////////////////////////////////Dhmiourgia arxeion IndexFile////////////////////////////////////////////////////////// 
		
		RandomAccessFile IndexFile0 = NewFile0.writeIndexFile("Unsorted Index File0");
		RandomAccessFile IndexFile1 = NewFile1.writeIndexFile("Unsorted Index File1");
		RandomAccessFile IndexFile2 = NewFile2.writeIndexFile("Unsorted Index File2");
		RandomAccessFile IndexFile3 = NewFile3.writeIndexFile("Unsorted Index File3");
		RandomAccessFile IndexFile4 = NewFile4.writeIndexFile("Unsorted Index File4");
		RandomAccessFile IndexFile5 = NewFile5.writeIndexFile("Unsorted Index File5");
		RandomAccessFile IndexFile6 = NewFile6.writeIndexFile("Unsorted Index File6");
		RandomAccessFile IndexFile7 = NewFile7.writeIndexFile("Unsorted Index File7");
		RandomAccessFile IndexFile8 = NewFile8.writeIndexFile("Unsorted Index File8");
		RandomAccessFile IndexFile9 = NewFile9.writeIndexFile("Unsorted Index File9");
		RandomAccessFile IndexFile10 = NewFile10.writeIndexFile("Unsorted Index File10");
		RandomAccessFile IndexFile11 = NewFile11.writeIndexFile("Unsorted Index File11");
		
		
			//////////////////////////////////////////////////////////Dhmiourgia arxeion SortedIndexFile////////////////////////////////////////////////////////// 
		
		NewFile0.sortPairs();
		RandomAccessFile SortedIndexFile0 = NewFile0.writeIndexFile("Sorted Index File0");
		int numofDataPages0 = NewFile0.findFileLength(SortedIndexFile0);



		NewFile1.sortPairs();
		RandomAccessFile SortedIndexFile1 = NewFile1.writeIndexFile("Sorted Index File1");
		int numofDataPages1 = NewFile1.findFileLength(SortedIndexFile1);



		NewFile2.sortPairs();
		RandomAccessFile SortedIndexFile2 = NewFile2.writeIndexFile("Sorted Index File2");
		int numofDataPages2 = NewFile2.findFileLength(SortedIndexFile2);



		NewFile3.sortPairs();
		RandomAccessFile SortedIndexFile3 = NewFile3.writeIndexFile("Sorted Index File3");
		int numofDataPages3 = NewFile3.findFileLength(SortedIndexFile3);
		
		

		NewFile4.sortPairs();
		RandomAccessFile SortedIndexFile4 = NewFile4.writeIndexFile("Sorted Index File4");
		int numofDataPages4 = NewFile4.findFileLength(SortedIndexFile4);



		NewFile5.sortPairs();
		RandomAccessFile SortedIndexFile5 = NewFile5.writeIndexFile("Sorted Index File5");
		int numofDataPages5 = NewFile5.findFileLength(SortedIndexFile5);



		NewFile6.sortPairs();
		RandomAccessFile SortedIndexFile6 = NewFile6.writeIndexFile("Sorted Index File6");
		int numofDataPages6 = NewFile6.findFileLength(SortedIndexFile6);



		NewFile7.sortPairs();
		RandomAccessFile SortedIndexFile7 = NewFile7.writeIndexFile("Sorted Index File7");
		int numofDataPages7 = NewFile7.findFileLength(SortedIndexFile7);


		NewFile8.sortPairs();
		RandomAccessFile SortedIndexFile8 = NewFile8.writeIndexFile("Sorted Index File8");
		int numofDataPages8 = NewFile8.findFileLength(SortedIndexFile8);


		NewFile9.sortPairs();
		RandomAccessFile SortedIndexFile9 = NewFile9.writeIndexFile("Sorted Index File9");
		int numofDataPages9 = NewFile9.findFileLength(SortedIndexFile9);



		NewFile10.sortPairs();
		RandomAccessFile SortedIndexFile10 = NewFile10.writeIndexFile("Sorted Index File10");
		int numofDataPages10 = NewFile10.findFileLength(SortedIndexFile10);



		NewFile11.sortPairs();
		RandomAccessFile SortedIndexFile11 = NewFile11.writeIndexFile("Sorted Index File11");
		int numofDataPages11 = NewFile11.findFileLength(SortedIndexFile11);
		
		
		
		
/////////////////////////////////////////////// ANAZHTHSH ////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		
		
		
									for(int i=0; i<numOfSearches; i++) {
		
										System.out.println(i);
										
		Timer.start();
		NewFile0.searchDataPageforWantedKey(wantedKeys0[i],0, DataFile0,stringSize1);
		
		Αcounters[0] = Αcounters[0] + NewFile0.getCounter();
		Atimer[0] = Atimer[0] + Timer.stop();
		
		
		Timer.start();
		NewFile1.searchDataPageforWantedKey(wantedKeys1[i],0, DataFile1,stringSize1);	
		
		Αcounters[1] = Αcounters[1] + NewFile1.getCounter();
		Atimer[1] = Atimer[1] + Timer.stop();


		
		Timer.start();
		NewFile2.searchDataPageforWantedKey(wantedKeys2[i],0, DataFile2,stringSize1);
		
		Αcounters[2] = Αcounters[2] + NewFile2.getCounter();
		Atimer[2] = Atimer[2] + Timer.stop();
		
		
		
		Timer.start();
		NewFile3.searchDataPageforWantedKey(wantedKeys3[i],0, DataFile3,stringSize1);	
		
		Αcounters[3] = Αcounters[3] + NewFile3.getCounter();
		Atimer[3] = Atimer[3] + Timer.stop();
		

		
		Timer.start();
		NewFile4.searchDataPageforWantedKey(wantedKeys4[i],0, DataFile4,stringSize1);	
		
		Αcounters[4] = Αcounters[4] + NewFile4.getCounter();
		Atimer[4] = Atimer[4] + Timer.stop();

		
		Timer.start();
		NewFile5.searchDataPageforWantedKey(wantedKeys5[i],0, DataFile5,stringSize1);	
		
		Αcounters[5] = Αcounters[5] + NewFile5.getCounter();
		Atimer[5] = Atimer[5] + Timer.stop();

		
	
		Timer.start();
		NewFile6.searchDataPageforWantedKey(wantedKeys6[i],0, DataFile6,stringSize1);	
		
		Αcounters[6] = Αcounters[6] + NewFile6.getCounter();
		Atimer[6] = Atimer[6] + Timer.stop();

		
		Timer.start();
		NewFile7.searchDataPageforWantedKey(wantedKeys7[i],0, DataFile7,stringSize1);	
		
		Αcounters[7] = Αcounters[7] + NewFile7.getCounter();
		Atimer[7] = Atimer[7] + Timer.stop();

		
		Timer.start();
		NewFile8.searchDataPageforWantedKey(wantedKeys8[i],0, DataFile8,stringSize1);	
		Αcounters[8] = Αcounters[8] + NewFile8.getCounter();
		Atimer[8] = Atimer[8] + Timer.stop();
		

		
		Timer.start();
		NewFile9.searchDataPageforWantedKey(wantedKeys9[i],0, DataFile9,stringSize1);	
		Αcounters[9] = Αcounters[9] + NewFile9.getCounter();
		Atimer[9] = Atimer[9] + Timer.stop();

		
		Timer.start();
		NewFile10.searchDataPageforWantedKey(wantedKeys10[i],0, DataFile10,stringSize1);	
		Αcounters[10] = Αcounters[10] + NewFile10.getCounter();
		Atimer[10] = Atimer[10] + Timer.stop();
		

		
		Timer.start();
		NewFile11.searchDataPageforWantedKey(wantedKeys11[i],0, DataFile11,stringSize1);	
		Αcounters[11] = Αcounters[11] + NewFile11.getCounter();
		Atimer[11] = Atimer[11] + Timer.stop();

		
		
		
		//System.out.println("//////////////////////////////////// B TROPOS /////////////////////////////////////////////////////////////////////");
		
		NewFile0.resetCounter();
		NewFile1.resetCounter();
		NewFile2.resetCounter();
		NewFile3.resetCounter();
		NewFile4.resetCounter();
		NewFile5.resetCounter();
		NewFile6.resetCounter();
		NewFile7.resetCounter();
		NewFile8.resetCounter();
		NewFile9.resetCounter();
		NewFile10.resetCounter();
		NewFile11.resetCounter();
		
		//B  TROPOS
		
		Timer.start();
		NewFile0.searchDataPageforWantedPair(NewFile0.searchWholeIndexFile(wantedKeys0[i],IndexFile0),DataFile0,stringSize1);
		Bcounters[0] = Bcounters[0] + NewFile0.getCounter();
		Btimer[0] = Btimer[0] + Timer.stop();
		
		
		
		Timer.start();
		NewFile1.searchDataPageforWantedPair(NewFile1.searchWholeIndexFile(wantedKeys1[i],IndexFile1),DataFile1,stringSize1);
		Bcounters[1] = Bcounters[1] + NewFile1.getCounter();
		Btimer[1] = Btimer[1] + Timer.stop();
		
		
		
		Timer.start();
		NewFile2.searchDataPageforWantedPair(NewFile2.searchWholeIndexFile(wantedKeys2[i],IndexFile2),DataFile2,stringSize1);
		Bcounters[2] = Bcounters[2] + NewFile2.getCounter();
		Btimer[2] = Btimer[2] + Timer.stop();
		
		
		
		Timer.start();
		NewFile3.searchDataPageforWantedPair(NewFile3.searchWholeIndexFile(wantedKeys3[i],IndexFile3),DataFile3,stringSize1);
		Bcounters[3] = Bcounters[3] + NewFile3.getCounter();
		Btimer[3] = Btimer[3] + Timer.stop();
		
		
		
		
		Timer.start();
		NewFile4.searchDataPageforWantedPair(NewFile4.searchWholeIndexFile(wantedKeys4[i],IndexFile4),DataFile4,stringSize1);
		Bcounters[4] = Bcounters[4] + NewFile4.getCounter();
		Btimer[4] = Btimer[4] + Timer.stop();
		
		
		
		Timer.start();
		NewFile5.searchDataPageforWantedPair(NewFile5.searchWholeIndexFile(wantedKeys5[i],IndexFile5),DataFile5,stringSize1);
		Bcounters[5] = Bcounters[5] + NewFile5.getCounter();
		Btimer[5] = Btimer[5] + Timer.stop();
		
		
		
		Timer.start();
		NewFile6.searchDataPageforWantedPair(NewFile6.searchWholeIndexFile(wantedKeys6[i],IndexFile6),DataFile6,stringSize1);
		Bcounters[6] = Bcounters[6] + NewFile6.getCounter();
		Btimer[6] = Btimer[6] + Timer.stop();
		
		
		
		Timer.start();
		NewFile7.searchDataPageforWantedPair(NewFile7.searchWholeIndexFile(wantedKeys7[i],IndexFile7),DataFile7,stringSize1);
		Bcounters[7] = Bcounters[7] + NewFile7.getCounter();
		Btimer[7] = Btimer[7] + Timer.stop();
		
		
		
		Timer.start();
		NewFile8.searchDataPageforWantedPair(NewFile8.searchWholeIndexFile(wantedKeys8[i],IndexFile8),DataFile8,stringSize1);
		Bcounters[8] = Bcounters[8] + NewFile8.getCounter();
		Btimer[8] = Btimer[8] + Timer.stop();
		
		
		
		Timer.start();
		NewFile9.searchDataPageforWantedPair(NewFile9.searchWholeIndexFile(wantedKeys9[i],IndexFile9),DataFile9,stringSize1);
		Bcounters[9] = Bcounters[9] + NewFile9.getCounter();
		Btimer[9] = Btimer[9] + Timer.stop();
		
		
		
		Timer.start();
		NewFile10.searchDataPageforWantedPair(NewFile10.searchWholeIndexFile(wantedKeys10[i],IndexFile10),DataFile10,stringSize1);
		Bcounters[10] = Bcounters[10] + NewFile10.getCounter();
		Btimer[10] = Btimer[10] + Timer.stop();
		
		
		
		Timer.start();
		NewFile11.searchDataPageforWantedPair(NewFile11.searchWholeIndexFile(wantedKeys11[i],IndexFile11),DataFile11,stringSize1);
		Bcounters[11] = Bcounters[11] + NewFile11.getCounter();
		Btimer[11] = Btimer[11] + Timer.stop();


				
		
		
		//System.out.println("////////////////////////////////////  TROPOS /////////////////////////////////////////////////////////////////////");
		
		
		// Γ TROPOS 
		
		NewFile0.resetCounter();
		NewFile1.resetCounter();
		NewFile2.resetCounter();
		NewFile3.resetCounter();
		NewFile4.resetCounter();
		NewFile5.resetCounter();
		NewFile6.resetCounter();
		NewFile7.resetCounter();
		NewFile8.resetCounter();
		NewFile9.resetCounter();
		NewFile10.resetCounter();
		NewFile11.resetCounter();
		
		
		Timer.start();
		KeyDataPagePair Pair0 = NewFile0.BinarySearchIndexFile(wantedKeys0[i], SortedIndexFile0, 1 , numofDataPages0);
		if (Pair0!=null) {
			NewFile0.searchDataPageforWantedPair(Pair0, DataFile0,stringSize1);
			Ccounters[0] = Ccounters[0] + NewFile0.getCounter();
			Ctimer[0] = Ctimer[0] + Timer.stop();}
		else {Ccounters[0] = Ccounters[0] + NewFile0.getCounter();
		Ctimer[0] = Ctimer[0] + Timer.stop();}	
		
			
			
		Timer.start();
		KeyDataPagePair Pair1 = NewFile1.BinarySearchIndexFile(wantedKeys1[i], SortedIndexFile1, 1 , numofDataPages1);
			if (Pair1!=null) {
				NewFile1.searchDataPageforWantedPair(Pair1, DataFile1,stringSize1);
				Ccounters[1] = Ccounters[1] + NewFile1.getCounter();
				Ctimer[1] = Ctimer[1] + Timer.stop();
					}
			else {Ccounters[1] = Ccounters[1] + NewFile1.getCounter();
			Ctimer[1] = Ctimer[1] + Timer.stop();}		
		
		
			
		Timer.start();
		KeyDataPagePair Pair2 = NewFile2.BinarySearchIndexFile(wantedKeys2[i], SortedIndexFile2, 1 , numofDataPages2);
				if (Pair2!=null) {
					NewFile2.searchDataPageforWantedPair(Pair2, DataFile2,stringSize1);
					Ccounters[2] = Ccounters[2] + NewFile2.getCounter();
					Ctimer[2] = Ctimer[2] + Timer.stop();}
				else {Ccounters[2] = Ccounters[2] + NewFile2.getCounter();
				Ctimer[2] = Ctimer[2] + Timer.stop();}
				
			
		Timer.start();
		KeyDataPagePair Pair3 = NewFile3.BinarySearchIndexFile(wantedKeys3[i], SortedIndexFile3, 1, numofDataPages3);
			if (Pair3 != null) {
					   NewFile3.searchDataPageforWantedPair(Pair3, DataFile3, stringSize1);
					   Ccounters[3] = Ccounters[3] + NewFile3.getCounter();
					   Ctimer[3] = Ctimer[3] + Timer.stop();}
			else {Ccounters[3] = Ccounters[3] + NewFile3.getCounter();
			Ctimer[3] = Ctimer[3] + Timer.stop();}

				
					
		Timer.start();
		KeyDataPagePair Pair4 = NewFile4.BinarySearchIndexFile(wantedKeys4[i], SortedIndexFile4, 1, numofDataPages4);
					if (Pair4 != null) {
					    NewFile4.searchDataPageforWantedPair(Pair4, DataFile4, stringSize1);
					    Ccounters[4] = Ccounters[4] + NewFile4.getCounter();
					    Ctimer[4] = Ctimer[4] + Timer.stop();
					}
					else {Ccounters[4] = Ccounters[4] + NewFile4.getCounter();
					Ctimer[4] = Ctimer[4] + Timer.stop();}				

					
		Timer.start();
		KeyDataPagePair Pair5 = NewFile5.BinarySearchIndexFile(wantedKeys5[i], SortedIndexFile5, 1, numofDataPages5);
					if (Pair5 != null) {
					    NewFile5.searchDataPageforWantedPair(Pair5, DataFile5, stringSize1);
					    Ccounters[5] = Ccounters[5] + NewFile5.getCounter();
					    Ctimer[5] = Ctimer[5] + Timer.stop();
					}
					else {Ccounters[5] = Ccounters[5] + NewFile5.getCounter();
					Ctimer[5] = Ctimer[5] + Timer.stop();
}
					
					
					
		Timer.start();
		KeyDataPagePair Pair6 = NewFile6.BinarySearchIndexFile(wantedKeys6[i], SortedIndexFile6, 1, numofDataPages6);
					if (Pair6 != null) {
					    NewFile6.searchDataPageforWantedPair(Pair6, DataFile6, stringSize1);
					    Ccounters[6] = Ccounters[6] + NewFile6.getCounter();
					    Ctimer[6] = Ctimer[6] + Timer.stop();}
					else {Ccounters[6] = Ccounters[6] + NewFile6.getCounter();
					Ctimer[6] = Ctimer[6] + Timer.stop();}
		
					
					
		Timer.start();			
		KeyDataPagePair Pair7 = NewFile7.BinarySearchIndexFile(wantedKeys7[i], SortedIndexFile7, 1, numofDataPages7);
					if (Pair7 != null) {
					    NewFile7.searchDataPageforWantedPair(Pair7, DataFile7, stringSize1);
					    Ccounters[7] = Ccounters[7] + NewFile7.getCounter();
					    Ctimer[7] = Ctimer[7] + Timer.stop();
					}
					else {Ccounters[7] = Ccounters[7] + NewFile7.getCounter();
					Ctimer[7] = Ctimer[7] + Timer.stop();
					}
					
					
		Timer.start();
		KeyDataPagePair Pair8 = NewFile8.BinarySearchIndexFile(wantedKeys8[i], SortedIndexFile8, 1, numofDataPages8);
					if (Pair8 != null) {
					    NewFile8.searchDataPageforWantedPair(Pair8, DataFile8, stringSize1);
					    Ccounters[8] = Ccounters[8] + NewFile8.getCounter();
					    Ctimer[8] = Ctimer[8] + Timer.stop();}
					else {Ccounters[8] = Ccounters[8] + NewFile8.getCounter();
					Ctimer[8] = Ctimer[8] + Timer.stop();}
					
		
					
					
		Timer.start();			
		KeyDataPagePair Pair9 = NewFile9.BinarySearchIndexFile(wantedKeys9[i], SortedIndexFile9, 1, numofDataPages9);
					if (Pair9 != null) {
					    NewFile9.searchDataPageforWantedPair(Pair9, DataFile9, stringSize1);
					    Ccounters[9] = Ccounters[9] + NewFile9.getCounter();
					    Ctimer[9] = Ctimer[9] + Timer.stop();
					}
					else {Ccounters[9] = Ccounters[9] + NewFile9.getCounter();
					 Ctimer[9] = Ctimer[9] + Timer.stop();}
		
					
		Timer.start();			
		KeyDataPagePair Pair10 = NewFile10.BinarySearchIndexFile(wantedKeys10[i], SortedIndexFile10, 1, numofDataPages10);
					if (Pair10 != null) {
					    NewFile10.searchDataPageforWantedPair(Pair10, DataFile10, stringSize1);
					    Ccounters[10] = Ccounters[10] + NewFile10.getCounter();
					    Ctimer[10] = Ctimer[10] + Timer.stop();}
					else {Ccounters[10] = Ccounters[10] + NewFile10.getCounter();
					 Ctimer[10] = Ctimer[10] + Timer.stop();}
		
					
					
		Timer.start();			
		KeyDataPagePair Pair11 = NewFile11.BinarySearchIndexFile(wantedKeys11[i], SortedIndexFile11, 1, numofDataPages11);
					if (Pair11 != null) {
					    NewFile11.searchDataPageforWantedPair(Pair11, DataFile11, stringSize1);
					    Ccounters[11] = Ccounters[11] + NewFile11.getCounter();
					    Ctimer[11] = Ctimer[11] + Timer.stop();}
					else {Ccounters[11] = Ccounters[11] + NewFile11.getCounter();
					Ctimer[11] = Ctimer[11] + Timer.stop();}
					
					
			
					
					
					
			} 
									
									
									
									
							
									
									
									
									
									
									
									
									
									
									
									
									
									
									
									
									
									
									
									
		

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		
		
		DataClass[] data0b = new DataClass[numberOfInstances[0]];
		DataClass[] data1b = new DataClass[numberOfInstances[1]];
		DataClass[] data2b = new DataClass[numberOfInstances[2]];
		DataClass[] data3b = new DataClass[numberOfInstances[3]];
		DataClass[] data4b = new DataClass[numberOfInstances[4]];
		DataClass[] data5b = new DataClass[numberOfInstances[5]];
		DataClass[] data6b = new DataClass[numberOfInstances[6]];
		DataClass[] data7b = new DataClass[numberOfInstances[7]];
		DataClass[] data8b = new DataClass[numberOfInstances[8]];
		DataClass[] data9b = new DataClass[numberOfInstances[9]];
		DataClass[] data10b = new DataClass[numberOfInstances[10]];
		DataClass[] data11b = new DataClass[numberOfInstances[11]];
		
		
		
		
		
		
		
		
		
		
		
		
		for(int i=0; i<numberOfInstances[0]; i++) {
			data0b[i] = new DataClass(UniqueKeys0[i],RandomGenerator.GenerateString(stringSize2)); 
		}
		
		
		for(int i=0; i<numberOfInstances[1]; i++) {
			data1b[i] = new DataClass(UniqueKeys1[i],RandomGenerator.GenerateString(stringSize2)); 
		}
		
		
		for(int i=0; i<numberOfInstances[2]; i++) {
			data2b[i] = new DataClass(UniqueKeys2[i],RandomGenerator.GenerateString(stringSize2)); 
		}
		
		
		for(int i=0; i<numberOfInstances[3]; i++) {
			data3b[i] = new DataClass(UniqueKeys3[i],RandomGenerator.GenerateString(stringSize2)); 
		}
		
		
		for(int i=0; i<numberOfInstances[4]; i++) {
			data4b[i] = new DataClass(UniqueKeys4[i],RandomGenerator.GenerateString(stringSize2)); 
		}
		
		for(int i=0; i<numberOfInstances[5]; i++) {
			data5b[i] = new DataClass(UniqueKeys5[i],RandomGenerator.GenerateString(stringSize2)); 
		}
		
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		
		for(int i=0; i<numberOfInstances[6]; i++) {
			data6b[i] = new DataClass(UniqueKeys6[i],RandomGenerator.GenerateString(stringSize2)); 
		}
		
		for(int i=0; i<numberOfInstances[7]; i++) {
			data7b[i] = new DataClass(UniqueKeys7[i],RandomGenerator.GenerateString(stringSize2)); 
		}
		
		for(int i=0; i<numberOfInstances[8]; i++) {
			data8b[i] = new DataClass(UniqueKeys8[i],RandomGenerator.GenerateString(stringSize2)); 
		}
		
		for(int i=0; i<numberOfInstances[9]; i++) {
			data9b[i] = new DataClass(UniqueKeys9[i],RandomGenerator.GenerateString(stringSize2)); 
		}
		
		for(int i=0; i<numberOfInstances[10]; i++) {
			data10b[i] = new DataClass(UniqueKeys10[i],RandomGenerator.GenerateString(stringSize2)); 
		}
		
		for(int i=0; i<numberOfInstances[11]; i++) {
			data11b[i] = new DataClass(UniqueKeys11[i],RandomGenerator.GenerateString(stringSize2)); 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
 							
 
									FileClass NewFile0b = new FileClass(numberOfInstances[0]);
									FileClass NewFile1b = new FileClass(numberOfInstances[1]);
									FileClass NewFile2b = new FileClass(numberOfInstances[2]);
									FileClass NewFile3b = new FileClass(numberOfInstances[3]);
									FileClass NewFile4b = new FileClass(numberOfInstances[4]);
									FileClass NewFile5b = new FileClass(numberOfInstances[5]);
									FileClass NewFile6b = new FileClass(numberOfInstances[6]);
									FileClass NewFile7b = new FileClass(numberOfInstances[7]);
									FileClass NewFile8b = new FileClass(numberOfInstances[8]);
									FileClass NewFile9b = new FileClass(numberOfInstances[9]);
									FileClass NewFile10b = new FileClass(numberOfInstances[10]);
									FileClass NewFile11b = new FileClass(numberOfInstances[11]);
									
									
									int [] Αcountersb = new int [12];
									int [] Bcountersb = new int [12];
									int [] Ccountersb = new int [12];
									
									long [] Atimerb = new long [12]; 
									long [] Btimerb = new long [12];
									long [] Ctimerb = new long [12];	
									
									
/////////////////////////////////////////////// DHMIOURGIA ARXEION ///////////////////////////////////////////////////////////////////////////////////////////////////
									
	/*****************************************Dhmiourgia arxeion RawData GIA 31 MEGETHOS **********************************************************/
									
									
									
									RandomAccessFile DataFile0b = NewFile0b.writeRecordsToFile("SavedData0b",data0b,8);
									RandomAccessFile DataFile1b = NewFile1b.writeRecordsToFile("SavedData1b",data1b,8);
									RandomAccessFile DataFile2b = NewFile2b.writeRecordsToFile("SavedData2b",data2b,8);
									RandomAccessFile DataFile3b = NewFile3b.writeRecordsToFile("SavedData3b",data3b,8);
									RandomAccessFile DataFile4b = NewFile4b.writeRecordsToFile("SavedData4b",data4b,8);
									RandomAccessFile DataFile5b = NewFile5b.writeRecordsToFile("SavedData5b",data5b,8);
									RandomAccessFile DataFile6b = NewFile6b.writeRecordsToFile("SavedData6b",data6b,8);
									RandomAccessFile DataFile7b = NewFile7b.writeRecordsToFile("SavedData7b",data7b,8);
									RandomAccessFile DataFile8b = NewFile8b.writeRecordsToFile("SavedData8b",data8b,8);
									RandomAccessFile DataFile9b = NewFile9b.writeRecordsToFile("SavedData9b",data9b,8);
									RandomAccessFile DataFile10b = NewFile10b.writeRecordsToFile("SavedData10b",data10b,8);
									RandomAccessFile DataFile11b = NewFile11b.writeRecordsToFile("SavedData11b",data11b,8);
									
										/*****************************************Dhmiourgia arxeion IndexFile**********************************************************/
									
									RandomAccessFile IndexFile0b = NewFile0b.writeIndexFile("Unsorted Index File0b");
									RandomAccessFile IndexFile1b = NewFile1b.writeIndexFile("Unsorted Index File1b");
									RandomAccessFile IndexFile2b = NewFile2b.writeIndexFile("Unsorted Index File2b");
									RandomAccessFile IndexFile3b = NewFile3b.writeIndexFile("Unsorted Index File3b");
									RandomAccessFile IndexFile4b = NewFile4b.writeIndexFile("Unsorted Index File4b");
									RandomAccessFile IndexFile5b = NewFile5b.writeIndexFile("Unsorted Index File5b");
									RandomAccessFile IndexFile6b = NewFile6b.writeIndexFile("Unsorted Index File6b");
									RandomAccessFile IndexFile7b = NewFile7b.writeIndexFile("Unsorted Index File7b");
									RandomAccessFile IndexFile8b = NewFile8b.writeIndexFile("Unsorted Index File8b");
									RandomAccessFile IndexFile9b = NewFile9b.writeIndexFile("Unsorted Index File9b");
									RandomAccessFile IndexFile10b = NewFile10b.writeIndexFile("Unsorted Index File10b");
									RandomAccessFile IndexFile11b = NewFile11b.writeIndexFile("Unsorted Index File11b");
									
									
										/*****************************************Dhmiourgia arxeion SortedIndexFile**********************************************************/
									
									NewFile0b.sortPairs();
									RandomAccessFile SortedIndexFile0b = NewFile0b.writeIndexFile("Sorted Index File0b");
									int numofDataPages0b = NewFile0b.findFileLength(SortedIndexFile0b);



									NewFile1b.sortPairs();
									RandomAccessFile SortedIndexFile1b = NewFile1b.writeIndexFile("Sorted Index File1b");
									int numofDataPages1b = NewFile1b.findFileLength(SortedIndexFile1b);



									NewFile2b.sortPairs();
									RandomAccessFile SortedIndexFile2b = NewFile2b.writeIndexFile("Sorted Index File2b");
									int numofDataPages2b = NewFile2b.findFileLength(SortedIndexFile2b);



									NewFile3b.sortPairs();
									RandomAccessFile SortedIndexFile3b = NewFile3b.writeIndexFile("Sorted Index File3b");
									int numofDataPages3b = NewFile3b.findFileLength(SortedIndexFile3b);
									
									

									NewFile4b.sortPairs();
									RandomAccessFile SortedIndexFile4b = NewFile4b.writeIndexFile("Sorted Index File4b");
									int numofDataPages4b = NewFile4b.findFileLength(SortedIndexFile4b);



									NewFile5b.sortPairs();
									RandomAccessFile SortedIndexFile5b = NewFile5b.writeIndexFile("Sorted Index File5b");
									int numofDataPages5b = NewFile5b.findFileLength(SortedIndexFile5b);



									NewFile6b.sortPairs();
									RandomAccessFile SortedIndexFile6b = NewFile6b.writeIndexFile("Sorted Index File6b");
									int numofDataPages6b = NewFile6b.findFileLength(SortedIndexFile6b);



									NewFile7b.sortPairs();
									RandomAccessFile SortedIndexFile7b = NewFile7b.writeIndexFile("Sorted Index File7b");
									int numofDataPages7b = NewFile7b.findFileLength(SortedIndexFile7b);


									NewFile8b.sortPairs();
									RandomAccessFile SortedIndexFile8b = NewFile8b.writeIndexFile("Sorted Index File8b");
									int numofDataPages8b = NewFile8b.findFileLength(SortedIndexFile8b);


									NewFile9b.sortPairs();
									RandomAccessFile SortedIndexFile9b = NewFile9b.writeIndexFile("Sorted Index File9b");
									int numofDataPages9b = NewFile9b.findFileLength(SortedIndexFile9b);



									NewFile10b.sortPairs();
									RandomAccessFile SortedIndexFile10b = NewFile10b.writeIndexFile("Sorted Index File10b");
									int numofDataPages10b = NewFile10b.findFileLength(SortedIndexFile10b);



									NewFile11b.sortPairs();
									RandomAccessFile SortedIndexFile11b = NewFile11b.writeIndexFile("Sorted Index File11b");
									int numofDataPages11b = NewFile11b.findFileLength(SortedIndexFile11b);
																	
									
									
									
									
									System.out.println(" 27 bytes tora");
									
									for(int i=0; i<numOfSearches; i++) {
		
										System.out.println(i);
										
		Timer.start();
		NewFile0b.searchDataPageforWantedKey(wantedKeys0[i],0, DataFile0b,stringSize2);
		
		Αcountersb[0] = Αcountersb[0] + NewFile0b.getCounter();
		Atimerb[0] = Atimerb[0] + Timer.stop();
		
		
		Timer.start();
		NewFile1b.searchDataPageforWantedKey(wantedKeys1[i],0, DataFile1b,stringSize2);	
		
		Αcountersb[1] = Αcountersb[1] + NewFile1b.getCounter();
		Atimerb[1] = Atimerb[1] + Timer.stop();


		
		Timer.start();
		NewFile2b.searchDataPageforWantedKey(wantedKeys2[i],0, DataFile2b,stringSize2);
		
		Αcountersb[2] = Αcountersb[2] + NewFile2b.getCounter();
		Atimerb[2] = Atimerb[2] + Timer.stop();
		
		
		
		Timer.start();
		NewFile3b.searchDataPageforWantedKey(wantedKeys3[i],0, DataFile3b,stringSize2);	
		
		Αcountersb[3] = Αcountersb[3] + NewFile3b.getCounter();
		Atimerb[3] = Atimerb[3] + Timer.stop();
		

		
		Timer.start();
		NewFile4b.searchDataPageforWantedKey(wantedKeys4[i],0, DataFile4b,stringSize2);	
		
		Αcountersb[4] = Αcountersb[4] + NewFile4b.getCounter();
		Atimerb[4] = Atimerb[4] + Timer.stop();

		
		Timer.start();
		NewFile5b.searchDataPageforWantedKey(wantedKeys5[i],0, DataFile5b,stringSize2);	
		
		Αcountersb[5] = Αcountersb[5] + NewFile5b.getCounter();
		Atimerb[5] = Atimerb[5] + Timer.stop();

		
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		Timer.start();
		NewFile6b.searchDataPageforWantedKey(wantedKeys6[i],0, DataFile6b,stringSize2);	
		
		Αcountersb[6] = Αcountersb[6] + NewFile6b.getCounter();
		Atimerb[6] = Atimerb[6] + Timer.stop();

		
		Timer.start();
		NewFile7b.searchDataPageforWantedKey(wantedKeys7[i],0, DataFile7b,stringSize2);	
		
		Αcountersb[7] = Αcountersb[7] + NewFile7b.getCounter();
		Atimerb[7] = Atimerb[7] + Timer.stop();

		
		Timer.start();
		NewFile8b.searchDataPageforWantedKey(wantedKeys8[i],0, DataFile8b,stringSize2);	
		Αcountersb[8] = Αcountersb[8] + NewFile8b.getCounter();
		Atimerb[8] = Atimerb[8] + Timer.stop();
		

		
		Timer.start();
		NewFile9b.searchDataPageforWantedKey(wantedKeys9[i],0, DataFile9b,stringSize2);	
		Αcountersb[9] = Αcountersb[9] + NewFile9b.getCounter();
		Atimerb[9] = Atimerb[9] + Timer.stop();

		
		Timer.start();
		NewFile10b.searchDataPageforWantedKey(wantedKeys10[i],0, DataFile10b,stringSize2);	
		Αcountersb[10] = Αcountersb[10] + NewFile10b.getCounter();
		Atimerb[10] = Atimerb[10] + Timer.stop();
		

		
		Timer.start();
		NewFile11b.searchDataPageforWantedKey(wantedKeys11[i],0, DataFile11b,stringSize2);	
		Αcountersb[11] = Αcountersb[11] + NewFile11b.getCounter();
		Atimerb[11] = Atimerb[11] + Timer.stop();

		
		
		
		//System.out.println("//////////////////////////////////// B TROPOS /////////////////////////////////////////////////////////////////////");
		
		NewFile0b.resetCounter();
		NewFile1b.resetCounter();
		NewFile2b.resetCounter();
		NewFile3b.resetCounter();
		NewFile4b.resetCounter();
		NewFile5b.resetCounter();
		NewFile6b.resetCounter();
		NewFile7b.resetCounter();
		NewFile8b.resetCounter();
		NewFile9b.resetCounter();
		NewFile10b.resetCounter();
		NewFile11b.resetCounter();
		
		//B  TROPOS
		
		Timer.start();
		NewFile0b.searchDataPageforWantedPair(NewFile0b.searchWholeIndexFile(wantedKeys0[i],IndexFile0b),DataFile0b,stringSize2);
		Bcountersb[0] = Bcountersb[0] + NewFile0b.getCounter();
		Btimerb[0] = Btimerb[0] + Timer.stop();
		
		
		
		Timer.start();
		NewFile1b.searchDataPageforWantedPair(NewFile1b.searchWholeIndexFile(wantedKeys1[i],IndexFile1b),DataFile1b,stringSize2);
		Bcountersb[1] = Bcountersb[1] + NewFile1b.getCounter();
		Btimerb[1] = Btimerb[1] + Timer.stop();
		
		
		
		Timer.start();
		NewFile2b.searchDataPageforWantedPair(NewFile2b.searchWholeIndexFile(wantedKeys2[i],IndexFile2b),DataFile2b,stringSize2);
		Bcountersb[2] = Bcountersb[2] + NewFile2b.getCounter();
		Btimerb[2] = Btimerb[2] + Timer.stop();
		
		
		
		Timer.start();
		NewFile3b.searchDataPageforWantedPair(NewFile3b.searchWholeIndexFile(wantedKeys3[i],IndexFile3b),DataFile3b,stringSize2);
		Bcountersb[3] = Bcountersb[3] + NewFile3b.getCounter();
		Btimerb[3] = Btimerb[3] + Timer.stop();
		
		
		
		
		Timer.start();
		NewFile4b.searchDataPageforWantedPair(NewFile4b.searchWholeIndexFile(wantedKeys4[i],IndexFile4b),DataFile4b,stringSize2);
		Bcountersb[4] = Bcountersb[4] + NewFile4b.getCounter();
		Btimerb[4] = Btimerb[4] + Timer.stop();
		
		
		
		Timer.start();
		NewFile5b.searchDataPageforWantedPair(NewFile5b.searchWholeIndexFile(wantedKeys5[i],IndexFile5b),DataFile5b,stringSize2);
		Bcountersb[5] = Bcountersb[5] + NewFile5b.getCounter();
		Btimerb[5] = Btimerb[5] + Timer.stop();
		
		
		
		Timer.start();
		NewFile6b.searchDataPageforWantedPair(NewFile6b.searchWholeIndexFile(wantedKeys6[i],IndexFile6b),DataFile6b,stringSize2);
		Bcountersb[6] = Bcountersb[6] + NewFile6b.getCounter();
		Btimerb[6] = Btimerb[6] + Timer.stop();
		
		
		
		Timer.start();
		NewFile7b.searchDataPageforWantedPair(NewFile7b.searchWholeIndexFile(wantedKeys7[i],IndexFile7b),DataFile7b,stringSize2);
		Bcountersb[7] = Bcountersb[7] + NewFile7b.getCounter();
		Btimerb[7] = Btimerb[7] + Timer.stop();
		
		
		
		Timer.start();
		NewFile8b.searchDataPageforWantedPair(NewFile8b.searchWholeIndexFile(wantedKeys8[i],IndexFile8b),DataFile8b,stringSize2);
		Bcountersb[8] = Bcountersb[8] + NewFile8b.getCounter();
		Btimerb[8] = Btimerb[8] + Timer.stop();
		
		
		
		Timer.start();
		NewFile9b.searchDataPageforWantedPair(NewFile9b.searchWholeIndexFile(wantedKeys9[i],IndexFile9b),DataFile9b,stringSize2);
		Bcountersb[9] = Bcountersb[9] + NewFile9b.getCounter();
		Btimerb[9] = Btimerb[9] + Timer.stop();
		
		
		
		Timer.start();
		NewFile10b.searchDataPageforWantedPair(NewFile10b.searchWholeIndexFile(wantedKeys10[i],IndexFile10b),DataFile10b,stringSize2);
		Bcountersb[10] = Bcountersb[10] + NewFile10b.getCounter();
		Btimerb[10] = Btimerb[10] + Timer.stop();
		
		
		
		Timer.start();
		NewFile11b.searchDataPageforWantedPair(NewFile11b.searchWholeIndexFile(wantedKeys11[i],IndexFile11b),DataFile11b,stringSize2);
		Bcountersb[11] = Bcountersb[11] + NewFile11b.getCounter();
		Btimerb[11] = Btimerb[11] + Timer.stop();


				
		
		
		//System.out.println("////////////////////////////////////  TROPOS /////////////////////////////////////////////////////////////////////");
		
		
		// Γ TROPOS 
		
		NewFile0b.resetCounter();
		NewFile1b.resetCounter();
		NewFile2b.resetCounter();
		NewFile3b.resetCounter();
		NewFile4b.resetCounter();
		NewFile5b.resetCounter();
		NewFile6b.resetCounter();
		NewFile7b.resetCounter();
		NewFile8b.resetCounter();
		NewFile9b.resetCounter();
		NewFile10b.resetCounter();
		NewFile11b.resetCounter();
		
		
		Timer.start();
		KeyDataPagePair Pair0b = NewFile0b.BinarySearchIndexFile(wantedKeys0[i], SortedIndexFile0b, 1 , numofDataPages0b);
		if (Pair0b!=null) {
			NewFile0b.searchDataPageforWantedPair(Pair0b, DataFile0b,stringSize2);
			Ccountersb[0] = Ccountersb[0] + NewFile0b.getCounter();
			Ctimerb[0] = Ctimerb[0] + Timer.stop();}
		else {Ccountersb[0] = Ccountersb[0] + NewFile0b.getCounter();
		Ctimerb[0] = Ctimerb[0] + Timer.stop();}	
		
			
			
		Timer.start();
		KeyDataPagePair Pair1b = NewFile1b.BinarySearchIndexFile(wantedKeys1[i], SortedIndexFile1b, 1 , numofDataPages1b);
			if (Pair1b!=null) {
				NewFile1b.searchDataPageforWantedPair(Pair1b, DataFile1b,stringSize2);
				Ccountersb[1] = Ccountersb[1] + NewFile1b.getCounter();
				Ctimerb[1] = Ctimerb[1] + Timer.stop();
					}
			else {Ccountersb[1] = Ccountersb[1] + NewFile1b.getCounter();
			Ctimerb[1] = Ctimerb[1] + Timer.stop();}		
		
		
			
		Timer.start();
		KeyDataPagePair Pair2b = NewFile2b.BinarySearchIndexFile(wantedKeys2[i], SortedIndexFile2b, 1 , numofDataPages2b);
				if (Pair2b!=null) {
					NewFile2b.searchDataPageforWantedPair(Pair2b, DataFile2b,stringSize2);
					Ccountersb[2] = Ccountersb[2] + NewFile2b.getCounter();
					Ctimerb[2] = Ctimerb[2] + Timer.stop();}
				else {Ccountersb[2] = Ccountersb[2] + NewFile2b.getCounter();
				Ctimerb[2] = Ctimerb[2] + Timer.stop();}
				
			
		Timer.start();
		KeyDataPagePair Pair3b = NewFile3b.BinarySearchIndexFile(wantedKeys3[i], SortedIndexFile3b, 1, numofDataPages3b);
			if (Pair3b != null) {
					   NewFile3b.searchDataPageforWantedPair(Pair3b, DataFile3b, stringSize2);
					   Ccountersb[3] = Ccountersb[3] + NewFile3b.getCounter();
					   Ctimerb[3] = Ctimerb[3] + Timer.stop();}
			else {Ccountersb[3] = Ccountersb[3] + NewFile3b.getCounter();
			Ctimerb[3] = Ctimerb[3] + Timer.stop();}

				
					
		Timer.start();
		KeyDataPagePair Pair4b = NewFile4b.BinarySearchIndexFile(wantedKeys4[i], SortedIndexFile4b, 1, numofDataPages4b);
					if (Pair4b != null) {
					    NewFile4b.searchDataPageforWantedPair(Pair4b, DataFile4b, stringSize2);
					    Ccountersb[4] = Ccountersb[4] + NewFile4b.getCounter();
					    Ctimerb[4] = Ctimerb[4] + Timer.stop();
					}
					else {Ccountersb[4] = Ccountersb[4] + NewFile4b.getCounter();
					Ctimerb[4] = Ctimerb[4] + Timer.stop();}				

					
		Timer.start();
		KeyDataPagePair Pair5b = NewFile5b.BinarySearchIndexFile(wantedKeys5[i], SortedIndexFile5b, 1, numofDataPages5b);
					if (Pair5b != null) {
					    NewFile5b.searchDataPageforWantedPair(Pair5b, DataFile5b, stringSize2);
					    Ccountersb[5] = Ccountersb[5] + NewFile5b.getCounter();
					    Ctimerb[5] = Ctimerb[5] + Timer.stop();
					}
					else {Ccountersb[5] = Ccountersb[5] + NewFile5b.getCounter();
					Ctimerb[5] = Ctimerb[5] + Timer.stop();
}
					
					
					
		Timer.start();
		KeyDataPagePair Pair6b = NewFile6b.BinarySearchIndexFile(wantedKeys6[i], SortedIndexFile6b, 1, numofDataPages6b);
					if (Pair6b != null) {
					    NewFile6b.searchDataPageforWantedPair(Pair6b, DataFile6b, stringSize2);
					    Ccountersb[6] = Ccountersb[6] + NewFile6b.getCounter();
					    Ctimerb[6] = Ctimerb[6] + Timer.stop();}
					else {Ccountersb[6] = Ccountersb[6] + NewFile6b.getCounter();
					Ctimerb[6] = Ctimerb[6] + Timer.stop();}
		
					
					
		Timer.start();			
		KeyDataPagePair Pair7b = NewFile7b.BinarySearchIndexFile(wantedKeys7[i], SortedIndexFile7b, 1, numofDataPages7b);
					if (Pair7b != null) {
					    NewFile7b.searchDataPageforWantedPair(Pair7b, DataFile7b, stringSize2);
					    Ccountersb[7] = Ccountersb[7] + NewFile7b.getCounter();
					    Ctimerb[7] = Ctimerb[7] + Timer.stop();
					}
					else {Ccountersb[7] = Ccountersb[7] + NewFile7b.getCounter();
					Ctimerb[7] = Ctimerb[7] + Timer.stop();
					}
					
					
		Timer.start();
		KeyDataPagePair Pair8b = NewFile8b.BinarySearchIndexFile(wantedKeys8[i], SortedIndexFile8b, 1, numofDataPages8b);
					if (Pair8b != null) {
					    NewFile8b.searchDataPageforWantedPair(Pair8b, DataFile8b, stringSize2);
					    Ccountersb[8] = Ccountersb[8] + NewFile8b.getCounter();
					    Ctimerb[8] = Ctimerb[8] + Timer.stop();}
					else {Ccountersb[8] = Ccountersb[8] + NewFile8b.getCounter();
					Ctimerb[8] = Ctimerb[8] + Timer.stop();}
					
		
					
					
		Timer.start();			
		KeyDataPagePair Pair9b = NewFile9b.BinarySearchIndexFile(wantedKeys9[i], SortedIndexFile9b, 1, numofDataPages9b);
					if (Pair9b != null) {
					    NewFile9b.searchDataPageforWantedPair(Pair9b, DataFile9b, stringSize2);
					    Ccountersb[9] = Ccountersb[9] + NewFile9b.getCounter();
					    Ctimerb[9] = Ctimerb[9] + Timer.stop();
					}
					else {Ccountersb[9] = Ccountersb[9] + NewFile9b.getCounter();
					Ctimerb[9] = Ctimerb[9] + Timer.stop();}
		
					
		Timer.start();			
		KeyDataPagePair Pair10b = NewFile10b.BinarySearchIndexFile(wantedKeys10[i], SortedIndexFile10b, 1, numofDataPages10b);
					if (Pair10b != null) {
					    NewFile10b.searchDataPageforWantedPair(Pair10b, DataFile10b, stringSize2);
					    Ccountersb[10] = Ccountersb[10] + NewFile10b.getCounter();
					    Ctimerb[10] = Ctimerb[10] + Timer.stop();}
					else {Ccountersb[10] = Ccountersb[10] + NewFile10b.getCounter();
					Ctimerb[9] = Ctimerb[9] + Timer.stop();}
		
					
					
		Timer.start();			
		KeyDataPagePair Pair11b = NewFile11b.BinarySearchIndexFile(wantedKeys11[i], SortedIndexFile11b, 1, numofDataPages11b);
					if (Pair11b != null) {
					    NewFile11b.searchDataPageforWantedPair(Pair11b, DataFile11b, stringSize2);
					    Ccountersb[11] = Ccountersb[11] + NewFile11b.getCounter();
					    Ctimerb[11] = Ctimerb[11] + Timer.stop();}
					else {Ccountersb[11] = Ccountersb[11] + NewFile11b.getCounter();
					Ctimerb[11] = Ctimerb[11] + Timer.stop();}
					
						
			}										
									
		
		System.out.println("Pinakas Prosvaseon: \n");
								
		TableMaker.accessTable(numberOfInstances, Mean.divideBy1000(Αcounters),Mean.divideBy1000(Αcountersb), Mean.divideBy1000(Bcounters), Mean.divideBy1000(Bcountersb), Mean.divideBy1000(Ccounters), Mean.divideBy1000(Ccountersb));						
				
		System.out.println("\n Pinakas Xronon anazhthshs: \n");
		
		TableMaker.TimeTable(numberOfInstances, Mean.divideBy1000(Atimer),Mean.divideBy1000(Atimerb), Mean.divideBy1000(Btimer), Mean.divideBy1000(Btimerb), Mean.divideBy1000(Ctimer), Mean.divideBy1000(Ctimerb));
		
		
		 long end = System.currentTimeMillis();
		 float msec = end - start;
	      // converting it into seconds
	      float sec= msec/1000F;
	      // converting it into minutes
	      float minutes=sec/60F;
		
									
		System.out.println("To programma termatisthke se: " + minutes + " Lepta");
		}
		
		
	}
			
				

	