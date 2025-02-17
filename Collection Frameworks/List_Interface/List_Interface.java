package List_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class List_Interface {

	public static void main(String[] args) {

		
// ArrayList
		System.out.println("-----------ArrayList----------");
		List<String> l1 = new ArrayList<String>();
		
		l1.add("Harshal");
		l1.add("Aditya");
		l1.add("Madhur");
		
		System.out.println(l1);
		
		System.out.println(l1.get(0));
		
		l1.remove("Madhur");
		l1.remove(0);
		System.out.println(l1);
		
//LinkedList
	System.out.println("----------Linked List----------");	
		List<Integer> l2 = new LinkedList<Integer>();
		
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		
		System.out.println(l2);
		
// Vector
	System.out.println("---------Vector---------");
		List l3 = new Vector();
		
		l3.add(10);
		l3.add("Jatin");
		l3.add("Parth");
		l3.add("Shashank");
		l3.add(89);
		
		System.out.println(l3);
		
// Stack
	System.out.println("---------Stack----------");
	     List l4 = new Stack();
	     
	     l4.add(90);
	     l4.add("Lion");
	     l4.add("monkey");
	     l4.add("Deer");
	     l4.add(99);
	     
	     System.out.println(l4);
	     
	
	}
}
