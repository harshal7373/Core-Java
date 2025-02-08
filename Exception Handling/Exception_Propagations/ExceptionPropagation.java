package Exception_Propagations;

public class ExceptionPropagation {

// Method 1
	public static void m1() {

		m2();
	}

// Method 2
	public static void m2() {

		m3();
	}

// Method 3
	public static void m3() {

		int a = 10 / 0;

	}

	// Main Method
	public static void main(String[] args) {

		try {
			m1();
		} catch (Exception exp) {
			System.out.println(exp);
		}
	}
}
