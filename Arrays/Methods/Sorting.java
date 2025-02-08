package Methods;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		
		System.out.println("-----One Dimension Array------");
		// One Dimension Array
		int a[] = {11,44,22,22,66,343,452,12312};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		System.out.println("------Two Dimension Array-----");
		// Two Dimension Array
		char b[][]= {{'H','A','R','S'},{'J','A','C','K'}};
		
		for(char[] name:b) {
		Arrays.sort(name);	
		}
		
		for(char[] name:b) {
			System.out.println(Arrays.toString(name));
		}
	}
}
