package Methods;

public class StringMethods {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("Hello World");

		System.out.println(str);

		System.out.println(str.charAt(6));

		System.out.println(str.append(" Namaste World"));

		System.out.println(str.delete(0, 5));

		System.out.println(str.deleteCharAt(0));

		System.out.println(str.length());

		System.out.println(str.replace(1, 5, "zzzzz"));

		System.out.println(str.reverse());

	}
}
