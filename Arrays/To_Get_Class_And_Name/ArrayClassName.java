package To_Get_Class_And_Name;

public class ArrayClassName {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3 };
		double b[][] = { { 223.5, 112.4, 45.3 }, { 23.5, 44.3, 55.27, 66.5 } };
		float c[] = { 34.2f, 45.5f };
		char d[] = { 'h' };
		String e[] = { "Hello" };

		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
		System.out.println(d.getClass().getName());
		System.out.println(e.getClass().getName());

	}
}
