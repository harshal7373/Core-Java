package List_Interface;

import java.util.LinkedList;

// Class LinkedListClass
public class LinkedListClass {

// Main Method
	public static void main(String[] args) {
		
// LinkedList
		LinkedList l1 = new LinkedList();
		
		l1.add(34);
		l1.add("harshal");
		l1.add(233.3f);
		l1.add(true);
		
		System.out.println(l1);
		
		
// LinkedList With Integer Generics 
		
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		
		l2.add(11);
		l2.add(32);
		l2.add(21);
		
		System.out.println(l2);
		
		l2.addFirst(89);
		System.out.println(l2);
		
		l2.addLast(392);
		System.out.println(l2);
		
		l2.remove(0);
		System.out.println(l2);
		
		System.out.println(l2.get(3));
		
		
		
	}
}
