package for_Loop;

import java.util.*;

class NestedForLoop {

	void m1() {

		int i, j;

		for (i = 1; i <= 10; i++) {

			for (j = 1; j <= 10; j++) {

				System.out.print(i + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String... args) {

		NestedForLoop a1 = new NestedForLoop();
		a1.m1();

	}
}
