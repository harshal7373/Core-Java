package constructor;

class Voting{
	
	int eId=101;
	int age=19;
	String name="Harshal";
	
	Voting(){
		
		if(age>=18) {
			System.out.println("Employee is eligible for voting");
		}
		else {
			System.out.println("Employee is not eligible for voting");
		}
		
		System.out.println("Employee ID: " + eId + "\nEmployee Age: " + age + "\nEmployee Name: " + name);
	}
	
	public static void main(String[] args) {
		
		Voting a1 = new Voting();
	}
	
}
