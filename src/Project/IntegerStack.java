package Project;

import java.util.Stack;

public class IntegerStack {

	public static int main(int[] arr) {
//Given a list of integers, implement a stack in Java that can return the second largest element in O(1) time.

		Stack<Integer> stack = new Stack<>();

		int max = Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax=max;
				max=arr[i];
				
			}else if(arr[i]> secondMax && arr[i] < max) {
				secondMax=arr[i];
			}
		}
		return secondMax;
	}
	public static void main(String[] args) {
		int[]arr= {3,2,1,5,4,9,10};
		System.out.print("\"The the second largest number is\" ");
		System.out.println(main(arr));
	}
}
