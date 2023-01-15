package Project;

import java.io.CharArrayReader;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicLongArray;


public class ProfitTask {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> RiceStock = new ArrayList<Integer>();

		
		RiceStock.add(900);
		RiceStock.add(1200);
		RiceStock.add(1200);
		RiceStock.add(1210);
		RiceStock.add(900);
		RiceStock.add(750);
		RiceStock.add(1050);
		
		ArrayList<Integer> WheatStock = new ArrayList<Integer>();
		WheatStock.add(1100);
		WheatStock.add(1900);
		WheatStock.add(1500);
		WheatStock.add(1500);
		WheatStock.add(1500);
		WheatStock.add(1500);
		WheatStock.add(1400);
		ArrayList<Integer> CottonStock = new ArrayList<Integer>();
		CottonStock.add(200);
		CottonStock.add(700);
		CottonStock.add(300);
		CottonStock.add(290);
		CottonStock.add(600);
		CottonStock.add(750);
		CottonStock.add(350);
		
		ArrayList<Integer> Profit = new ArrayList<>();
		for(int i=0; i<RiceStock.size()-1; i++) {
			System.out.println(RiceStock.get(i)-RiceStock.get(i+1));
			Profit.add(RiceStock.get(i));
		
			
		}
		
		ArrayList<Integer> Profit1 = new ArrayList<>();
			for(int j=0; j<WheatStock.size()-1; j++) {
				System.out.println(WheatStock.get(j)-WheatStock.get(j+1));
				Profit1.add(WheatStock.get(j));

			}	
			ArrayList<Integer> Profit2 = new ArrayList<>();
			for(int l=0; l<CottonStock.size()-1; l++) {
				System.out.println(CottonStock.get(l)-CottonStock.get(l+1));
				Profit2.add(CottonStock.get(l));
				//Profit.sort(null);
				
					
			}
			
		
		
			System.out.println(DayOfWeek.SUNDAY);
			System.out.println(Math.min(Profit.get(0), Profit1.get(0)));
			System.out.println(DayOfWeek.MONDAY);
			System.out.println(Math.min(Profit.get(1), Profit1.get(1)));
			//String [] weekDay = {"Sunday", "Monday", "Tusday", "Wednesday", "Thursday", "Friday", "Saturday"};
			
	}

}
