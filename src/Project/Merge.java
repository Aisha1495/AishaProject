package Project;

import java.util.ArrayList;

public class Merge {

	public static void main(String[] args) {

		// merge two list in order
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(4);
		arr.add(6);
		arr.add(7);
		arr.add(9);

		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(2);
		arr1.add(5);
		arr1.add(8);
		arr1.add(10);

		ArrayList<Integer> merge = new ArrayList<>();
		for (int i = 0; i < arr.size(); i++) {
			merge.add(arr.get(i));
		}
		for (int i = 0; i < arr1.size(); i++) {
			merge.add(arr1.get(i));

		}
		merge.sort(null);
		System.out.println(merge);
	}

}


