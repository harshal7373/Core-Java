package Synchroned;

public class Bus extends Thread {

	int seat = 2;
	int Passenger;

	Bus(int Passenger) {
		this.Passenger = Passenger;
	}

// Synchronized Run Method	
	public synchronized void run() {

		if (seat >= Passenger) {

			System.out.println("Seat is Available");
			seat = seat - Passenger;
		} else {
			System.out.println("Seat is not available");
		}

	}

// Main Method
	public static void main(String[] args) {

		Bus a1 = new Bus(1);

		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a1);
		Thread t3 = new Thread(a1);

		t1.start();
		t2.start();
		t3.start();
	}
}
