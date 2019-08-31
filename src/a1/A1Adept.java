package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int itemCount = scan.nextInt();
		String[] items = new String[itemCount];
		double[] prices = new double[itemCount];
				
		for (int i = 0; i < itemCount; i++) {
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		
		int peopleCount = scan.nextInt();
		String[] first = new String[peopleCount];
		String[] last = new String[peopleCount];
		double[] totals = new double[peopleCount];
		
		for (int j = 0; j < peopleCount; j++) {
			first[j] = scan.next();
			last[j] = scan.next();
			int itemPurchased = scan.nextInt();
			double total = 0;
			for (int i = 0; i<itemPurchased;i++) {
				int howMany = scan.nextInt();
				String temp = scan.next();
				for (int n=0; n<itemCount; n++) {
					if (items[n].equals(temp)) {
						total = total + (prices[n] * howMany);
					}
				}
			}
			totals[j] = total;
		}
		
	
		
		
		double max = findValueMax(totals);
		double min = findValueMin(totals);
		double totalA = 0;
		for (int i = 0; i<totals.length;i++ ) {
			totalA = totalA + totals[i]; 
		}
		double average = totalA/totals.length;
		
		String maxFirst = "";
		String maxLast = "";
		String minFirst = "";
		String minLast = "";
		
		for (int i = 0; i < totals.length; i++) {
			if (max == totals[i]) {
				maxFirst = first[i];
				maxLast = last[i];
			}
			
			if (min == totals[i]) {
				minFirst = first[i];
				minLast = last[i];
			}
		}
		
		System.out.println("Biggest: " + maxFirst + " " + maxLast + " (" + String.format("%.2f", max) +")");
		System.out.println("Smallest: " + minFirst + " " + minLast + " (" + String.format("%.2f", min) +")");
		System.out.println("Average: " + String.format("%.2f", average));
		
		
			
		 
	}
	static double findValueMax(double[] totals) {
		double cur_max = totals[0];
		for (int i=1; i < totals.length; i++) {
			if (totals[i] > cur_max) {
				cur_max = totals[i];
			}
		}
		return cur_max;
	}
	
	static double findValueMin(double[] totals) {
		double cur_min = totals[0];
		for (int i=1; i < totals.length; i++) {
			if (totals[i] < cur_min) {
				cur_min = totals[i];
			}
		}
		return cur_min;
	}
	
}
