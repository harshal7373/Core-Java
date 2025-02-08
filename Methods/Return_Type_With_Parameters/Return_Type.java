package Return_Type_With_Parameters;

public class Return_Type {

	// Without Parameters
	void m1() {
		String a="Kunal";
		String b="Jack";
		
		System.out.println("String a: "+a);
		System.out.println("String b: "+b);
	}
	
	// With Parameters
	void m2(String a, String b) {
		
		System.out.println("String a+b: " + a+b);
	}
	
	public static void main(String[] args) {
		
		Return_Type a1 = new Return_Type();
		
		a1.m1();
		a1.m2("Lion", "Tiger");
		
	}
}
