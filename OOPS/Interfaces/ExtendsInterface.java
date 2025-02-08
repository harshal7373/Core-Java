package Interfaces;

// Interface A
interface A {

	void m1();

	void m2();

}

// Interface B
interface B extends A {

	void m1();

}

// Class C
class C implements B {

	public void m1() {
		System.out.println("Method 1");
	}

	public void m2() {
		System.out.println("Method 2 from Interface A");
	}

}

public class ExtendsInterface {

	// Main Method
	public static void main(String[] args) {

		C a1 = new C();
		a1.m1();
		a1.m2();

	}

}
