package Project;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


public class UndoRedoExpl{
//	provide inputs to the undo and redo operations, such as text strings or cursor positions.

	static Stack <String> stack1 = new Stack<>();
	static Stack <String> stack2 = new Stack<>();
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("press 1:Enter new / press 2:undo / press 3:redo");
		switch(sc.nextInt()) {
		case 1:
			System.out.println("Enter it:");
			stack1.push(sc.next());
			break;
			
		case 2:
			stack2.push(stack1.pop());
			break;
			
		case 3:
			stack1.push(stack2.pop());
			break;
		}
		System.out.println("Current data:"+Arrays.toString(stack1.toArray()).replace("[","").replace("]", "").replace(",", ""));
		System.out.println("Data for redo:"+Arrays.toString(stack2.toArray()).replace("[","").replace("]", "").replace(",", ""));
	}
	
	
}
}