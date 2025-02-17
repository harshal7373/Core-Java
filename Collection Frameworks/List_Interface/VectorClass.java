package List_Interface;

import java.util.Vector;

// Class VectorClass
public class VectorClass {

// Main Method
	public static void main(String[] args) {
		
		Vector vec = new Vector();
		
		vec.add(11);
		vec.add(32);
		vec.add(56);
		vec.add(null);
		
		System.out.println(vec);
		
		vec.add(3, 22);	
		System.out.println(vec);
		
		System.out.println(vec.contains(11));
		

// vector with String Generics
		
		Vector<String> vec1 = new Vector<String>();
		
		vec1.add("Harshal");
		vec1.add("Atharva");
		vec1.add("Ashish");
		vec1.add("Manas");
		
		System.out.println(vec1);
		
		vec1.remove(0);
		System.out.println(vec1);
		
	}
}
