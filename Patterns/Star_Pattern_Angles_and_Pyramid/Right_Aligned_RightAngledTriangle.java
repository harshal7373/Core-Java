package Star_Pattern_Angles_and_Pyramid;

public class Right_Aligned_RightAngledTriangle {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) { // This loop is for Rows

			for (int j = 4; j >= i; j--) { // This loop takes Space from Left

				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++) { // This loop is for Column

				System.out.print("*");

			}

			System.out.println();

		}

	}
}
