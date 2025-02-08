package Interfaces;

//Interface
interface Parent {

	void method1();
}

class SubClass implements Parent {

	// Method 1
	public void method1() {
		System.out.println("This method is from Parent interface");
	}

	// Method 2
	void method2() {
		System.out.println("This method is from SubClass");
	}

}

public class Interface {

	// Main Method
	public static void main(String[] args) {

		SubClass a1 = new SubClass();
		a1.method1();
		a1.method2();

	}

}
