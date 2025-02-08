package Inheritances;

// Parent Class
class ParentDynamic {

	void m1() {
		System.out.println("This is from Parent Dynamic");
	}
}

// Child Class
class ChildDynamic extends ParentDynamic {

	void m1() {
		System.out.println("This is from Child Dynamic");
	}

	void m2() {
		System.out.println("This Method 2 is from Child Dynamic");
	}
}

public class DynamicMethodDisptach {

	// Main Method
	public static void main(String[] args) {

		// First Object
		ParentDynamic a1;
		a1 = new ChildDynamic();
		a1.m1();

		System.out.println("-------------------------");
		// Second Object
		a1 = new ParentDynamic();
		a1.m1();

		System.out.println("-------------------------");
		// Third Object
		ChildDynamic a2 = new ChildDynamic();
		a2.m1();
		a2.m2();

	}
}
