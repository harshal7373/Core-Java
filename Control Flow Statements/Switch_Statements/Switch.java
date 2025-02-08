package Switch_Statements;

import java.util.*;

class Switch {

	void m1() {

		Scanner s1 = new Scanner(System.in);

		do {
			System.out.println("1. Tea \n2. Coffee \n3. Bottle \n4. Snacks \n5. Exit");
			int ch = s1.nextInt();

			switch (ch) {
			case 1:
				System.out.println("You ordered an Tea");
				break;

			case 2:
				System.out.println("You ordered a Coffee");
				break;

			case 3:
				System.out.println("You ordered a Bottle");
				break;

			case 4:
				System.out.println("You ordered a snacks");
				break;

			case 5:
				System.exit(0); // To stop the loop and do exit of loop.

			default:
				System.out.println("you have entered wrong order");

			}
		} while (true); // By putting true, the loop runs infinite. To get out of this loop go on exit
						// (case 5).

	}

	public static void main(String... args) {

		Switch a1 = new Switch();
		a1.m1();

	}

}