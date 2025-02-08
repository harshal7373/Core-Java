package Create_Arrays;

public class Dynamic {

	// Main Method
	public static void main(String[] args) {

		System.out.println("------One Dimension Array------");
		// One Dimension Array
		int a[] = { 11, 22, 33, 44, 55 };

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println("\n ------Two Dimension Array------");
		
		// Two Dimension Array
		int b[][] = { { 10, 20, 30 }, { 50, 60, 70, 80 } };

		for (int i = 0; i < b.length; i++) {

			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}
