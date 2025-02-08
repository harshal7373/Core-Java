package Throws;

public class ThrowsException {

	public static void main(String[] args)throws InterruptedException, ArithmeticException, Exception {
		
		Thread.sleep(1000);
		System.out.println("Hello World");
		
		
		int a = 10/0;
		System.out.println(a);
		
		
	}
}
