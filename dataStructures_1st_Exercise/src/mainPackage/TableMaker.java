package mainPackage;

public class TableMaker {
		
	
	
	public static void accessTable(int [] N , double[]array55A, double[]array27A , double[]array55B, double[]array27B, double[]array55G, double[]array27G) {
			
			
		
		System.out.format("+---+------------------A tropos--------------------------------------B tropos--------------------------------------G tropos----------------+%n");
		System.out.format("|%-3s|%-22s|%-21s|%-22s|%-21s|%-22s|%-21s|%n", " N ", "Accesses for 55b", "Accesses for 27b", "Accesses for 55b", "Accesses for 27b", "Accesses for 55b", "Accesses for ana 27b");
		System.out.format("+---+----------------------+---------------------+----------------------+---------------------+----------------------+---------------------+%n");

		// fill table with data
		for (int i = 0; i < array55A.length; i++) {
		    System.out.format("|%-3d|%-22.2f %-21.2f %-22.2f %-21.2f %-22.2f %-21.2f %n", 
		            N[i], array55A[i], array27A[i], array55B[i], array27B[i], array55G[i], array27G[i]);
		}

		// create table footer
		System.out.format("+---+----------------------+---------------------+----------------------+---------------------+----------------------+---------------------+%n");
	}
	
public static void TimeTable(int [] N , double[]array55A, double[]array27A , double[]array55B, double[]array27B, double[]array55G, double[]array27G) {
			
			
		
		System.out.format("+---+------------------A tropos--------------------------------------B tropos--------------------------------------G tropos----------------+%n");
		System.out.format("|%-3s|%-22s|%-21s|%-22s|%-21s|%-22s|%-21s|%n", " N ", "Search Time for 55b", "Search Time for 27b", "Search Time for 55b", "Search Time for 27b", "Search Time for 55b", "Search Time for 27b");
		System.out.format("+---+----------------------+---------------------+----------------------+---------------------+----------------------+---------------------+%n");

		// fill table with data
		for (int i = 0; i < array55A.length; i++) {
		    System.out.format("|%-3d|%-22.2f %-21.2f %-22.2f %-21.2f %-22.2f %-21.2f|%n", 
		            N[i], array55A[i], array27A[i], array55B[i], array27B[i], array55G[i], array27G[i]);
		}

		// create table footer
		System.out.format("+---+----------------------+---------------------+----------------------+---------------------+----------------------+---------------------+%n");
	}
	
	
	
	
}	

