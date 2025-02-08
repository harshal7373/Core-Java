package Scanner;

import java.util.Scanner;

public class Scanner_User_Input {

	public static void main(String[] args) {
		
		Scanner_User_Input a1 = new Scanner_User_Input();
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Input any two number");
		
		int a=s1.nextInt();
		int b=s1.nextInt();
		
		int c=a+b;
		
		System.out.println("Additon between two numbers: "+c);
	}
}
