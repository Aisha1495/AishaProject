package Project;

import java.util.List;

public class project111 {
	public static void main(String[] arg) {

	List<Integer> numbers = List.of(1,2,22,2);
	
	int largesNum =Integer.MIN_VALUE;
	for(int number: numbers) {
		if (number>largesNum) {
			largesNum=number;
		}
	}
System.out.println("The Largest Number is: "+ largesNum);
}
}