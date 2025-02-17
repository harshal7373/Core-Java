package StreamApi;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMethod {

	public static void main(String[] args) {

// List		
		List list1 = new ArrayList();
		list1.add(20);
		list1.add(5);
		list1.add(10);
		list1.add(2);
		
		Stream<Integer> stream1 = list1.stream();
		stream1.map(n -> n*n).forEach(n -> System.out.println("Square: "+n));
	
// Queue
		Queue queue1 = new ArrayDeque();
		queue1.add("Harshal");
		queue1.add("Madhur");
		queue1.add("Manas");
		queue1.add("Prem");
		
	   Stream<String> stream2 = queue1.stream();
	 List listed1 = stream2.map(name -> name.toUpperCase()).collect(Collectors.toList());
          System.out.println("Converted to upperCase: " + listed1);
          
          
// Arrays.asList
          List list2 = Arrays.asList(30,20,10,40,5);
          
          Stream<Integer> stream3 = list2.stream();
          stream3.map(n -> n*2).forEach(System.out::println);
          
       
// Array
          String arr1[] = {"Apple", "Banana", "Orange", "Watermelon"};
          Stream<String> stream4 = Arrays.stream(arr1);
         List listed2 = stream4.map(name -> name.charAt(0)).collect(Collectors.toList());
	
         System.out.println("First Character of Word: "+listed2);
         
	}
}
