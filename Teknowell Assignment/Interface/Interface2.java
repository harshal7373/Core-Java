package Interface;

import java.util.*;

interface Shape{
	
	
	void Area();
	void Perimeter();
	
}

class Interface2 implements Shape {
	
	
	public void Area(){
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Enter Length1 and Length2: ");
		
		float length1=s1.nextFloat();
		float length2=s1.nextFloat();
		
		float area = length1 * length2;
		System.out.println(area);
		
	}
	
	public void Perimeter(){
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Enter Length1 and Length2: ");
		
		float length1=s1.nextFloat();
		float length2=s1.nextFloat();
		
		float perimeter = 2 * (length1 * length2);
		System.out.println(perimeter);
		
	}
	
	public static void main(String[] args) {
			
	   
		Interface2 a1 = new Interface2();
	
		a1.Area();
		a1.Perimeter();		
		
	}
		
}