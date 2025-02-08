package Try_Catch_Blocks;

public class ArithmeticException {
// Main Method
	public static void main(String[] args) {

		try {

			int a = 10;
			int b = 0;
			int c;

			c = a / b;

		} catch (Exception exp) {

			System.out.println(exp.toString());
		}
		
	}
}
