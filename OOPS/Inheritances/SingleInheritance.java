package Inheritances;

// Class SingleA
class SingleA {

	void m1() {
		System.out.println("Method 1 is from class SingleA");
	}

	void m2() {
		System.out.println("Method 2 is from class SingleA");
	}

}

// Class SingleInheritance
public class SingleInheritance extends SingleA {

	void m1() {
		System.out.println("Method 1 from Class SingleInheritance");
	}

	// Main Method
	public static void main(String[] args) {

		SingleInheritance a1 = new SingleInheritance();
		a1.m1();
		a1.m2();
	}

}
