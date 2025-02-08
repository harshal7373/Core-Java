package Finally_Blocks;

public class NestedFinallyBlock {
// Main Method
	public static void main(String[] args) {

		try {

			System.out.println("Hello World");

			int a = 10 / 0;
			System.out.println(a);

			System.out.println("Hello Coders");

		} catch (ArithmeticException e1) {

			System.out.println(e1);
		} finally {

			System.out.println("This is a Finally Block");

			try {

				int a = 20 / 0;
				System.out.println(a);

			} catch (ArithmeticException e2) {

				System.out.println(e2);

			} finally {

				System.out.println("This is Second Finally Blcok");
			}
		}
	}
}
