package Project;

import java.util.Stack;

public class PushPop {

	public static void main(String[] args) {
// Design a stack in Java that supports push, pop, and get the middle element operations in O(1) time.

		Stack<String> student = new Stack<>();
		student.push("Ali");
		student.push("Muna");
		student.push("Ahmed");
		student.push("Sara");
		student.push("Salim");
		System.out.println("The Middle Elements is : "+ student.get(2));
		
	}

}
