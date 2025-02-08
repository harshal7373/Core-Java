package Compare_the_String;

public class CompareString {

	// Main Method
	public static void main(String[] args) {

		String str1 = "Hello World";
		String str2 = "Hello World";
		String str3 = "Namaste World";

		// Equals Method to Compare
		if (str1.equals(str2) || (str1.equals(str3))) {
			System.out.println("String are Equals");
		} else {
			System.out.println("Strings are not Equals");
		}

	}
}
