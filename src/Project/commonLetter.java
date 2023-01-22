package Project;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;

public class commonLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String[] array = { "Hallo", "MAttth", "Poll", "world" };
		for (String lr : array) {
			String[] letterArray = lr.split("");
			
			count(letterArray);
		}
		
		
			
					
	}
	static void count(String[] name) {
		HashMap<String, Integer> words = new HashMap<String, Integer>();
		Integer count = 0;
		for(String n :name ) {
			words.put(n, 0);
		}
		
		
		for (String n :words.keySet() ) {
			count=0;
			for(String h :name ) {
				
				if(n.equals(h)) {
					count++;
					
				}
			}
			words.put(n, count);
		}
		System.out.println(words);
	
	}
	
	
	
	
	
//		for (int i = 0; i < words.size(); i++) {
//			count = 1;
//
//			for (int j = i + 1; j < i; j++) {
//				if (count.equals(i) == count.equals(j) && count.equals(i)) {
//					System.out.println(words + "");
//					break;

				
			

		}

	

