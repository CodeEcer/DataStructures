package mainPackage;


import java.nio.ByteBuffer;

public class DataClass {

	private int key;
	private String data;
	
	
	public DataClass(int key, String data) {
		this.key= key;
		this.data = data;
		
	}

	public ByteBuffer convertStringToBytes() {
		java.nio.ByteBuffer byteArray = java.nio.ByteBuffer.allocate(this.data.length());
		
		byteArray.put(this.getData().getBytes(java.nio.charset.StandardCharsets.US_ASCII));
		
		return byteArray;

	}
	

	public int getKey() {
		return key;
	}


	public void setKey(int key) {
		this.key = key;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}
	
	
	
}
