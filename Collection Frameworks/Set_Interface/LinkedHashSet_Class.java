package Set_Interface;

import java.util.LinkedHashSet;

// Class LinkedHashSet_Class
public class LinkedHashSet_Class {

// Main Method
	public static void main(String[] args) {

// LinkedHashSet
		
		LinkedHashSet l1 = new LinkedHashSet();

		l1.add(10);
		l1.add("Harshal");
		l1.add(30);
		l1.add(15);
		l1.add("Atharva");
		l1.add("Aarya");
		l1.add("Aarya"); // This will be ignored (Duplicate Values)
		l1.add(null);

		System.out.println(l1);

		
// LinkedHashSet With Boolean Generics
		
		LinkedHashSet<Boolean> l2 = new LinkedHashSet<Boolean>();
		
		l2.add(true);
		l2.add(false);
		l2.add(true);
		l2.add(null);
		l2.add(false);
		
		System.out.println(l2);
	}
}
