package Unary_Operators;

class Unary {

	// Method 1
	void m1() {

		int a = 10;
		int b = 5;

		int c = (a++) + (b--) + (b++) - (b) - (a) + (a--);

		System.out.println(c);

	}
    // Method 2
	void m2() {

		int a = 10;
		int b = 5;

		int c = (a++) + (b--) + (b++) - (b) - (a) + (a--) + 80 - 4 - 2;

		System.out.println(c);
	}

	// Method 3
	void m3() {

		int a = 10;
		int b = 5;

		int c = (a++) + (b--) + (b++) - (10) - (a) + (a--) + 80 - 4 - 2;

		System.out.println(c);
	}

	// Method 4
	void m4() {

		int a = 10;
		int b = 5;

		int c = (a++) + (b--) - (10) - (a) + (a--) + 80 - 4 - 2;

		System.out.println(c);
	}

	// Method 5
	void m5() {

		int a = 10;
		int b = 5;

		int c = (a++) + (b--) - (10) - (a) + (a--) + (80 - 4 - 2) * (3) - (a++) - (--b);

		System.out.println(c);
	}

	
	// Main
	public static void main(String... args) {

		int a = 10;
		int b = 5;

		System.out.println(a);

		a++;
		System.out.println(a);

		a++;
		System.out.println(++a);

		System.out.println("-------------------------------");
		
		Unary a1 = new Unary();
		a1.m1();
		a1.m2();
		a1.m3();
		a1.m4();
		a1.m5();

	}
}