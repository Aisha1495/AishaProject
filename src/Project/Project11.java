/**
 * 
 */
package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Project11 {

	/**
	 * @param args
	 */
	public static void main(String[] arg) {

		ArrayList<String> names1 = new ArrayList<>(
				Arrays.asList("Atyab", "Fatima", "Saeed", "Abdullah", "Malak", "Fatima", "Daniyal", "atyab", "Abdullah", "Abdullah"));

		// TODO Auto-generated method stub
		HashMap<String, Integer> nameFrequency = new HashMap<>();

		for (String name : names1) {
			if (nameFrequency.containsKey(name)) {
				nameFrequency.put(name, nameFrequency.get(name) + 1);
			} else {
				nameFrequency.put(name, 1);
			}

		}

		for (Map.Entry<String, Integer> entry : nameFrequency.entrySet()) {
			if (entry.getValue() > 0) {
				System.out.println(entry.getKey() + "   appears " + entry.getValue() + " times. ");

			}
		}
	}

}
