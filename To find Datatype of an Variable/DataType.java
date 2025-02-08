
public class DataType {

	void AcceptData(Object input) {

		if (input instanceof Integer) {
			System.out.println(input + ":-It is an Integer");
		}

		if (input instanceof String) {

			System.out.println(input + " :- it is an String");

		}
		if (input instanceof Float) {

			System.out.println(input + " :- it is an Float");

		}
		if (input instanceof Double) {

			System.out.println(input + " :- it is an Double");

		}
		if (input instanceof Boolean) {

			System.out.println(input + " :- it is an Boolean");

		}

	}

	public static void main(String... args) {

		DataType a1 = new DataType();
		a1.AcceptData(20);
		a1.AcceptData("Hello World");
		a1.AcceptData(20.5f);
		a1.AcceptData(45000d);
		a1.AcceptData(true);

	}

}
