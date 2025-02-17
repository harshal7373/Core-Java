package StopMethod;

public class Stop extends Thread{

// Run Method
	public void run() {
		
	String name = Thread.currentThread().getName();
		
		for(int i=1; i<=3; i++) {
			System.out.println(name);
		}
		
	}

// Main Method
	public static void main(String[] args) {
		
		Stop t1 = new Stop();
		Stop t2 = new Stop();
		Stop t3 = new Stop();
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		
		t1.start();
		t2.start();
		t3.start();
		
		t2.stop();   // Stop Method
		
		System.out.println("Main");
	
		
	}
}
