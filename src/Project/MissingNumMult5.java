package Project;

import java.util.Arrays;

public class MissingNumMult5 {
	// Problem: Given an array of integers, write a function to find the missing
	// number in the array where the missing number should be a multiple of 5.
	// Input: [5, 10, 20, 25, 30],
	// Output: 15
	public static int getMissingNumber(int[] arr) {

		int n = arr.length;
		int m = n + 5;
		int total = m * (m + 5) / 2;
		int sum = Arrays.stream(arr).sum();
		return sum - total;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 10, 20, 25, 30 };
		System.out.println("List of numbers that multple 5 :{5,10,20,25,30} ");

		System.out.println("The missing number is " + getMissingNumber(arr));
	}
}
