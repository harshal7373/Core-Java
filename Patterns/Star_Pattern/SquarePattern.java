package Star_Pattern;

public class SquarePattern {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {     // Outer Loop try to print rows     
			
			for(int j=1; j<=5; j++) {   // Inner loop try to print columns     
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
