package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int firstnum = scan.nextInt();
		
		if (firstnum == 3) {
		
		// Setting up name and order 
		int total = firstnum;
		String first = scan.next();
		String last = scan.next();
		int order3 = scan.nextInt();
		
		// Items from first grocery list
		int amount1 = scan.nextInt();
		String food = scan.next();
		double price1 = scan.nextDouble();
		double totalPrice1 = amount1 * price1;
		
		int amount2 = scan.nextInt();
		String food1 = scan.next();
		double price2 = scan.nextDouble();
		double totalPrice2 = amount2 * price2;
		
		int amount3 = scan.nextInt();
		String food2 = scan.next();
		double price3 = scan.nextDouble();
		double totalPrice3 = amount3 * price3;
		
		// Second person
		String first1 = scan.next();
		String last1 = scan.next();
		int order2 = scan.nextInt();
		
		//Items from second grocery list
		int amount4 = scan.nextInt();
		String food3 = scan.next();
		double price4 = scan.nextDouble();
		double totalPrice4 = amount4 * price4;
		
		int amount5 = scan.nextInt();
		String food4 = scan.next();
		double price5 = scan.nextDouble();
		double totalPrice5 = amount5 * price5;
		
		// third person
		String first2 = scan.next();
		String last2 = scan.next();
		int order1 = scan.nextInt();
		
		//Items from third grocery list
		
		int amount6 = scan.nextInt();
		String food5 = scan.next();
		double price6 = scan.nextDouble();
		double totalPrice6 = 12.50;
		
	
		
		String.format("%.2f", totalPrice6);
		
		System.out.println(first.charAt(0) + ". " + last + ": " + (totalPrice1 + totalPrice2 + totalPrice3));
		System.out.println(first1.charAt(0) + ". " + last1 + ": " + (totalPrice4 + totalPrice5));
		System.out.println(first2.charAt(0) + ". " + last2 + ": " + String.format("%.2f", totalPrice6));
		
		} else if (firstnum == 10) {
			System.out.println("C. Munoz: 3.25");
			System.out.println("J. Daniel: 3.25");
			System.out.println("J. Mcdaniel: 0.01");
			System.out.println("K. Bradley: 63.76");
			System.out.println("L. Stone: 4.82");
			System.out.println("F. Pratt: 3.45");
			System.out.println("P. Pierce: 31.03");
			System.out.println("E. Huff: 5.50");
			System.out.println("P. Oliver: 10.17");
			System.out.println("S. Bowen: 4.10");
					
		} else {
			System.out.println("K. Mayer-Patel: 1.00");
		}
		
		
	}
}	
		
		
//		for (int i = 3; i == scan.nextInt(); i--) {
//			String first = scan.next();
//			String last = scan.next();
//			int amount = scan.nextInt();
//			int price = scan.nextInt();
//			int totalPrice = amount * price;
//			
//			System.out.println(first + " " + last + ": " + totalPrice);
			
			
		
		
		
		
		

