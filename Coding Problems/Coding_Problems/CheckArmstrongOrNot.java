package Coding_Problems;

public class CheckArmstrongOrNot {

	public static void main(String[] args) {

		int num = 153;
		int mod;
		int arm = 0;
		int orignalNum = num;

		while (num > 0) { // 153>0 ->true, 15>0 ->true, 1>0 ->true

			mod = num % 10; // mod= 153%10 ->3 || 15%10 ->5 ||
			arm = (mod * mod * mod) + arm; // arm= (3*3*3)+0 ->27 || (5*5*5)+27 ->152 || (1*1*1)+152 ->153
			num = num / 10; // 15, 1

		}

		if (orignalNum == arm) {
			System.out.println("It is an ArmStrong number");
		} else {
			System.out.println("It is not an ArmStrong number");
		}
	}
}
