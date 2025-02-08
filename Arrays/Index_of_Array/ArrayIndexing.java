package Index_of_Array;

public class ArrayIndexing {

	public static void main(String[] args) {
		
		System.out.println("-----One Dimension Array-----");
		// One Dimension Array
		int a[] = {11,22,33,44,55};
		
		System.out.println("Element at Position 0: " + a[0]);
		System.out.println("Element at Position 4: " + a[4]);
		System.out.println("Element at Position 2: " + a[2]);
		
		
		
		System.out.println("-----Two Dimension Array-----");
		// Two Dimension Array
		int b[][] = {{10,20,30,40},{100,200,300,400,500}};
		
		System.out.println("Element at row 1 and column 2: " + b[1][2]);
		System.out.println("Element at row 0 and column 0: " + b[0][0]);
		System.out.println("Element at row 1 and column 5: " + b[1][4]);
	}
}
