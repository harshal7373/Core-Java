package Explicit_Casting;

// Class Explicit
public class Explicit {

// Main Method
	public static void main(String[] args) {

		double d1 = 10.5;
		int a1 = (int) d1;
		System.out.println("Explicit: " + a1);

		long l1 = 323324l;
		int a2 = (int) l1;
		System.out.println("Explicit: " + a2);

		float f1 = 44.2f;
		int a3 = (int) f1;
		System.out.println("Explicit: " + a3);
	}
}
