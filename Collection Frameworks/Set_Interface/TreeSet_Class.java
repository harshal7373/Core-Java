package Set_Interface;

import java.util.TreeSet;

public class TreeSet_Class {

	public static void main(String[] args) {

// SortedSet Only for String

		TreeSet ts1 = new TreeSet();
		
		ts1.add("harshal");
		ts1.add("Parth");
		ts1.add("Parth");   // This will be ignored (Duplicate Values)
		ts1.add("Atharva");
		ts1.add("Manisha");
		
		
		System.out.println(ts1);
		
		ts1.add("Aarya");
		System.out.println(ts1);
		

// SortedSet Only for Integer
		
		TreeSet ts2 = new TreeSet();
		
		ts2.add(10);
		ts2.add(50);
		ts2.add(20);
		ts2.add(5);
		ts2.add(5);
		ts2.add(2);

		System.out.println(ts2);
		
	}
}
