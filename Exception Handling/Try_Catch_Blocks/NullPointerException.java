package Try_Catch_Blocks;

public class NullPointerException {
// Main Method
	public static void main(String[] args) {

		try {
			String str = null;

			System.out.println(str.toUpperCase());
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
		}

	}

}
