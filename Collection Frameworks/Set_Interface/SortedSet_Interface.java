package Set_Interface;

import java.util.SortedSet;
import java.util.TreeSet;

// Class SortedSet_Interface
public class SortedSet_Interface {

// Main Method
	public static void main(String[] args) {
		

		SortedSet s1 = new TreeSet();
		
		s1.add(10);
		s1.add(89);
		s1.add(90);
		s1.add(45);
		s1.add(20);
		s1.add(90);   // This will be ignore (Duplicate Value)
		
		System.out.println(s1);
	}
}
