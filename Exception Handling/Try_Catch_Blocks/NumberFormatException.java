package Try_Catch_Blocks;

public class NumberFormatException {
// Main Method
	public static void main(String[] args) {

		String str = "Harshal";

		try {
			int num = Integer.parseInt(str);

			System.out.println(num);
		} catch (Exception exp) {
			System.out.println(exp.getLocalizedMessage());
		}

	}
}
