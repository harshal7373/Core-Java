package Containment_Constructors;

// Address Class
class Address{
	
String city;
String state;
	
	Address(String city, String state){
		
		this.city=city;
		this.state=state;
		
	}
	
}
// Student Class
class Student{
	
	
	Address adr;
	
	Student(int rno, String name, Address adr){
		
		System.out.println("Roll no: "+rno +"\n" + "Name: "+name+ "\nStudent Address: "+adr.city +" " +adr.state );
	}
}

public class Containment_Constructor {

	public static void main(String[] args) {
		
		Address a1 = new Address("Pune", "Maharashtra");
		Student a2 = new Student(56,"Harsh",a1);
	}
	
	
}
