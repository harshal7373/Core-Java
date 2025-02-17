package SetPriority_GetPriority_Methods;

// Class Priority
public class Priority extends Thread {

// Run Method
	public void run() {

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority()); // Get Priority

	}

// Main Method
	public static void main(String[] args) {

		Priority t1 = new Priority();
		Priority t2 = new Priority();
		Priority t3 = new Priority();

		t1.setName("T1 Thread");
		t2.setName("T2 Thread");
		t3.setName("T3 Thread");

		t1.setPriority(9); // Set Priority Method
		t2.setPriority(2); // Set Priority Method
		t3.setPriority(5); // Set Priority Method

		t1.start();
		t2.start();
		t3.start();

	}
}
