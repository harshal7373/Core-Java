package Super_Keyword;

// Class Super1
class Super1 {

	void m1() {
		System.out.println("This is from Super1 Class");
	}

}

// Class Super2
class Super2 extends Super1 {

	void m1() {

		System.out.println("This is from Super2 Class");
		super.m1();
	}

}

public class Super {

	// Main Method
	public static void main(String[] args) {

		Super2 a1 = new Super2();
		a1.m1();

	}
}
