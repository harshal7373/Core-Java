package Multiple_Catch_Blocks;

public class MultipleCatchBlocks {
// Main Method
	public static void main(String[] args) {
		try {

			int a = 10 / 2;
			System.out.println(a);

			String str = "Harshal";
			System.out.println(str.toUpperCase());

			int[] num = { 11, 22, 33, 44, 55 };
			System.out.println(num[7]);

			String str1 = "ABC";
			int num1 = Integer.parseInt(str1);
			System.out.println(num1);

		} catch (ArithmeticException e) {

			System.out.println(e);
			System.out.println("Arithmetic Block");

		} catch (NullPointerException e) {

			System.out.println(e);
			System.out.println("NullPointer Block");

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e);
			System.out.println("ArrayIndexOutOfBounds");

		} catch (Exception e) {

			System.out.println(e);

		}
	}
}
