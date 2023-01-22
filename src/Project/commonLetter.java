package Project;

import java.util.ArrayList;
import java.util.HashMap;

public class commonLetter {

	public static void main(String[] args) {

		String[] array = { "Hallo", "MAttth", "Poll", "world" };
		for (String lr : array) {
			String[] letterArray = lr.split("");

			count(letterArray);
		}

	}

	static void count(String[] name) {
		HashMap<String, Integer> words = new HashMap<String, Integer>();
		Integer count = 0;
		for (String n : name) {
			words.put(n, 0);
		}

		for (String n : words.keySet()) {
			count = 0;
			for (String h : name) {

				if (n.equals(h)) {
					count++;
					
					
					for(String g : words.keySet()) {
						if( ) {
							
						}
					}

				}
			}
			words.put(n, count);
		}
		System.out.println(words);

	}



}
