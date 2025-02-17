package Set_Interface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Interface {

	public static void main(String[] args) {
	
// HashSet
		Set s1 = new HashSet();
		
		s1.add(10);
		s1.add("Harshal");
		s1.add(40);
		s1.add("Madhur");
		s1.add(40);        // This will be ignored (Duplicate values)
		
		System.out.println(s1);
		
// LinkedHashSet
		
		Set s2 = new LinkedHashSet();
		
		s2.add(10);
		s2.add("Oranges");
		s2.add("Bananas");
		s2.add("Apple");
		s2.add(30);
		s2.add("Apple");   // This will be ignored (Duplicate Values)
		
		System.out.println(s2);
		
// TreeSet
		
		Set s3 = new TreeSet();
		
		s3.add("Cat");
		s3.add("Dog");
		s3.add("Monkey");
		s3.add("Kangaroo");
		s3.add("Kangaroo");
		
		System.out.println(s3);

	}
}
