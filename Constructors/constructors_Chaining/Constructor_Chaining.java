package constructors_Chaining;

public class Constructor_Chaining {

	// First Constructor
	Constructor_Chaining(){
		
		this(20,"Harsh");
		System.out.println("This is First Constructor");
	}
	
	// Second Constructor
	Constructor_Chaining(int a){
		
		this();
		System.out.println("This is Second Constructor");
	}
	
	// Third Constructor
	Constructor_Chaining(int a, String b){
		
		System.out.println("This is Third Constructor");
	}
	
	
	public static void main(String[] args) {
	
		// We have call Second Constructor
		Constructor_Chaining a1 = new Constructor_Chaining(10);
		
	}
}
