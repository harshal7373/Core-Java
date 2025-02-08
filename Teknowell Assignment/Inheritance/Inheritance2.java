package Inheritance;

import java.util.Scanner;

class Date{
	
	int date=07;
	int month=01;
	int year=2005;
	
	
	void Accept(int date, int month, int year) {
		
		this.date=date;
		this.month=month;
		this.year=year;
			
	}
}

class Demo extends Date{
	
	void validate() {
		
		if(date==07 && month==01 && year==2005) {
			
			System.out.println("Happy Birthday Harshal");
		}
		
	}
	
}

class Inheritance2 extends Demo{
	
	public static void main(String[] args) {
		
		Demo a1 = new Demo();
		a1.validate();
		
	}
	
}