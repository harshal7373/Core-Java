package IsAliveMethod;

// Class A
class A extends Thread{
	
//Run Method
	public void run() {
		
		String name = Thread.currentThread().getName();
		
		for(int i=1; i<=3; i++) {
			System.out.println("Madhur");
		}
		
	}
	
}

// Class B
class B extends Thread{
	
// Run Method
public void run() {
		
		for(int i=1; i<=3; i++) {
			System.out.println("Harshal");
		}
		
	}
	
}

// Class IsAlive
public class IsAlive {

// Main Method
	public static void main(String[] args) {
		
		A t1 = new A();
		B t2 = new B();
		
		System.out.println(t1.isAlive());   // isAlive Method
		t1.start();
		System.out.println(t1.isAlive());   // isAlive Method
		
		t2.start();
	}

	
}
