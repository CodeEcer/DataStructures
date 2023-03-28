package mainPackage;

import java.io.RandomAccessFile;

public class DataPage {
	
	

	public static final int DataPageSize = 256;
	private java.nio.ByteBuffer dataPage;
	
	
	
	
	public DataPage() {
		
	}
	
	public static java.nio.ByteBuffer makeDataPage() {
		
		//Dhmiourgia alhuinoy DataPage
		java.nio.ByteBuffer dataPage = java.nio.ByteBuffer.allocate(DataPageSize);
		
		return dataPage; 
	}
	
	
	
}















