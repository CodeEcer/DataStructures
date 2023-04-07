package mainPackage;

public class Mean {
	
	public static double[] divideBy1000(int [] array) {
		double[] doubleArray = new double[array.length];

		for (int i = 0; i < array.length; i++) {
		    doubleArray[i] = ((double) array[i]) / 1000.0;
		    doubleArray[i] = Math.round(doubleArray[i] * 100.0) / 100.0; // round to 2 decimal places
		    
		    
		}
		return doubleArray;
	}
	
	public static double[] divideBy1000(long[] array) {
		double[] doubleArray = new double[array.length];

		for (int i = 0; i < array.length; i++) {
		    doubleArray[i] = ((double) array[i]) / 1000.0;
		    doubleArray[i] = Math.round(doubleArray[i] * 100.0) / 100.0; // round to 2 decimal places
		    
		    
		}
		return doubleArray;
	}
}
