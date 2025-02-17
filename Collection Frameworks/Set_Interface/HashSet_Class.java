package Set_Interface;

import java.util.Collections;
import java.util.HashSet;

// Class HashSet_Class
public class HashSet_Class {

// Main Method
	public static void main(String[] args) {

// HashSet
		HashSet hs1 = new HashSet();
		
		hs1.add(10);
		hs1.add("Harshal");
		hs1.add(20);
		hs1.add("Madhur");
		hs1.add(50);
		hs1.add(10);         // This will be ignored (Duplicate Values)
		hs1.add("Harshal");  // This will be ignored (Duplicate Values)
		hs1.add("madhur");
		
		System.out.println(hs1);
		
		hs1.remove(10);
		System.out.println(hs1);
		
		hs1.remove("madhur");
		System.out.println(hs1);
		
		hs1.add(90);
		System.out.println(hs1);
		
		
// Hashset with String Generics
		
		HashSet<String> hs2 = new HashSet<String>();
		
		hs2.add("IceCream");
		hs2.add("Oranges");
		hs2.add("IceCream");   // This will be ignored (Duplicate Values)
		hs2.add("Apple");
		hs2.add("WarterMelon");
		hs2.add(null);
		
		System.out.println(hs2);
    
	}
}
