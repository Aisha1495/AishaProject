package Project;

import java.util.Scanner;
import java.util.Stack;

public class checkStack {

	public static void main(String[] args) {
//Create a function in Java that checks whether a given string is a palindrome using a stack.

		
		System.out.println("Enter any String Words: ");
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		Stack<Object> stack = new Stack<>();
		
		for (int i =0; i< inputString.length(); i++) {
			stack.push(inputString.charAt(i));
		}
		
		String reverString = "";
		while (!stack.isEmpty()){
			reverString=reverString+stack.pop();
		}
		if (inputString.equals(reverString)) 
			System.out.println("The input String is a plindrome.");
		 else {
			System.out.println("The input String is not a plindrome!!.");
		}
	}
}