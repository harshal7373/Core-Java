// Class Animal
class Animal {

	void m1() {
		System.out.println("Animals are cute");
	}

}

// Class Lion
class Lion extends Animal {

	void m2() {
		System.out.println("Lion is Dangerous");
	}
}

class A {

}

// Class InstanceOf_Class
public class InstanceOf_Class {

// Main method
	public static void main(String[] args) {

		Lion a1 = new Lion();
		Animal a3 = new Lion();

		System.out.println(a1 instanceof Animal);
		System.out.println(a3 instanceof Animal);

	}
}
