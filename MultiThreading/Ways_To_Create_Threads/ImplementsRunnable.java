package Ways_To_Create_Threads;

public class ImplementsRunnable implements Runnable {

	String name;

	ImplementsRunnable(String name) {

		this.name = name;

	}

// Run Method
	@Override
	public void run() {

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Harshal");
				Thread.sleep(1000);
			}

// This loop print after the upper loop 
			for (int i = 1; i <= 5; i++) {
				System.out.println(name);
			}

		} catch (Exception exp) {
			System.out.println(exp);
		}

	}

// Main Method
	public static void main(String[] args) throws InterruptedException {

		ImplementsRunnable t1 = new ImplementsRunnable("Oranges");

		Thread t = new Thread(t1); // We have created Thread Object because, Runnable have only one method that is run()
		t.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Ashish");
			Thread.sleep(1000);
		}

	}
}
