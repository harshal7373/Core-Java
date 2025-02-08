package Methods;

import java.util.Arrays;

public class ArraysUtilityMethods {

	public static void main(String[] args) {
		
		System.out.println("----toString Method-----");
		
		// toString
		int a[]= {11,22,33,44,55};
		String b[]= {"Harshal","Atharva","Madhur","Manas","Ashish"};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		
		System.out.println("-----asList Method-----");
		
		// asList
		String c[] = {"Python","Java","Javascript","C"};
		
		System.out.println(Arrays.asList(c));
		
		
		System.out.println("-----deepToString Method------");
		// deepToString
		
		int d[][]= {{100,200,300,400},{111,222,333,444}};
		String e[][] = {{"Harshal","Java","Chaitanya","Javascript"},{"Manas","Madhur"}};
		
		System.out.println(Arrays.deepToString(d));
		System.out.println(Arrays.deepToString(e));
		
	}
	
	
  
}
