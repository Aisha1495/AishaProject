package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class project4 {
	public static void main(String[] args)
	{
		// q4 find  two number that sum to 6 from array list
		
		
	ArrayList<Integer> numbers = new ArrayList<> ();
	numbers.add(2);
	numbers.add(3);
	numbers.add(4);
	numbers.add(5);
	numbers.add(1);
	numbers.add(7);
	numbers.add(10);
	
	for ( int i = 0; i< numbers.size(); i++) {
		for (int j = i +1; j < numbers.size(); j++) {
			if (numbers.get(i)+ numbers.get(j)==6)
			{
				System.out.println("Found two numbers that sum to 6 : " + numbers.get(i)+" and " +numbers.get(j));}
			}
	}
	
	}
	}