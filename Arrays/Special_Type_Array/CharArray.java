package Special_Type_Array;

public class CharArray {

	public static void main(String[] args) {

		// Static Fixed Method
		char a[] = new char[5];

		a[0] = 'A';
		a[1] = 'B';
		a[2] = 'C';
		a[3] = 'D';
		a[4] = 'E';

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// Dynamic Method
		System.out.println(" ");
		char b[] = { 'H', 'A', 'R', 'S', 'H' };

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		

	}
}
