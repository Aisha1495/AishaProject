package Project;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SecondHighNum {

	public static void main(String[] args) {
		
		
		int [] numbers = new int [] {100,64,22,68,99};
		
		int size = numbers.length;
			Arrays.sort(numbers);
			System.out.println("List of Numbers are: "+Arrays.toString(numbers));
			int res = numbers[size-2];
			System.out.println("the Second largest number is : "+ res);
			
			}
		}


