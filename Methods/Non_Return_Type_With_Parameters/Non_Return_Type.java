package Non_Return_Type_With_Parameters;

public class Non_Return_Type {

	// Without Parameters
	void m1() {
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition of a and b: " + c);
		
	}
	
	//With Parameters
	void m2(int a, int b) {
		
	int c=a+b;
	
	System.out.println("First number: " + a);
	System.out.println("Second number: " + b);
	System.out.println("Addition: " + c);
		
	}
	
	public static void main(String[] args) {
		
		Non_Return_Type a1 = new Non_Return_Type();
		a1.m1();
		a1.m2(35, 12);
	}
}
