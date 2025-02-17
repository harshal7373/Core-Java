package Queue_Interface;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

// Class Queue_Interface
public class Queue_Interface {

// Main Method
	public static void main(String[] args) {

// ArrayDeque
		Queue q1 = new ArrayDeque(); // FIFO (First in First Out)

		q1.add(10);
		q1.add("Harshal");
		q1.add("Madhur");
		q1.add(20);

		System.out.println(q1);

		q1.remove();
		System.out.println(q1);
		
// PriorityQueue only for Integer
		Queue q2 = new PriorityQueue();
		
		q2.add(10);
		q2.add(40);
		q2.add(25);
		q2.add(20);
		q2.add(10); 
		
		System.out.println(q2);
		
		q2.remove();
		System.out.println(q2);
		
	}
}
