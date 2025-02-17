package JoinMethod;

public class Join extends Thread {

	String name;

	Join(String name) {
		this.name = name;
	}

// Run Method
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(name);
		}

	}

// Main Method
	public static void main(String[] args) throws InterruptedException {

		Join t1 = new Join("Thread-1");
		Join t2 = new Join("Thread-2");
		Join t3 = new Join("Thread-3");

		t2.start();
		t2.join();   // Join Method

		t1.start();
		t3.start();

// Main Thread		
		String name = Thread.currentThread().getName();

		for (int i = 1; i <= 3; i++) {
			System.out.println(name);
		}

	}
}
