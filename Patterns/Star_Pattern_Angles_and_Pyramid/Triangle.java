package Star_Pattern_Angles_and_Pyramid;

public class Triangle {

	public static void main(String[] args) {

		
		for(int i=1; i<=5; i++) {  // This Loop is used for Rows
			
			for(int j=4; j>=i; j--) {  // This Loop is used for Spaces
				
				System.out.print(" ");  
			}
			
			for(int k=1; k<=i; k++) {  // This Loop is used for Columns
				
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}
		
	}
}
