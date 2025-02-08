package Copy_Constructors;

public class CopyConstructorWithoutParameter {

	int rno;
	String name;
	
	CopyConstructorWithoutParameter(){
		
		rno=101;
		name="Harshal";
		
	}
	
	CopyConstructorWithoutParameter (CopyConstructorWithoutParameter a1){
		
		rno=a1.rno;
		name=a1.name;
		
		System.out.println("Roll no: "+ rno+ "\nName: "+name);
	}
	
	public static void main(String[] args) {
	
	CopyConstructorWithoutParameter a1 = new CopyConstructorWithoutParameter();
	CopyConstructorWithoutParameter a2 = new CopyConstructorWithoutParameter(a1);
	
	}
	
}
