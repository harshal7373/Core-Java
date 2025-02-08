package Polymorphisms;

public class Compile_Time_Polymorphism {

	// Method 1
	void m1() {

		System.out.println("Method 1");
	}

	// Method 2
	void m2(int a) {

		System.out.println("Method 2");
	}

	// Method 1
	void m3(int a, String name) {

		System.out.println("Method 3");
	}

	// Main Method
	public static void main(String[] args) {

		Compile_Time_Polymorphism a1 = new Compile_Time_Polymorphism();
		a1.m1();
		a1.m2(101);
		a1.m3(111, "Harshal");

	}
}
