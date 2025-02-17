package Synchroned;

// Class bank
public class Bank extends Thread {

	double balance = 4000;
	 double withdraw;
	 Bank(double withdraw) {
		
		this.withdraw = withdraw;
		
	}

// Synchronized Run Method
	public synchronized void run() {
		
		if(balance>=withdraw) {
			System.out.println("Withdraw");
			balance = balance - withdraw;
		}
		else {
			System.out.println("Insufficient Balance");
		}
		
	}
	
// Main Method	
	public static void main(String[] args) {
		
		Bank a1 = new Bank(2000);
		
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a1);
		Thread t3 = new Thread(a1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
