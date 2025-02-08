package Finally_Blocks;

public class FinallyBlock {
// Main Method
	public static void main(String[] args) {

		try {

			System.out.println("Learn Coding");

			int a = 10 / 0;
			System.out.println(a);

			System.out.println("Hello");

		} catch (ArithmeticException e1) {

			System.out.println(e1);

		} finally {

			System.out.println("This is Finally Block");

		}
		System.out.println("BYE CODE");

	}
}
