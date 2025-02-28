package comparator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;

public class comparatorInterface {

	public static void main(String[] args) {

// Integer 
		List l1 = new ArrayList();
		
		l1.add(55);
		l1.add(20);
		l1.add(13);
		l1.add(99);
		l1.add(86);
		l1.add(3);
		

		l1.sort(new myComparator());
		System.out.println(l1);   // Descending Order
		
		
// String 
		
	   Queue q1 = new ArrayDeque();
	   
	   q1.add("Banana");
	   q1.add("Apple");
	   q1.add("Zebra");
	   q1.add("Date");
	  
	   
	   List list = new ArrayList<>(q1);
	   
	   list.sort(new myStringComparator());
	   
	   System.out.println(list);
	   
	   
	   
	}
}

class myComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2 - o1;
	}	
}

class myStringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
