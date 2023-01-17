package Project;

import java.util.Stack;

public class StackDa {

	public static void main(String[] args) {
		// Implement a stack data structure in Java using an array, with push and pop operations.
		// first in last out (Stacks)
		
		Stack<String> cars = new Stack<>();
		cars.push("MG");
		cars.push("Neesan");
		cars.push("Toyota");
		cars.push("Ford");
		cars.push("Mazda");
		cars.push("Huonday");
		cars.push("Tesla");
		
		System.out.println("Cars company are : "+cars);
		cars.pop();
		cars.pop();
		
		System.out.println("Cars company update : "+ cars);
	}

}
