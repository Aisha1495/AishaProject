/**
 * 
 */
package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Project22 {

	public static void main(String[] args) {
		
		
		//print list of names in array 
		String[] names = {"Atyab", "Fatima", "Saeed", "Abdullah", "Malak", "Fatima", "Daniyal", "atyab", "Abdullah", "Abdullah"};
		
		Set<String> seeNames = new HashSet<>();
		 
		 for(String name : names) {
			 if (seeNames.contains(name)) {
				 System.out.println(name+ " is repeating name.");
		 } else {
		 seeNames.add(name);
	}
	}
	}}
