package Try_Catch_Blocks;

public class ArrayIndexOutOfBoundException {
// Main Method
	public static void main(String[] args) {

		int a[] = { 11, 22, 33, 44, 55 };

		try {
			System.out.println(a[3]);

			System.out.println(a[7]); // Here Exception Occur because in array there are only 5 elements
		} catch (Exception exp) {
			System.out.println(exp.getStackTrace());
		}

	}
}
