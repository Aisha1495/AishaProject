package Project;

import java.util.Arrays;

public class ThirdHighNum {

	public static void main(String[] args) {
		
		
		int [] numbers = new int [] {100,64,22,68,99};
		
		int size = numbers.length;
			Arrays.sort(numbers);
			System.out.println("List of Numbers are: "+Arrays.toString(numbers));
			int res = numbers[size-3];
			System.out.println("the Third largest number is : "+ res);
			
			}
		}



