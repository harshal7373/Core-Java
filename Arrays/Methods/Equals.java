package Methods;

import java.util.Arrays;

public class Equals {

	public static void main(String[] args) {
		
		System.out.println("-----One Dimension Array-----");
		// One Dimension Array
		int a[]= {11,22,33,44,55};
		int b[]= {1,2,3,4,5,6,7};
		int c[]= {11,22,33,44,55};
		
		if(Arrays.equals(a,b) || (Arrays.equals(a,c))){
		
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
		
		
		System.out.println("-----Two Dimesnion Array-----");
		// Two Dimesnion Array
		int d[][]= {{11,22,33,44},{10,20,30,40}};
		int e[][]= {{11,22,33,44},{10,20,30,40}};
		int f[][]= {{232,21,3242},{2131,242,123}};
		
		if(Arrays.deepEquals(d,e) || (Arrays.deepEquals(d,f))) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}
}
