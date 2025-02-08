package Finalize_Method_Garbage_Collection;

public class FinalizeMethod {

	// Method 1
	void m1() {

		System.out.println("Hello World");

	}

	// Method 2
	void m2() {

		System.out.println("Hello Universe");
	}

	public static void main(String[] args) {

		FinalizeMethod a1 = new FinalizeMethod();
		FinalizeMethod a2 = new FinalizeMethod();

		a1 = a2; // Object Destroyed
//		a1=null; // Object can also destoryed by putting null 

		System.gc();

	}

// Only Finalize method get called but only one time we use finalize after destroying object
	public void finalize() {

		System.out.println("Finalize Method Called");
	}

	// Not get called
	public void method1() {

		System.out.println("Hello World");

	}

}
