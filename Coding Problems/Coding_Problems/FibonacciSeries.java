package Coding_Problems;

public class FibonacciSeries {

	public static void main(String[] args) {

		int curr = 0;
		int next = 1;
		int a;

		for (int i = 1; i <= 10; i++) {

			System.out.println(curr); // 0, 1, 1, 2

			a = curr + next; // a = 0+1 ->1, 1+1 ->2, 1+2 ->3,
			curr = next; // curr = 1, 1, 2
			next = a; // next = 1, 2, 3

		}

	}
}
