package User_Input_Array;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputArray_2D {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);

		System.out.println("----Two Dimension Array----");
		// Two Dimension Array
		System.out.println("Mention rows and Columns");

		int size1 = s1.nextInt();
		int size2 = s1.nextInt();

		int b[][] = new int[size1][size2];

		System.out.println("Enter Elements");

		for (int i = 0; i < size1; i++) {
			for (int k = 0; k < size2; k++) {

				b[i][k] = s1.nextInt();
			}
		}

		for (int num[] : b) {
			System.out.println(Arrays.toString(num));
		}
	}
}
