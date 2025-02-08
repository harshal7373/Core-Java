package String_Joiner;

import java.util.StringJoiner;

public class Joiner {

	public static void main(String[] args) {
		
		StringJoiner str = new StringJoiner(":","[","]");
		
		str.add("H");
		str.add("A");
		str.add("R");
		str.add("S");
		str.add("H");
		
		System.out.println(str);
	}
}
