package Customization;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

// Class b
class B{
	
	private int rno;
	private String name;
	private float marks;
	private String city;
	
	
	public B(int rno, String name, float marks, String city) {
		super();
		this.rno = rno;
		this.name = name;
		this.marks = marks;
		this.city = city;
	}


	@Override
	public String toString() {
		return "B [rno=" + rno + ", name=" + name + ", marks=" + marks + ", city=" + city + "]";
	}
		
}

// Class Queue_With_Custom_Class
public class Queue_With_Custom_Class {

// Main Method
	public static void main(String[] args) {
	
// Queue Interface and ArrayDeque Class
		Queue q1 = new ArrayDeque();
		
		q1.add(new B(101,"Harshal",87.5f,"Pune"));
		q1.add(new B(102,"Athavra",77.9f,"Pune"));
		q1.add(new B(103,"Ashish",87.4f,"Pune"));
		q1.add(new B(104,"Prem",78.9f,"Pune"));
		
// Iterator
		Iterator itr = q1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
