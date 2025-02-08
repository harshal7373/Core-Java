package Nested_Try_Catch_Blocks;

public class NestedTryCatchBlock {
// Main Method
	public static void main(String[] args) {

		try {

			try {
				System.out.println(10 / 0);
			} catch (Exception e1) {
				System.out.println(e1);
			}
			System.out.println("Hello World");

			int a[] = new int[1];
			a[7] = 11;

		} catch (Exception e2) {

			System.out.println(e2);

			try {
				String str = "10ABCD";
				int num = Integer.parseInt(str);
				System.out.println(num);
			} catch (Exception e3) {
				System.out.println(e3);
			}

			System.out.println("Hello Teknowell");
		}

	}
}
