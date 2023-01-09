package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class project4 {
	public static void main(String[] args)
	{
	int[] numArray = {0,0,1,1,2,2,3,3,4,4};
	Arrays.sort(numArray);

	
	System.out.println("The values that have duplicate are:");

	if (numArray[0] == numArray[numArray.length - 1]) {
	System.out.print("  " + numArray[0]);
	} else {
	for (int i = 1; i < numArray.length - 1; i++) {
	if ((numArray[i] == numArray[i - 1] && numArray[i] != numArray[i + 1])
	|| (numArray[i] != numArray[i - 1] && numArray[i] == numArray[numArray.length - 1])) {
	System.out.print(" " + numArray[i]);

	}
	}

	}
	}
	}