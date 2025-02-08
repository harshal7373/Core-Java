package constructors;

public class Constructor{
	
	Constructor(){
		
		System.out.println("My First Constructor");
	}
	
	Constructor(int num, String name){
		
		System.out.println("My Roll number: " + num + " and my name is: "+ name);
	}
	
	public static void main(String[] args) {
		
		Constructor a1 = new Constructor();
		Constructor a2 = new Constructor(101, "Harshal");
	}
}