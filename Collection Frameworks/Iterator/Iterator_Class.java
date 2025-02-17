package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

// Class Iterator_Class
public class Iterator_Class {

// Main Method
	  public static void main(String[] args) {
	
// ArrayList
		  ArrayList list1 = new ArrayList();
		  
		  list1.add(10);
		  list1.add("Harshal");
		  list1.add(50);
		  list1.add("Gaurav");
		  
		  System.out.println(list1);
		  
		  Iterator it1 = list1.iterator();
		  
		  while(it1.hasNext()) {
			  System.out.println("Iterate: " + it1.next());
		  }
		  
		  	
// PriorityQueue		  
		  
		  System.out.println("----------Queue Interface---------");
		  
		  PriorityQueue queue1 = new PriorityQueue();
		  
		  queue1.add(10);
		  queue1.add(50);
		  queue1.add(20);
		  queue1.add(5);
		  queue1.add(100);
		 
		  System.out.println(queue1);
		  
		  Iterator it2 = queue1.iterator();
		  
		 for(int i=1; i<=5; i++) {
			 System.out.println(it2.next());
			 System.out.println(it2.hasNext());
		 }
		 
// TreeSet
		 
		 System.out.println("-----------Set Interface--------");
		 
		 TreeSet<String> set1 = new TreeSet();;
		 
		 set1.add("Orange");
		 set1.add("Apple");
		 set1.add("Banana");
		 set1.add("Pineapple");
		 
		 System.out.println(set1);
		 
		 Iterator it3 = set1.iterator();
		 
		 System.out.println(it3.next());      // Iterate
		 System.out.println(it3.hasNext());   // Boolean Values
		 System.out.println(it3.next());      // Iterate
		 System.out.println(it3.hasNext());    // Boolean Values
		 System.out.println(it3.next());       // Iterate
		 System.out.println(it3.hasNext());     // Boolean Values
		 System.out.println(it3.next());        // Iterate
		 System.out.println(it3.hasNext());      // Boolean Values
		 
		 
		  
	}
}
