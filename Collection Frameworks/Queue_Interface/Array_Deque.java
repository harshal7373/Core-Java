package Queue_Interface;

import java.util.ArrayDeque;

public class Array_Deque {

	public static void main(String[] args) {

// ArrayDeque	
		ArrayDeque ad1 = new ArrayDeque(); // FIFO (First in First Out)

		ad1.add(10);
		ad1.add("Harshal");
		ad1.add(20);
		ad1.add("Madhur");
		ad1.add(30);

		System.out.println(ad1);

		ad1.remove();
		System.out.println(ad1);

		ad1.poll();
		System.out.println(ad1); // Just like remove

		ad1.pollLast();
		System.out.println(ad1);

// ArrayDeque with generics

		ArrayDeque<Integer> ad2 = new ArrayDeque<Integer>();
		ad2.add(10);
		ad2.add(50);
		ad2.add(30);
		ad2.add(90);
		ad2.add(68);

		System.out.println(ad2);

		ad2.remove();
		System.out.println(ad2);

		ad2.poll();
		System.out.println(ad2); // Just like remove

		ad2.pollLast();
		System.out.println(ad2);

	}
}
