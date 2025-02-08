package Interfaces;

// First Interface
interface Greeting {

	void sayHello();

}

// Second Interface
interface FunctionalA {

	void Add(int a, int b);
}

// Third Interface
interface FunctionalB {

	int cal(int a, int b);
}

public class FunctionalInterface {

	// Main Method
	public static void main(String[] args) {

		// First Functional Interface
		Greeting greet = () -> System.out.println("Hello World");
		greet.sayHello();

		// Second Functional Interface
		FunctionalA add = (int a, int b) -> System.out.println(a + b);
		add.Add(30, 40);

		// Third Functional Interface
		FunctionalB calc = (int a, int b) -> a * b;
		System.out.println(calc.cal(10, 30));

	}
}
