
// Interface Vehicle
interface Vehicle {

	void m1();
}

// Class Car
class Car implements Vehicle {

	public void m1() {
		System.out.println("Car is running");
	}

}

// Class InstanceOf_Interface
public class InstanceOf_Interface {

// Main Method
	public static void main(String[] args) {

		Vehicle a1 = new Car();
		System.out.println(a1 instanceof Car);
		System.out.println(a1 instanceof Vehicle);

		Car a2 = new Car();
		System.out.println(a2 instanceof Vehicle);
		System.out.println(a2 instanceof Car);

	}

}
