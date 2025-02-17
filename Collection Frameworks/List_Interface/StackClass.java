package List_Interface;

import java.util.Stack;

// Class StackClass
public class StackClass {

// Main Method
	public static void main(String[] args) {

// Stack
		Stack st = new Stack(); // LIFO (Last in First Out)

		st.push(10);
		st.push("Harshal");
		st.push(89);
		st.push("Madhur");

		System.out.println(st);

		st.pop();
		System.out.println(st);

// Stack with Integer Generics
		Stack<Integer> st2 = new Stack<Integer>(); // LIFO (Last in First Out)

		st2.add(90);
		st2.add(50);
		st2.add(79);
		st2.add(30);
		st2.add(45);

		System.out.println(st2);

		st2.remove(1);
		System.out.println(st2);

		st2.pop();
		System.out.println(st2);
	}
}
