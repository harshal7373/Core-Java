package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctMethod {

	public static void main(String[] args) {

// Distinct dosn't allow duplicate values
		List l1 = new ArrayList();
		  
		l1.add(10);
		l1.add(30);
		l1.add(20);
		l1.add(10);
		l1.add(30);
		l1.add(10);
	
		
		Stream<Integer> stream1 = l1.stream();	
		stream1.distinct().forEach(System.out::println);
	
		
		
// Arrays.asList()		
		List l2 = Arrays.asList(10,50,70,30,10,30,50);
		
		Stream<Integer> stream2 = l2.stream();
		List listed1 = stream2.filter(n-> n>10).distinct().collect(Collectors.toList());
		
		System.out.println("Deleted Duplicate Values: " +listed1);
		
	}
}
