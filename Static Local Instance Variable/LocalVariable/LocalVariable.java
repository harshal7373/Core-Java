package LocalVariable;

public class LocalVariable {

	
	void m1() {
		
		int a=10;
		String b="Jack is jumping";
		int c=11;
		
		System.out.println("Local Variables are:- " + a +"\n"+ b +"\n"+ c);
	}
	
	public static void main(String[] args) {
		
		LocalVariable a1 = new LocalVariable();
		a1.m1();
		
	}
}
