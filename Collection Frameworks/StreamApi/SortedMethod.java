package StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedMethod {

	public static void main(String[] args) {

// Sorted Method is used to sort the elements
		Integer arr1[] = {10,20,40,15,3,5};
		
		Stream stream1 = Stream.of(arr1);
		stream1.sorted().forEach(System.out::println);
		

// List
		List list1 = new ArrayList();
		
		list1.add(10);
		list1.add(5);
		list1.add(2);
		list1.add(1);
		list1.add(90);
		
		Stream<Integer> stream2 = list1.stream();
		
		List listed1 = stream2.filter(n-> n>1).sorted().collect(Collectors.toList());
	    System.out.println("Sorted by StreamApi Method: "+listed1);
	
	    Collections.sort(listed1);
	    System.out.println("Sorted by Collections Method: " +listed1);
	
	}
}
