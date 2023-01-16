package Project;

import java.io.CharArrayReader;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicLongArray;

public class ProfitTask {

	public static void main(String[] args) {

		// String [] weekDay = {"Sunday", "Monday", "Tusday", "Wednesday", "Thursday",
		// "Friday", "Saturday"};

		ArrayList<Integer> RiceStock = new ArrayList<Integer>(List.of(900, 1200, 1200, 1210, 900, 750, 1050));

//		RiceStock.add(900);
//		RiceStock.add(1200);
//		RiceStock.add(1200);
//		RiceStock.add(1210);
//		RiceStock.add(900);
//		RiceStock.add(750);
//		RiceStock.add(1050);

		ArrayList<Integer> WheatStock = new ArrayList<Integer>(List.of(1100, 1900, 1500, 1500, 1500, 1500, 1400));
//		WheatStock.add(1100);
//		WheatStock.add(1900);
//		WheatStock.add(1500);
//		WheatStock.add(1500);
//		WheatStock.add(1500);
//		WheatStock.add(1500);
//		WheatStock.add(1400);

		ArrayList<Integer> CottonStock = new ArrayList<Integer>(List.of(200, 700, 300, 290, 600, 750, 350));

//		CottonStock.add(200);
//		CottonStock.add(700);
//		CottonStock.add(300);
//		CottonStock.add(290);
//		CottonStock.add(600);
//		CottonStock.add(750);
//		CottonStock.add(350);

		ArrayList<Integer> Profit = new ArrayList<>();
		for (int i = 0; i < RiceStock.size() - 1; i++) {
			System.out.println(RiceStock.get(i) - RiceStock.get(i + 1));
			Profit.add(RiceStock.get(i) - RiceStock.get(i + 1));

		}

		ArrayList<Integer> Profit1 = new ArrayList<>();
		for (int j = 0; j < WheatStock.size() - 1; j++) {
			System.out.println(WheatStock.get(j) - WheatStock.get(j + 1));
			Profit1.add(WheatStock.get(j) - WheatStock.get(j + 1));

		}
		ArrayList<Integer> Profit2 = new ArrayList<>();
		for (int l = 0; l < CottonStock.size() - 1; l++) {
			System.out.println(CottonStock.get(l) - CottonStock.get(l + 1));
			Profit2.add(CottonStock.get(l) - CottonStock.get(l + 1));
			// Profit.sort(null);

		}
		System.out.println("--------------------------------------------------");
		System.out.println("Profit for week-Rice Stock: "+Profit);
		System.out.println("Profit Efor week-Wheat Stock: "+Profit1);
		System.out.println("Profit for week-Cotton Stock: "+Profit2);
		System.out.println("--------------------------------------------------");
		System.out.println("Maximum Profit for Rice Stock : " + Collections.min(Profit));
		System.out.println("Maximum Profit for Wheat Stock : " + Collections.min(Profit1));
		System.out.println("Maximum Profit for Cotton Stock : " + Collections.min(Profit2));
		System.out.println("--------------------------------------------------");
		System.out.println(DayOfWeek.SUNDAY);
		System.out.println("Maximum Profit today for the three Stocks: "
				+ Math.min(Math.min(Profit.get(0), Profit1.get(0)), Profit2.get(0)));
		System.out.println(DayOfWeek.MONDAY);
		System.out.println("Maximum Profit today for the three Stocks: "
				+ Math.min(Math.min(Profit.get(1), Profit1.get(1)), Profit2.get(1)));
		System.out.println(DayOfWeek.TUESDAY);
		System.out.println("Maximum Profit today for the three Stocks: "
				+ Math.min(Math.min(Profit.get(2), Profit1.get(2)), Profit2.get(2)));
		System.out.println(DayOfWeek.WEDNESDAY);
		System.out.println("Maximum Profit today for the three Stocks: "
				+ Math.min(Math.min(Profit.get(3), Profit1.get(3)), Profit2.get(3)));
		System.out.println(DayOfWeek.THURSDAY);
		System.out.println("Maximum Profit today for the three Stocks: "
				+ Math.min(Math.min(Profit.get(4), Profit1.get(4)), Profit2.get(4)));
		System.out.println(DayOfWeek.FRIDAY);
		System.out.println("Maximum Profit today for the three Stocks: "
				+ Math.min(Math.min(Profit.get(5), Profit1.get(5)), Profit2.get(5)));

	}

}
