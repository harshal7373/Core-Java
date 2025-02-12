package Has_a_Relationships;

// Class Office
class Office {

	String city;
	String state;

	Office(String city, String state) {
		this.city = city;
		this.state = state;
	}

}

// Class Employee
class Employee {

	int id;
	String name;
	Office off;   //Composition: Employee owns Office

	Employee(int id, String name, String city, String state) {

		this.id = id;
		this.name = name;
		this.off = new Office(city, state);  // Office is created inside a Employee

	}

	void displayInfo() {

		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("Office Address: " + off.city + " " + off.state);
	}

}

// class Composition
public class Composition {

	public static void main(String[] args) {

		Employee a1 = new Employee(101, "Harshal", "Pune", "Maharashtra");
		a1.displayInfo();
	}
}
