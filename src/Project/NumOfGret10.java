package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumOfGret10 {
	// Problem: Given an array of integers, write a function to find the number of times a given integer value appears in the array where the value is greater than 10.
	//Input: [1, 2, 15, 20, 15, 30, 20, 15, 15], val = 15
	//Output: 4
	public static void main(String[] args) {
		ArrayList<Integer> nums =  new ArrayList <> (Arrays.asList(1, 2, 15, 20, 15, 30, 20, 15, 15));
		List<Integer> result = new ArrayList<>();
		for (Integer val : nums) {
			if (val.intValue()>10) {
				result.add(val);
			}
		}

System.out.println(nums);
System.out.println("Number of the given integer value that greater than 10 is: "+ result.size() + " Which is : " + result);
	}

}
