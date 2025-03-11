package Star_Pattern;

public class Cross_Pattern_With_Zeros {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				
				if( i==(5/2)+1 || j==(5/2)+1 ) {
					
					System.out.print("* ");
				}
				else {
					
					System.out.print("0 ");
					
				}
											
			}
			
			System.out.println();
			
		}
		
	}
}
