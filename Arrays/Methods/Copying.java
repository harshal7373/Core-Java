package Methods;

import java.util.Arrays;

public class Copying {

	public static void main(String[] args) {

		System.out.println("----One Dimension Array----");
		// One Dimension Array
		int a[] = { 11, 22, 33, 44, 55 };
		int b[] = Arrays.copyOf(a, a.length);

		for (int num : b) {
			System.out.println(num);
		}

		System.out.println("----Two Dimension Array----");
		// Two Dimension Array
		int c[][] = { { 10, 20, 30 }, { 23, 123, 21, 123 } };
		int d[][] = Arrays.copyOf(c, c.length);

		for (int num[] : d) {
			for (int j : num) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
