package Recursions;

import java.util.Scanner;

public class Recursion {

	// To find out sum of first n number
	int sum(int n) {

		if (n > 0) {
			return n + sum(n - 1);
		} else {
			return 0;
		}
	}

	// To find out factorial of number
	int fact(int numb) {

		if (numb == 0) {
			return 1;
		} else {
			return numb * fact(numb - 1);
		}
	}

	// Main Method
	public static void main(String[] args) {

		Recursion a1 = new Recursion();

		Scanner s1 = new Scanner(System.in);

		// Sum of First n numbers
		System.out.println("Enter any number: ");
		int n = s1.nextInt();
		System.out.println("Sum of first " + n + " numbers are: " + a1.sum(n));

		// Factorial
		System.out.println("Enter any number for factorial: ");
		int numb = s1.nextInt();
		System.out.println("Factorial of this number is: " + a1.fact(numb));
	}
}
