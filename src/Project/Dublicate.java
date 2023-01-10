package Project;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Dublicate {

	public static void main(String[] args) {
		
		
		//other answer :
		int[] array = new int[] { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4 };
		Map<Integer, Integer> map = new LinkedHashMap<Integer , Integer>();
		for (int i=0; i < array.length; i++) {
			int temp = array[i];
			int count =0;
			
			for ( int j =0; j< array.length; j++) {
				if (temp == array[j]) {
					count++;
				}
			}
			map.put(temp, count);
			
		}
			Set<Integer> duplicate = new LinkedHashSet<Integer>();
			Set<Integer> noDuplicate = new LinkedHashSet<Integer>();
			for (int i=0; i<array.length; i++) {
				if (map.get(array[i])>1) {
					duplicate.add(array[i]);
				}else {
					
					noDuplicate.add(array[i]);
				}
			}
					
			System.out.println("Duplicated numbers : "+ Arrays.toString(duplicate.toArray()));
			}
}


//		int[] array = new int[] { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4 };
//
//		for (int i = 0; i < array.length - 1; i++) {
//
//			for (int j = i + 1; j < array.length; j++) {
//				if ((array[i] == array[j]) && (i != j)) {
//					
//					System.out.println(array[j]);
//					//////////////////////////////////////
//					//System.out.println("repeted numbers are :" + array[j]);
//					// System.out.println( array[i] +" is repeated "+array[j]+" times ");
//
//				}
//
//			}
//
//		}


