package Create_Arrays;

public class Jagged {

	public static void main(String[] args) {
		
		int a[][] = new int[3][];  // Declared 2D array with having 3 rows
	
		
		a[0] = new int[] {1,2,3}; 
		a[1] = new int[] {11,22};
		a[2] = new int[] {10,20,30,40};
		
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=0; j<a[i].length; j++) {
				
			System.out.print(a[i][j] + " ");
			}
		
		System.out.println();
		}
		
	}
	
}
// Note- Jagged Array requires only 2-Dimension (int[][] or Higher) Array. 