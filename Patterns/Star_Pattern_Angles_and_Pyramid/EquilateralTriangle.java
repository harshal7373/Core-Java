package Star_Pattern_Angles_and_Pyramid;

public class EquilateralTriangle {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=5; i++) {  // This Loop is for Rows
			
			for(int j=5; j>=i; j--) {  // This Loop is for Space from Left
				System.out.print(" ");
			}
			
			for(int k=1; k<=i*2-1; k++) { // This Loop is for Column
				System.out.print("*");
			}
			
			System.out.println();  
			
		}
		
	}
}
