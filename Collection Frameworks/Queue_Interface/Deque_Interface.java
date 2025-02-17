package Queue_Interface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Deque_Interface {

	public static void main(String[] args) {
	
// ArrayDeque
		System.out.println("------ArrayDeque------");
		Deque<Integer> d1 = new ArrayDeque<Integer>();
		
		d1.add(10);
		d1.add(20);
		d1.add(60);
		d1.add(40);
		d1.add(30);
		
		System.out.println(d1);
		
		d1.remove();
		System.out.println(d1);
		
		d1.poll();
		System.out.println(d1);
		
		d1.pollLast();
		System.out.println(d1);
		
		
// LinkedList
		System.out.println("------LinkedList------");
		
		Deque d2 = new LinkedList();
		
		d2.add("Harshal");
		d2.add(10);
		d2.add("Orange");
		d2.add(20);
		d2.add("Apple");
		
		System.out.println(d2);
		
		d2.addFirst(87);
		System.out.println(d2);
		
		d2.addLast("Icecream");
		System.out.println(d2);
		
		d2.remove();
		System.out.println(d2);
		
		d2.poll();
		System.out.println(d2);
		
		d2.pollLast();
		System.out.println(d2);
		
	}
}
