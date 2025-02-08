package Nested_Try_Catch_Blocks;

public class NestedTryBlock {
// Main Method
	public static void main(String[] args) {

		try {

			int a = 10 / 2;
			System.out.println(a);

			try {

				int arr[] = { 11, 22, 33, 44, 55 };
				System.out.println(arr[7]);

			} catch (Exception exp1) {
				System.out.println(exp1);
			}

		} catch (Exception exp2) {
			System.out.println(exp2);
		}

	}
}
