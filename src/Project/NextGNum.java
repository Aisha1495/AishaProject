package Project;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NextGNum {

	public static void main(String[] args) {
//you would need to provide an array of integers as input to the function that finds the next greater element.

		int[] numbers = new int[] { 1, 6, 8, 4, 7, 9, 10 };

		int size = numbers.length;
		Arrays.sort(numbers);
		System.out.println("List of Numbers are: " + Arrays.toString(numbers));
		int res = numbers[size - 2];
		System.out.println("the Second largest number is : " + res);

	}

}
