package Enhanced_For_Loops;

public class EnhancedForLoop {

	// Main Method
	public static void main(String[] args) {

		System.out.println("-----One Dimension Array------");

		// One Dimension Array
		int a[] = new int[2];

		a[0] = 10;
		a[1] = 20;

		for (int num : a) {
			System.out.println(num);

		}

		System.out.println("\n------Two Dimension Array-------");
		// Two Dimension Array
		int b[][] = new int[3][2];

		b[0][0] = 10;
		b[0][1] = 20;
		b[1][0] = 11;
		b[1][1] = 22;
		b[2][0] = 100;
		b[2][1] = 200;

		for (int i[] : b) {

			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
