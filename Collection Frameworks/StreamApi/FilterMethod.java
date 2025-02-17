package StreamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Class FilterMethod
public class FilterMethod {

// Main Method
	public static void main(String[] args) {

// List by using ArrayList (Collect() return new List, Set, or Map)
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(50);
		list1.add(5);

		Stream<Integer> stream1 = list1.stream();
		List listed1 = stream1.filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers: "+listed1);

		
// ArrayDeque ( forEach() doesn't return new collection (it returns void))
		ArrayDeque<Integer> queue1 = new ArrayDeque();
		queue1.add(10);
		queue1.add(50);
		queue1.add(20);
		queue1.add(5);

		Stream<Integer> stream2 = queue1.stream();
		stream2.filter(n -> n >= 20).forEach(System.out::println);

		
// Arrays (Collect return new List,set or map)
		String arr1[] = { "Aditya", "Ashish", "Madhur", "Harshal", "Manas", "Prem" };
		Stream<String> stream3 = Arrays.stream(arr1);
		List listed2 = stream3.filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println("Starts with A: " +listed2);
		
// Set ( forEach() doesn't return new collection (it returns void))
		Set set1 = new TreeSet();
		set1.add("Apple");
		set1.add("Watermelon");
		set1.add("Banana");
		set1.add("Orange");

		Stream<String> stream4 = set1.stream();
		stream4.filter(name -> name.length() > 5).forEach(name -> System.out.println("Greater than 5 length: " + name));
	

	}
}
