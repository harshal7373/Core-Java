package for_Loop;

import java.util.Scanner;

class ForLoop {

	void m1() {

//WAP to print 1 to 10 numbers.

		int i;

		for (i = 1; i <= 10; i++) {

			System.out.println(i);

		}
	}

	void m2() {

//WAP to print 1 to 10 numbers in reverse.

		int i;

		for (i = 10; i >= 1; i--) {

			System.out.println(i);

		}
	}

	void m3() {

//WAP to print even numbers between 1 to 20.

		int i;

		for (i = 1; i <= 20; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}

		}

	}

	void m4() {

		// WAP to find out sum of nth number.

		// 5 = 1 + 2 + 3 + 4 + 5

		Scanner s4 = new Scanner(System.in);
		System.out.println("Enter any number");

		int num = s4.nextInt();
		int sum = 0;
		int i;

		for (i = 1; i <= num; i++) {

			sum = sum + i; // 0=0+1 --> (1) ; 1=1+2 --> (3) ; 3=3+3 --> (6) ; 6=6+4 --> (10) ; 10=10+5 -->
							// (15);
		}
		System.out.println(sum);

	}

	void m5() {
		// WAP to print factorial of entered number

		// 5! = 1 * 2 * 3 * 4 * 5

		Scanner s5 = new Scanner(System.in);
		System.out.println("Enter any number");

		int num = s5.nextInt();
		int fact = 1;
		int i;

		for (i = 1; i <= num; i++) {

			fact = fact * i; // 1=1*1 --> (1) ; 1=1*2 --> (2) ; 2=2*3 --> (6) ; 6=6*4 --> (24) ; 24=24*5
								// (120);
		}
		System.out.println(fact);

	}

	void m6() {
		// WAP to check whether Entered number is perfect or not.

		// 6 = 1 + 2 + 3

		Scanner s6 = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = s6.nextInt();

		int i;
		int sum = 0;

		for (i = 1; i < n; i++) {

			if (n % i == 0) {

				sum = sum + i;

			}
		}

		if (sum == n) {
			System.out.println("No. is perfect");
		} else {
			System.out.println("No. is not perfect");
		}

	}

	void m7() {
		// WAP to check whether entered number is prime or not

		Scanner s7 = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = s7.nextInt();
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++; // Here the maximum divisors will be only 2. (1, and number itself)
			}

		}

		if (count == 2) {
			System.out.println("Number is prime number");
		} else {
			System.out.println("Number is not an prime number");
		}

	}

	void m8() {
		// Print A to Z in alternative way.

		for (char a = 'a'; a <= 'z'; a += 2) { // increment by 2 for alternate characters. (If we want to do increment
												// by 3 then we will use "(a+=3)" ).

			System.out.println(a + " ");
		}

	}

	public static void main(String... args) {

		ForLoop a1 = new ForLoop();

		a1.m1();  
		a1.m2();
		a1.m3();
		a1.m4();
		a1.m5();
		a1.m6();
		a1.m7();
		a1.m8();

	}

}
