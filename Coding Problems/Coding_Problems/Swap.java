package Coding_Problems;

public class Swap {
	
	void usingThirdVariable() {
		
	System.out.println("Using Third Variable: ");
	
		int madhur = 10;
		int manas = 30;
		int temp;
		
		temp = madhur;
		madhur = manas;
		manas = temp;
		
		System.out.println("Madhur: " + madhur +"\nManas: " + manas);
		
	}
	
	
	void withoutUsingThirdVariable() {
		
		System.out.println("\nWithout Using Third Variable: ");
		
		
		int prem = 40;
		int ashish = 50;
		
		prem = prem + ashish;        // prem = 40 + 50 = 90
		ashish = prem - ashish;      // ashish = 90 - 50 = 40
		prem = prem - ashish;        // prem = 90 - 40 = 50
		
		System.out.println("Prem: "+ prem + "\nAshish: " + ashish);
		
		
		
		
	}

	public static void main(String[] args) {
		
		
		Swap a1 = new Swap();
		
		a1.usingThirdVariable();
		a1.withoutUsingThirdVariable();
		
		
	}
}
