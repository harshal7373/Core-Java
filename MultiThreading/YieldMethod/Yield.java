package YieldMethod;

// Class A
class A extends Thread {

// Run Method
	public void run() {

		String name = Thread.currentThread().getName();

		for (int i = 1; i <= 3; i++) {
			System.out.println(name);
			Thread.yield();  // Yield Method
		}

	}

}

// Class B
class B extends Thread {

// Run Method
	public void run() {

		String name = Thread.currentThread().getName();

		for (int i = 1; i <= 3; i++) {
			System.out.println(name);
		}

	}
}

// Class Yield
class Yield {

// Main Method
	public static void main(String[] args) {

		A t1 = new A();
		B t2 = new B();

		t1.start();
		t2.start();

	}

}