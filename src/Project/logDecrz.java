package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class logDecrz {
	// Problem: Given an array of integers, write a function to find the longest
	// decreasing subarray.
	// Input: [1, 2, 3, 4, 5, 4, 3, 2, 1]
	// Output: [5, 4, 3, 2, 1]

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1));

		System.out.println("All Numbers  : " + nums);

		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(nums);
		nums.clear();
		nums.addAll(set);
		Collections.sort(nums, Collections.reverseOrder());
		System.out.println("Numbers Without duplicated  : " + nums);

	}

}
