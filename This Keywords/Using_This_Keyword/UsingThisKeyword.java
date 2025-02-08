package Using_This_Keyword;

public class UsingThisKeyword {

	int rno;
	String name;
	float marks;
	
	// Method 1
	void m1(int rno, String name, float marks) {
		
		this.rno=rno;
		this.name=name;
		this.marks=marks;
		
		System.out.println("Roll No: "+ rno + "\nName: "+name+ "\nMarks: "+marks);
		
	}
	
	// Validate Method
	void validate() {
		
		if(marks>35) {
			System.out.println("Congratulation You are Passed");
		}
		else {
			System.out.println("Sorry You have been Failed");
		}
		
	}
	
	// Main Method
	public static void main(String[] args) {
		
		UsingThisKeyword a1 = new UsingThisKeyword();
		a1.m1(101, "Harshal", 97);
		a1.validate();
		
	}
}
