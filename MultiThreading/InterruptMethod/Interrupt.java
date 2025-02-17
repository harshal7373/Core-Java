package InterruptMethod;

// Class A
class A extends Thread {

// Run Method
	public void run() {

		try {
			for (int i = 1; i <= 3; i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (InterruptedException exp) {
			System.out.println(exp);
		}
	}
}

// Class B
class B extends Thread {

// Run Method
	public void run() {

		try {
			for (int i = 1; i <= 3; i++) {
				System.out.println(Thread.currentThread().getId());
				Thread.sleep(1000);
			}
		} catch (Exception exp) {
			System.out.println("The Loop is Terminated " + exp);
		}
	}
}

// Class Interrupt
public class Interrupt {

// Main Method
	public static void main(String[] args) {

		A t1 = new A();
		t1.start();

		B t2 = new B();
		t2.start();
		t2.interrupt();  // Interrupt Method
		
	}
}
