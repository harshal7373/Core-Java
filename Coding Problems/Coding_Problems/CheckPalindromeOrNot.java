
package Coding_Problems;

class CheckPalindromeOrNot{
	
	public static void main(String[] args) {
		
		int num = 121;
		int orignalNum = num;  // 121
		int mod;
		int reversedNum=0;
		
		while(num>0) {
			
			mod = num % 10;   //mod = 121%10 -> 1, 12%10 -> 2, 1%10
			reversedNum = reversedNum * 10 + mod;    //reversedNum = 0 * 10 + 1 ->1 || 1 * 10 + 2 ->12 || 12 * 10 + 1
			num = num / 10;  //num = 121/10 ->12, 12/10 ->1
			
		}
		
		if(orignalNum==reversedNum) {
			System.out.println("It is an Palindrome number");
		}
		else {
			System.out.println("\nIt is not an palindrome number");
		}
		
	}
	
	
}