package Inheritances;

// Class Root Class
class Vehicles {

	void start() {
		System.out.println("The Vehicle is Started");
	}
}

// Class Car
class Car extends Vehicles {

	void run() {
		System.out.println("The Car is Travelling");
	}
}

// Class Electric Car
class ElectricCar extends Car {

	void repair() {
		System.out.println("The Electric car need to be repair");
	}

}

// Class Bike
class Bike extends Vehicles {

	void run() {
		System.out.println("The Bike is Travelling");
	}

}

// Class SportsBike
class SportsBike extends Bike {

	void Stunts() {
		System.out.println("The Sports Bike Performing Stunts");
	}

}

class HierarchicalInheritance {

	// Main Method
	public static void main(String[] args) {

		ElectricCar a1 = new ElectricCar();
		a1.start();
		a1.run();
		a1.repair();

		System.out.println("-----------------------------------");

		SportsBike a2 = new SportsBike();
		a2.start();
		a2.run();
		a2.Stunts();
	}

}