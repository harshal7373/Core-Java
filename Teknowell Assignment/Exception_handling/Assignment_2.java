package Exception_handling;

import java.util.*;
import java.*;

class Assignment_2{
	
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Please Enter your Employee ID, Name, Salary: ");
		int eID=s1.nextInt();
		String eName=s1.next();
		double eSalary=s1.nextDouble();
		
		try {
			
			if(eSalary==0) {
				throw new IllegalArgumentException();
			}
			
			       try {
				
				     if(eSalary>70000) {
					 throw new IllegalArgumentException();
				     }
				
			        }
			        catch(IllegalArgumentException e0) {
				
				     System.out.println("SALRAY OUT OF BOUND");
			       }
		
			
		}
		catch(IllegalArgumentException e1) {
			
			System.out.println("Salary must be greater than zero");
		}
		System.out.println(eID +" " + eName +" " + eSalary);	
		
	}
	
}
