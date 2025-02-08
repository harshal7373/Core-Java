package Interfaces;

// Interface Hybrid A
interface HybridA {

	void m1();

}

// Interface Hybrid B
interface HybridB {

	void m2();

}

// Class Hybrid C
class HybridC {

	void m3() {
		System.out.println("This Method 3 is from Hybrid C");
	}
}

// Class Hybrid D
class HybridD extends HybridC {

	void m4() {
		System.out.println("This Method 4 is From Hybrid D");
	}

}



class HybridInheritance extends HybridD implements HybridA, HybridB {

	public void m1() {
		System.out.println("This Method 1 is From Hybrid A");
	}

	public void m2() {
		System.out.println("This Method 2 is From Hybrid B");
	}

	// Main Method
	public static void main(String[] args) {

		HybridInheritance a1 = new HybridInheritance();

		a1.m1();
		a1.m2();
		a1.m3();
		a1.m4();

	}

}