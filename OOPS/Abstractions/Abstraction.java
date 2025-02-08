package Abstractions;

// Abstract Class
abstract class Animal {

	void m1() {

		System.out.println("Vocalization and Meals of Animal");
	}

	abstract void sound();

	abstract void meal();

}

// Dog class
class Dog extends Animal {

	void sound() {
		System.out.println("Barking");
	}

	void meal() {
		System.out.println("Pedigree");
	}

}

// Cat class 
class Cat extends Animal {

	void sound() {
		System.out.println("Purring");

	}

	void meal() {
		System.out.println("Milk");

	}
}

public class Abstraction {

	// Main Method
	public static void main(String[] args) {

		Dog a1 = new Dog();
		a1.m1();
		a1.sound();
		a1.meal();

		System.out.println("---------------------");

		Animal a2 = new Cat();
		a2.m1();
		a2.sound();
		a2.meal();

	}

}
