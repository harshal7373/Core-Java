package Inheritance;

import java.util.*;

class Shop {
	
	int shopId=101;
	String shopName="Occult Shop";
	String city="Pune";
	
	void Accept(int shopId, String shopName, String city) {
		
		this.shopId=shopId;
		this.shopName=shopName;
		this.city=city;
		
	}
	
	void Display() {
		
		System.out.println("The Shop Id: " + shopId + "\nThe Shop Name: " + shopName + "\nThe City: " + city);
			
	}
	
}
class Customer extends Shop{
	
	int cId;
	String cName;
	String product;


	void Accept1(int cId, String cName, String product) {
			
	this.cId=cId;
	this.cName=cName;
	this.product=product;
	
	}
	
	
	void Display1() {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter your ID, Name, and Product Name: ");
		
		int cId=s1.nextInt();
		String cName=s1.next();
		String product=s1.next();
		
		System.out.println("Customer CID: "+cId + "\nCustomer Name: " +cName+ "\nProduct Name: " + product);
		
	}
	
	
}
class Inheritance1 extends Customer{
	
	public static void main(String[] args) {
		
		Customer a1 = new Customer();
		a1.Display();
		a1.Display1();
		
	}
}
