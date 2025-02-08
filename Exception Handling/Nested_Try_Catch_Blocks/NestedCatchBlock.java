package Nested_Try_Catch_Blocks;

public class NestedCatchBlock {
// Main Method
	public static void main(String[] args) {

		try {
			int a = 10, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e1) {

			System.out.println(e1);

			try {

				int a[] = new int[5];
				System.out.println(a[7]);

			} catch (Exception e2) {

				System.out.println(e2);

				try {
					String str = "Harsh";
					int a = Integer.parseInt(str);
				} catch (NumberFormatException e3) {

					System.out.println(e3);

				}
			}
		}
	}
}
