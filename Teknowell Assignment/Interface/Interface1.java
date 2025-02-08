package Interface;

interface A{
	
	int num1=10;
	
	void get();
	
}

class B implements A {
	
	
	
	public void get(){
		
	System.out.println("We have get this number from interface A: " + num1);
			
	}
	
	public void accept() {
		
		int c = num1*num1;
		System.out.println("We have Square of that number: " + c);
	}
	
}

class Interface1 extends B{
	
	public static void main(String[] args) {
		
		B a1 = new B();

		a1.get();
        a1.accept();
		
	}
	
}