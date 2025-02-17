package Ways_To_Create_Threads;

public class ExtendingThread extends Thread {

// Run Method
	@Override
	public void run() {        // Here we define thread

		try {

			for (int i = 1; i <= 5; i++) {
				System.out.println("Harshal");
				Thread.sleep(1000);
			}

		} catch (Exception exp) {
			System.out.println(exp);
		}

	}

//Main Method
	public static void main(String[] args) throws InterruptedException {

		ExtendingThread t1 = new ExtendingThread();

		t1.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Madhur");
			Thread.sleep(1000);
		}
	
	}
}
