package Exception_handling;

import java.util.*;

class Assignment_1{

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
				
		System.out.println("Enter your Roll number, Age , Name:- ");
		
		int rollno=s1.nextInt();
		int age=s1.nextInt();
		String name = s1.next();

		
		try {
			
			if(rollno <=0) {
				throw new IllegalArgumentException("ROLL IN VALID");
			}
		
			     try {
			     if(age <=5) {
				 throw new IllegalArgumentException("Age is not Valid");
			      }
			   }
			     catch(IllegalArgumentException e0) {
				 System.out.println(e0);
			}
			
		}
		catch(IllegalArgumentException e1) {
			
			System.out.println(e1);
		}
		finally {
			
			System.out.println("Student name: " + name + " Student rollno " + rollno + " Student age: "+ age);
						
		}
			
	}
	
}