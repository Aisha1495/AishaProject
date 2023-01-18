package Project;

import java.util.Scanner;
import java.util.Stack;

public class PostfixStack {

	public static void main(String[] args) {
		//Create a function in Java that evaluates a postfix expression using a stack.

		double firstNum , secondNum;
		double output;
		Stack <String> stack = new Stack<>();
		stack.push("-");
		stack.push("+");
		stack.push("/");
		stack.push("*");
		stack.push("("+")");
		System.out.println("Equation used : "+stack);
		System.out.println();
		System.out.println("First highest power: "+stack.pop());
		System.out.println("Second highest power: "+stack.pop());
		System.out.println("Third highest power: "+stack.pop());
		System.out.println("Fourd highest power: "+stack.pop());
		System.out.println("Last highest power: "+stack.pop());
	}
}

