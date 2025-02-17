package DaemonMethod;

// Class Daemon
public class Daemon extends Thread {

// Run Method
	public void run() {
		
		String name = Thread.currentThread().getName();
		
		if(Thread.currentThread().isDaemon()) {
			System.out.println(name + " Daemon Thread");
		}
		else {
			System.out.println(name + " User Thread");
		}
		
	}
	
// Main Method
	public static void main(String[] args) {
		
		Daemon t1 = new Daemon();
		Daemon t2 = new Daemon();
		Daemon t3 = new Daemon();
		
		t1.setName("Thread - 1");
		t2.setName("Thread - 2");
		t3.setName("Thread - 3");
		
		t2.setDaemon(true);  // Setting Daemon to True
		
		t1.start();
		t2.start();	
		t3.start();		
		
	}
}
