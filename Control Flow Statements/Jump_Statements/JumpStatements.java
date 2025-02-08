package Jump_Statements;

class JumpStatements {

	// Method 1
	void m1() {

// break;

		int i;

		for (i = 1; i <= 10; i++) {

			if (i == 5) {
				break; // It Exit the loop
			}
			System.out.println(i);
		}

	}

	// Method 2
	void m2() {

		// continue;

		int i;

		for (i = 1; i <= 10; i++) {

			if (i == 5) {
				continue; // It skip the current Iteration
			}
			System.out.println(i);
		}
	}

	public static void main(String... args) {

		JumpStatements a1 = new JumpStatements();
		a1.m1();
		a1.m2();

	}
}
