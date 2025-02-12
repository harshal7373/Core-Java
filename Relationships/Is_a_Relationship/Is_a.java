package Is_a_Relationship;

// Class Vehicle
class Vehicle{
	
	void m1() {
		System.out.println("Vehicle Start");
	}
	
}

// Class Car
class Car extends Vehicle{
	
	void m2() {
		System.out.println("Driving Car");
	}
	
}

// Class Is_a
public class Is_a {
	
// Main Method
	public static void main(String[] args) {
		
		Car a1 = new Car();
		
		a1.m1();
		a1.m2();
		
		
	}
}
