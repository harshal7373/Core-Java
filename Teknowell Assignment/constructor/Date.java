package constructor;

class Date{
	
		
	
	Date (int date, int month, int year){
		
		
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			
			System.out.println("Leap Year");
		}
		
		else {
			System.out.println("Not a Leap Year");
		}
	
		
		System.out.println( "Date: "+ date + "/ Month: " + month + "/ Year: " + year);
	}
	
		
	public static void main(String[] args) {
		Date a1 = new Date(07,01,2005);
	}
}

