package mainPackage;

public class MeanFinder {

	
	
	public static double[] divideBy1000(int[] array) {
		
		double [] newArray = new double[array.length];
		
		for(int i=0; i<array.length; i++) {
			 newArray[i] = ((double) array[i]) / 1000.0;
			 newArray[i] = Math.round(array[i] * 100.0) / 100.0; // round to 2 decimal places
		}
		
		return newArray;
	}
	
	public static double[] divideBy1000(long[] array) {
		
		double [] newArray = new double[array.length];
		
		for(int i=0; i<array.length; i++) {
			 newArray[i] = ((double) array[i]) / 1000.0;
			 newArray[i] = Math.round(array[i] * 100.0) / 100.0; // round to 2 decimal places
		}
		
		return newArray;
	}
	
	
}
