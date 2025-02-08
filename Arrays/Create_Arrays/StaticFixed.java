package Create_Arrays;

public class StaticFixed {

	// Static Fixed
	public static void main(String[] args) {

		System.out.println("-----One Dimension Array-----");
		
		// One Dimension Array
		int a[] = new int[5];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println("\n-----Two Dimension Array-----");
		
		// Two Dimension Array
		int b[][] = new int[3][2];
		
		b[0][0] = 11; b[0][1] = 22;
		b[1][0] = 10; b[1][1] = 20;
		b[2][0] = 100; b[2][1] = 200;
		
		for(int i=0; i<b.length; i++) {
			
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}
