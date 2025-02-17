package SleepMethod;

public class Sleep extends Thread {

// Run Method
	public void run() {

		String name = Thread.currentThread().getName();

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(name);
				Thread.sleep(1000);       // Sleep Method
			}
		} catch (Exception exp) {
			System.out.println(exp);
		}

	}

// Main Method
	public static void main(String[] args) {

		Sleep t1 = new Sleep();
		Sleep t2 = new Sleep();
		Sleep t3 = new Sleep();

		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");

		t1.start();
		t2.start();
		t3.start();
	}
}
