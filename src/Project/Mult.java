package Project;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Problem: Given an array of integers,
//write a function that finds the maximum product that can be formed by multiplying any four integers.
//Input: [1, 2, 3, 4, 5, 6]
//Output: 120 (6 * 5 * 4 * 3)

public class Mult {
	public static Integer[] Valuse = { 1, 2, 3, 4, 5, 6 };

	public static void main(String[] args) {

		Arrays.sort(Valuse, Comparator.reverseOrder());

		int total = 1;
		for (int i = 0; i < 4; i++) {
			total *= Valuse[i];

		}

		System.out.println("maximum of multiplying four integers is = " + total);

	}

}

////Math.max(Valuse[Valuse.length-1]*Valuse[Valuse.length-2]*Valuse[Valuse.length-3]*Valuse[Valuse.length-4], Valuse[0]*Valuse[1]*Valuse[Valuse.length-2]* Valuse[Valuse.length-1]);	