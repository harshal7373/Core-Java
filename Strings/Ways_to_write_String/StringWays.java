package Ways_to_write_String;

public class StringWays {

	public static void main(String[] args) {
		
		//String 
		String str1 = "Harshal is good boy";
		System.out.println(str1);
		
		//String Object
		String str2 = new String("Harshal is bad boy");
		System.out.println(str2);
		
		//Char Array
		char ch[] = {'a','b','c','d'};
		System.out.println(ch);
		
		//String Buffer Object
		StringBuffer str3 = new StringBuffer("Hello World");
		System.out.println(str3);
		
		//String Builder Object
		StringBuilder str4 = new StringBuilder("Namaste World");
		System.out.println(str4);
		
	}
}
