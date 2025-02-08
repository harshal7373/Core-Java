package Anonymous_CLasses;

// First Interface 
interface AnonymousA {

	void m1();
}

// Second Abstract Class
abstract class AnonymousB {

	abstract void m2();

}

// Third Class
class AnonymousC {

	void m3() {
		System.out.println("Fish can swim");
	}
}
// Fourth Class
class AnonymousD{
	
      int calc(int a, int b) {
    	  return a+b;
      }
}

public class AnonymousCLass {

	// Main Method
	public static void main(String[] args) {

		// First Interface
		AnonymousA a1 = new AnonymousA() {

			public void m1() {
				System.out.println("This Method 1 is from Anonymous A");
			}

		};
		a1.m1();

		// Second Interface
		AnonymousB a2 = new AnonymousB() {

			void m2() {
				System.out.println("This Method 2 is from Anonymous B");
			}
		};
		a2.m2();

		// Third Class
		AnonymousC a3 = new AnonymousC() {

			void m3() {
				System.out.println("Fish can swim and take oxygen in water");
			}
		};
		a3.m3();
		
	}

}
