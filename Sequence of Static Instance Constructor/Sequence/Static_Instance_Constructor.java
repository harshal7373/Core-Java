package Sequence;

public class Static_Instance_Constructor {

	// Constructor Block
	
	Static_Instance_Constructor(){
		
		System.out.println("Constructor Called");
	}
	
	// Instance Block
	
	{
		System.out.println("Instance Block Called");
	}
	
	// Static Block
	static void m1() {
		
		System.out.println("Static Block Called");
		
	}
	
	
	public static void main(String[] args) {
		
		Static_Instance_Constructor.m1();
		
	Static_Instance_Constructor a1 = new Static_Instance_Constructor();
		
		
		
	}
}
