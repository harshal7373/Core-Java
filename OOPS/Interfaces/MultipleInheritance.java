package Interfaces;

// Interface Multiple A
interface MultipleA {

	void m1();

}

// Interface Multiple B
interface MultipleB {

	void m1();
}

// Interace Multiple C
interface MultipleC {

	void m1();

	void m2();

}

public class MultipleInheritance implements MultipleA, MultipleB, MultipleC {

	public void m1() {
		System.out.println("This is Method 1");
	}

	public void m2() {
		System.out.println("This is Method 2 from Interface MultipleC");
	}

	// Main Method
	public static void main(String[] args) {

		MultipleInheritance a1 = new MultipleInheritance();
		a1.m1();
		a1.m2();

	}

}
