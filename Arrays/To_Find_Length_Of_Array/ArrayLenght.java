package To_Find_Length_Of_Array;

public class ArrayLenght {

	public static void main(String[] args) {
		
		System.out.println("----One Dimension Array------");
		// One Dimension Array
		int a[] = {11,22,3344};
		
		System.out.println("Length of 1D Array: " + a.length);
		
		System.out.println("-------Two Dimension Array--------");
		// Two Dimension Array
		int b[][] = {{10,20,30,40}, {100,200,300}};
		
		System.out.println("Number of Rows in 2D array " + b.length);
		System.out.println("Number of Columns in First row: " +b[0].length);
		System.out.println("Number of Columns in Second row: " +b[1].length);
		
	}
}
