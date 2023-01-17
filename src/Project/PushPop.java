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
		System.out.println(student);
		System.out.println("The Middle Name of Student is : "+ student.get(2));
		
		System.out.println();
		
		// other answer :
		
		Stack<String> Color = new Stack<>();
		Color.push("Red");
		Color.push("Blue");
		Color.push("Black");
		Color.push("White");
		Color.push("Green");
		String mid = Color.get(Color.size()/2);
		System.out.println(Color);
		System.out.println("The Middle Color is :  "+ mid);
	}

	
}

