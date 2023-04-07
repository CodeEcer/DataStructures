package mainPackage;

public class Timer {
	  private static long startTime;
	  

	  public static void start() {
	    startTime = System.nanoTime();
	  }

	  
	  public static long stop() {
	    long stopTime = System.nanoTime();
	    long elapsedTime = stopTime - startTime;
	    startTime = 0; // reset start time for next measurement
	    return elapsedTime;
	  }
	}