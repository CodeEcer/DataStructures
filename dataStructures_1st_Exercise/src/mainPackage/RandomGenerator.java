package mainPackage;

public class RandomGenerator {



	public static String GenerateString(int sizeOfString) {
		
		//Code from GeekforGeeks https://www.geeksforgeeks.org/generate-random-string-of-given-size-in-java/ given from the exercise
		
		// choose a Character random from this String
		  String RandomString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		         + "0123456789"
		         + "abcdefghijklmnopqrstuvxyz";
		 
		  // create StringBuffer size of AlphaNumericString
		  StringBuilder sb = new StringBuilder(sizeOfString);
		 
		  for (int i = 0; i < sizeOfString; i++) {
		 
		   // generate a random number between
		   // 0 to AlphaNumericString variable length
		   int index= (int)(RandomString.length()* Math.random());
		 
		   // add Character one by one in end of sb
		   sb.append(RandomString
		      .charAt(index));
		  }
		 
		  return sb.toString();
	}
	
	public static int[] GenerateQniqueKeys(int numberOfNumbers) {
		
		//Code given in the exercise
		
		java.util.Random randomGenerator = new java.util.Random();
		
		int minIntNumber = 1;
		int maxIntNumber = 2*numberOfNumbers;
		
		int[] uniqueKeys = randomGenerator.ints(minIntNumber,
		maxIntNumber +1).distinct().limit(numberOfNumbers).toArray();
		
		return uniqueKeys;

	}
	
	public static int[] GenerateNonQniqueKeys(int numberOfNumbers) {
		
		//Code given in the exercise
		
		java.util.Random randomGenerator = new java.util.Random();
		
		int minIntNumber = 1;
		int maxIntNumber = 2*numberOfNumbers;
		
		int[] nonUniqueKeys = randomGenerator.ints(minIntNumber,
		maxIntNumber+1).limit(numberOfNumbers).toArray();
		
		return nonUniqueKeys;

	}
	
	
	
	
	
}
