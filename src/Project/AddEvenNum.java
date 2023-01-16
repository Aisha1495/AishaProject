package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddEvenNum {
	// Problem: Given an array of integers and a number k,
	// write a function to determine if there are two distinct elements in the array
	// that add up to k and both elements should be even number.
	// Input: [1, 2, 4, 6, 8, 10], k = 10
	// Output: true (2 + 8 = 10)
	public static void main(String[] args) {

		int EveNum[] = { 1, 2, 4, 6, 8, 10 };
		int diffrent = 0;
		int K = 10;
		int compare = 0;

		for (int i = 0; i < EveNum.length; i++) {
			for (int j = i; j < EveNum.length; j++) {
				if (EveNum[i] + EveNum[j] == K) {
					diffrent = EveNum[j] - EveNum[i];

					if (compare < diffrent) {
						compare = diffrent;
						System.out.println("The Two Even Numbers equal 10 are : " + EveNum[i] + " and " + EveNum[j]);

					}
				}
			}
		}
	}
}
