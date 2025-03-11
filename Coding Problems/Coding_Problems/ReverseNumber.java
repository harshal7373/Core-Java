package Coding_Problems;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 10;
		int mod;
		
		
		while(num>0) {      //10>0 ->true, 1>0 ->true
			
			mod = num%10;   //mod = 10%10 ->0, mod = 1%10 -> 1(because we havn't use float datatype)
			
			System.out.print(mod);  //0, 1
			
			num = num/10;   //num = 10/10 ->1, num = 1/10 ->0(Stored)
		}
		
	}
}
