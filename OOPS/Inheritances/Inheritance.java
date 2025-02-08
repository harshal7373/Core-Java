package Inheritances;

// Parent Class
class Parent {

	void m1() {
		System.out.println("I am from parent class");
	}

	void m2() {
		System.out.println("Method 2 is from Parent class");
	}
}

// Subclass
class SubClass extends Parent {

	void m1() {
		System.out.println("I am from Subclass");
	}

	void m3() {
		System.out.println("Method 3 is from sub class");
	}

}

public class Inheritance {

	// Main Method
	public static void main(String[] args) {

		SubClass a1 = new SubClass();
		a1.m1();
		a1.m2();
		a1.m3();

	}

}
