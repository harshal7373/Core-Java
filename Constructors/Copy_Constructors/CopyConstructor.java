package Copy_Constructors;

public class CopyConstructor {

	int sum;
	String name;
	
   //First Constructor
	CopyConstructor(int sum, String name){
		
		this.sum=sum;
		this.name=name;
		
		System.out.println("This is first Constructor");
		
	}
	
   //Second Constructor
	CopyConstructor(CopyConstructor a1){
		
		this.sum=a1.sum;
		this.name=a1.name;
		
		System.out.println("Student name: "+name + "\nSum: "+sum);
		
	}
	
	// Main Method
	public static void main(String[] args) {
		
		CopyConstructor a1 = new CopyConstructor(101, "Harsh");
		CopyConstructor a2 = new CopyConstructor(a1);
		
	}
}
