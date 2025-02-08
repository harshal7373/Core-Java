package Encapsulations;

class A {

	private int rno;
	private String name;
	private float marks;

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

}

public class Encapsulation {

	public static void main(String[] args) {

		A a1 = new A();

		a1.setRno(101);
		System.out.println(a1.getRno());

		a1.setName("Harshal");
		System.out.println(a1.getName());

		a1.setMarks(99);
		System.out.println(a1.getMarks());

	}
}
