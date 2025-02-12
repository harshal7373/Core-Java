package Has_a_Relationships;

// Class Address
class Address {

	String city;
	String state;

	Address(String city, String state) {

		this.city = city;
		this.state = state;

	}

}

// Class Student
class Student {

	int rno;
	String name;
	Address adr; // Aggregation: Student has-a Address

	Student(int rno, String name, Address adr) {

		this.rno = rno;
		this.name = name;
		this.adr = adr;
	}

	void displayInfo() {

		System.out.println("Roll no: " + rno);
		System.out.println("Name: " + name);
		System.out.println("Address: " + adr.city + " " + adr.state);

	}

}

// Class Aggregation
public class Aggregation {

// Main Method
	public static void main(String[] args) {

		Address a1 = new Address("Pune", "Maharashtra");
		Student a2 = new Student(328, "Harshal", a1);

		a2.displayInfo();

	}

}
