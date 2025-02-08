package if_Else;

import java.util.Scanner;

class If_Else {

	void m1() {

// WAP to check wheter Entered number is Positive or Negative. 

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter any number");

		int a;
		a = s1.nextInt();

		if (a >= 0) {
			System.out.println("Entered Number is positive");
		} else {
			System.out.println("Your Entered number is Negative");
		}

	}

	void m2() {

// WAP to check whether number is even or odd

		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter any number: ");

		int a;
		a = s2.nextInt();

		if (a % 2 == 0) {
			System.out.println("Entered number is Even");
		} else {
			System.out.println("Entered number is odd");
		}

	}

	void m3() {
		// WAP to find out maximum number between three numbers

		int a = 40, b = 40, c = 20;

		if (a >= b && a >= c) {
			System.out.println("Maximum Number is: " + a);
		} else if (b >= a && b >= c) {
			System.out.println("Maximum Number is: " + b);
		} else {
			System.out.println("Maximum Number is: " + c);
		}

	}

	void m4() {
		// WAP to accept Character Salary from user. If Character "M" or "m" then
		// increase salary by 3000. If Character "F" or "f" then increase salary by
		// 2000.

		Scanner s3 = new Scanner(System.in);
		System.out.println("Enter Your Character and Salary: ");

		char ch = s3.next().charAt(0);
		double salary = s3.nextDouble();

		if (ch == 'm' || ch == 'M') {
			salary = salary + 3000;
		} else if (ch == 'f' || ch == 'F') {
			salary = salary + 2000;
		}

		System.out.println("Salary After Inrement: " + salary);
	}

	void assign1() {
		// WAP to check number is divisible by 5 or not and take number from user input.

		Scanner s4 = new Scanner(System.in);
		System.out.println("Enter your Number: ");
		int a;
		a = s4.nextInt();

		if (a % 5 == 0) {
			System.out.println("Your Entered number is divisble by 5");
		} else {
			System.out.println("Your Entered number is not divisble by 5");
		}

	}

	void assign2() {
		// WAP to check employee is eligible for voting or not.

		Scanner s5 = new Scanner(System.in);
		System.out.println("Enter your age ");

		int age;
		age = s5.nextInt();

		if (age >= 18) {
			System.out.println("You are eligible for voting");
		} else {
			System.out.println("You are not eligible for voting");
		}

	}

	void assign3() {
		// WAP to check minimum number between three numbers

		Scanner s6 = new Scanner(System.in);
		System.out.println("Enter any three number");

		int a = s6.nextInt();
		int b = s6.nextInt();
		int c = s6.nextInt();

		if (a < b && a < c) {
			System.out.println("The Minimum number is: " + a);
		} else if (b < a && b < c) {
			System.out.println("The Minimum number is: " + b);
		} else if (c < a && c < b) {
			System.out.println("The Minimum number is: " + c);
		}

	}

	public static void main(String... args) {

		If_Else a1 = new If_Else();
		a1.m1();
		a1.m2();
		a1.m3();
		a1.m4();
		a1.assign1();
		a1.assign2();
		a1.assign3();

	}
}
