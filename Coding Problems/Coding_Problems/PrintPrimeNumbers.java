package Coding_Problems;

public class PrintPrimeNumbers {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 100;
		int i;
		int j;

		for (i = num1; i <= num2; i++) {   // if, i=7-> true

			for (j = 2; j <= i; j++) {     // j=2 ; j<=7

				if (i % j == 0)    // i=7 % j=7 ->break, and moves to outer loop
					break;

			}

			if (i == j) {          // i=7 == j=7
				System.out.println(j);     // print -> 7
			}

		}

	}
}
