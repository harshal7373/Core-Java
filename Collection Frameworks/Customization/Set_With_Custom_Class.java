package Customization;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Class C
class C{
	
	private String name;
	private String city;
	private long mobNo;
	

	public C(String name, String city, long mobNo) {
		
		this.name=name;
		this.city=city;
		this.mobNo=mobNo;
		
	}

	@Override
	public String toString() {
		return "C [name=" + name + ", city=" + city + ", mobNo=" + mobNo + "]";
	}
		
}

// CLass Set_With_Custom_Class
public class Set_With_Custom_Class {

// Main Method
	public static void main(String[] args) {

// Set Interface and HashSet Class
		Set set = new HashSet();
		
		set.add(new C("Harshal", "Pune", 8983695957l));
		set.add(new C("Madhur", "Pune", 898379873l));
		set.add(new C("Harshwardhan", "Nashik", 838738748l));
		set.add(new C("Manas", "Satara", 898369578l));
		
// Iterator
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
