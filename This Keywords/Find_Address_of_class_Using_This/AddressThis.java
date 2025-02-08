package Find_Address_of_class_Using_This;

public class AddressThis {
	
	// Method 1
	void m1() {
		
		System.out.println(this);   // Address Found
		
	}

	// Main Method
	public static void main(String[] args) {
		
		AddressThis a1 = new AddressThis();
		a1.m1();
		
		System.out.println(a1);     // Address Found 
	}
}
