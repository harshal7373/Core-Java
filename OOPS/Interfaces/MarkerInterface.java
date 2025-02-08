package Interfaces;

// Marker Interface
interface Marker {

}

public class MarkerInterface implements Marker {

	// Main Method
	public static void main(String[] args) {

		MarkerInterface a1 = new MarkerInterface();

		if (a1 instanceof Marker) {
			System.out.println("Properties are Accessible");
		} else {
			System.out.println("Not Accessible");
		}
	}
}
