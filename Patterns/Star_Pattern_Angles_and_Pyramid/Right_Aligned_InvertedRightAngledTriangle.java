package Star_Pattern_Angles_and_Pyramid;

public class Right_Aligned_InvertedRightAngledTriangle {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) { // This Loop is for row

			for (int j = 2; j <= i; j++) { // This Loop takes space from left

				System.out.print(" ");

			}

			for (int k = 5; k >= i; k--) { // This Loop is for Column
				System.out.print("*");
			}

			System.out.println();

		}

	}
}
