package Without_Using_This_Keyword;

public class WithoutUsingThisKeyword {

	int id;
	String name;
	long mono;
	int age;
	
	// Method 1
	void m1(int uid, String uname, long mob, int uage) {
		
		id=uid;
		name=uname;
		mono=mob;
		age=uage;
		
		System.out.println("Employee Id: " + id);       // we have take left side id
		System.out.println("Employee Name: " + name);   // we have take left side name
		System.out.println("Employee Mob no: " + mob);  // we have take right side mob
	 	System.out.println("Employee Age: " + uage);    // we have take right side uage
	}
	
	// Main Method
	public static void main(String[] args) {
		
		WithoutUsingThisKeyword a1 = new WithoutUsingThisKeyword();
		a1.m1(101, "harshal", 32983232,19);
	}
}
