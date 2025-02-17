package Customization;

import java.util.ArrayList;
import java.util.Iterator;

// Class A
class A {

	private int id;
	private String name;
	private double salary;
	private String city;

// Constructor A
	public A(int id, String name, double salary, String city) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;

	}

	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}

}
  
// Class ArrayList_With_Custom_Class
class ArrayList_With_Custom_Class {

// Main Method
	public static void main(String[] args) {

// ArrayList
		ArrayList list = new ArrayList();

		list.add(new A(101, "Harshal", 70000d, "Pune"));
		list.add(new A(102, "Atharva", 60000d, "Pune"));
		list.add(new A(103, "Aarya", 30000d, "Mumbai"));
		list.add(new A(104, "Aditya", 40000d, "Nashik"));

		
// Iterator
		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}