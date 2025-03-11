package Coding_Problems;

public class CheckLeapYearOrNot {

	public static void main(String[] args) {

		int year = 2005;

		if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println(year + ": it is a leap year");
		} else {
			System.out.println(year + ": it is not a leap year");
		}
	}

}
