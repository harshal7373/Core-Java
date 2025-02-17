package Queue_Interface;

import java.util.PriorityQueue;

// Class Priority_Queue
public class Priority_Queue {

// Main Method
	public static void main(String[] args) {

// Priority Queue only for Integer

		PriorityQueue pq1 = new PriorityQueue(); // It add and remove elements on his priority
	
		pq1.add(70);
		pq1.add(30);
		pq1.add(90);
		pq1.add(10);
		pq1.add(20);

		System.out.println(pq1);

		pq1.remove();
		System.out.println(pq1);

// Priority Queue only for String

		PriorityQueue<String> pq2 = new PriorityQueue<String>();

		pq2.add("Harshal");
		pq2.add("Madhur");
		pq2.add("Aditya");
		pq2.add("Manas");
		pq2.add("Ashish");
		
		System.out.println(pq2);

		pq2.remove();
		System.out.println(pq2);

	}
}
