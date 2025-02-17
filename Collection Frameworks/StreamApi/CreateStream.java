package StreamApi;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;

// Class CreateStream
public class CreateStream {

// Main Method
	public static void main(String[] args) {
	
		
// Empty Stream
		Stream<String> stream = Stream.empty();	

		
// Stream on ArrayList
			ArrayList list1 = new ArrayList();
			   list1.add(10);
			   list1.add(50);
			   list1.add(20);
			   list1.add(5);
			Stream stream3 = list1.stream();		

// Stream on List by using Arrays.asList
		List list2 = Arrays.asList(10,20,30,"Harshal");
		Stream stream2 = list2.stream();
		

		
// Stream on Queue by using ArrayDeque
		Queue queue = new ArrayDeque();
		   queue.add(10);
		   queue.add(50);
		   queue.add(20);
		   queue.add(90);
		Stream stream6 = queue.stream();
	    
		

// Stream on Array by using integer
		Integer arr[] = {69,76,82,92};
		Stream stream4 = Arrays.stream(arr);   // Casting is necessary, otherwise use Integer instead of int, (if int is using then it throw an exception)
		
// Stream on Array by using String
		String arr1[] = {"Harshal","Vijay","Chaitanya","Tejas"};
		Stream stream5 = Arrays.stream(arr1);
		
	}
}
