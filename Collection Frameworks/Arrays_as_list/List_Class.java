package Arrays_as_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Class List_Class
public class List_Class {

// Main Method
	public static void main(String[] args) {
		
// List
		List list = Arrays.asList(10,20,30,"Harshal",50,"Madhur",50);
			
		System.out.println(list);
		
		list.set(1, "Apple");
		System.out.println(list);
		
		
// List with Integer Generics
		System.out.println("------Integer Generics--------");
		List<Integer> list2 = Arrays.asList(10,40,20,30,14);
		
		System.out.println(list2);
		
		System.out.println(list.get(0));
		
		
// Copy elements and paste to another List
		System.out.println("--------- Copy and Paste----------");
		List<Integer> l1 = Arrays.asList(10,15,3,5,7,6,22);
		List<Integer> l2 = new ArrayList();
		List<Integer> l3 = new ArrayList();
		
		 for(int num:l1) {
			 
			 if(num%2==0) {
				 l2.add(num);
			 }
			 else {
				 l3.add(num);
			 }
			 
		 }
		 
		 System.out.println("Orignal List: " +l1);
		 System.out.println("Even Numbers: " +l2);
		 System.out.println("Odd Numbers: " +l3);	
		
	}
}
