package String_Tokenizers;

import java.util.StringTokenizer;

class Tokenizer {

	public static void main(String... args) {

		StringTokenizer a1 = new StringTokenizer("Hello World , Harshal this side. I am glad to meet you up here.");

		while (a1.hasMoreTokens()) {

			System.out.println(a1.nextToken());

		}

	}

}
