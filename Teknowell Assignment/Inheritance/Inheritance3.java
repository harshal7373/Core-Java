package Inheritance;

import java.util.*;

class Shop1{
	
	int shopId=101;
	String shopType="Grocery";
	String shopArea="Pune";
	
	
	void accept(int shopId, String shopType, String Area) {
		
		this.shopId=shopId;
		this.shopType=shopType;
		this.shopArea=shopArea;
		
	}
	
	void display() {
		
		System.out.println("Shop ID: " + shopId + "\nShop Type: " + shopType + "\nShop Address: " + shopArea);
		
	}
		
}

class Customer1 extends Shop1{
	
	int cId;
	String cName;
	String product;
	int qty;
	double productPrize=4000;
	double calculateQty;
	
	void custAccept() {
				
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter Id, Name, Product, and Quantity and ProductPrize: ");
		int cId=s1.nextInt();
		String cName=s1.next();
		String product=s1.next();
		int qty=s1.nextInt();
		double productPrize=s1.nextDouble();
		
		double calculateQty= qty * productPrize;
		
		
		System.out.println("Customer ID: " + cId + "\nCustomer Name: " + cName + "\nProduct: " + product + "\nQuantity: " + qty + "\nTotal Bill: " + calculateQty);
	
	}	
	
}

class Inheritance3 extends Customer1{
	
	public static void main(String[] args) {
		
		Customer1 a1 = new Customer1();
		a1.display();
		a1.custAccept();
	
	}
			
}
