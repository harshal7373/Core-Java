package Star_Pattern_Angles_and_Pyramid;

public class InvertedEquilateralTriangle {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {

			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i * 2 - 1; k++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

}
