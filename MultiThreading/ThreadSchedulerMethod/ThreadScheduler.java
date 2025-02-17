package ThreadSchedulerMethod;

public class ThreadScheduler extends Thread {

// Run Method
	@Override
	public void run() {

		String name = Thread.currentThread().getName();

		for (int i = 1; i <= 5; i++) {
			System.out.println(name);
		}

	}

// Main Method
	public static void main(String[] args) {

		ThreadScheduler t1 = new ThreadScheduler();
		ThreadScheduler t2 = new ThreadScheduler();
		ThreadScheduler t3 = new ThreadScheduler();

		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");

		t1.start();
		t2.start();
		t3.start();
		

	}
}
