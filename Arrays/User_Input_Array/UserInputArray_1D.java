package User_Input_Array;

import java.util.Scanner;

public class UserInputArray_1D {

	public static void main(String[] args) {
		
	
		Scanner s1 = new Scanner(System.in);
	
		System.out.println("-----One Dimension Array----");
		// One Dimension Array
		System.out.println("Mention Size of an Array");
		
		int size = s1.nextInt();
		
		int a[] = new int [size];
		
		System.out.println("Please input numbers");
		
		for(int i=0; i<size; i++) {
			a[i] = s1.nextInt();       // a[0] = s1.nextInt();   a[1] = s1.nextInt().....n 
					
		}
		
		for(int num : a) {
			System.out.println(num);
		}
		
		
		
	}
}
