package List_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Class ArrayListClass
public class ArrayListClass {

// Main Method
	public static void main(String[] args) {

// ArrayList
		ArrayList a1 = new ArrayList();

		a1.add(10);
		a1.add("Harshal");
		a1.add(true);
		a1.add(430.5f);
		a1.add(null);

		System.out.println(a1);
		

// ArrayList With String Generics
		ArrayList<String> name = new ArrayList<String>();

		name.add("Oggy");
		name.add("Jack");
		name.add("Jaggu");
		name.add("Bob");
		name.add(null);

		System.out.println(name);
		
		name.remove(0);
		System.out.println(name);
		
		name.set(2, "Kunal");
		System.out.println(name);
		
		System.out.println(name.size());
		
		System.out.println(name.get(0));
	
		
// ArrayList with Integer Generics		
		ArrayList num = new ArrayList();
		
		num.add(11);
		num.add(32);
		num.add(21);
		num.add(90);
		num.add(45);
		

		Collections.sort(num);
		Collections.reverse(num);
		
		System.out.println(num);
		
		
		
	}
}
