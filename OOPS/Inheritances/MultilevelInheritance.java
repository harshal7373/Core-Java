package Inheritances;

// Class MultiLevel A
class MultiLevelA {

	void m1() {

		System.out.println("This method 1 is from MultiLevelA");
	}

}

// Class MultiLevel B
class MultiLevelB extends MultiLevelA {

	void m1() {

		System.out.println("This method 1 is from MultiLevelB");
	}

	void m2() {
		System.out.println("This method 2 is from MultiLevelB");

	}

}

// Class MultiLevel C
class MultiLevelC extends MultiLevelB {

	void m2() {

		System.out.println("This method 2 is from MultiLevelC");
	}

	void m3() {
		System.out.println("This method 3 is From MultiLevelC");

	}

}

public class MultilevelInheritance {

	// Main Method
	public static void main(String[] args) {

		MultiLevelC a1 = new MultiLevelC();
		a1.m1();
		a1.m2();
		a1.m3();

	}
}
