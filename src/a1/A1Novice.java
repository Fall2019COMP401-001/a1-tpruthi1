package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int count = scan.nextInt();
		
		for (int i = 0; i<count; i++) {
			String first = scan.next();
			String last = scan.next();
			int itemCount = scan.nextInt();
			double total = 0;
			for (int j = 0; j < itemCount; j++) {
				int amount = scan.nextInt();
				String grocery = scan.next();
				double price = scan.nextDouble();
				total = total + amount*price;
			}
			System.out.println(first.charAt(0) + ". " + last + ": " + String.format("%.2f", total));
		}
		
		
		
	
		
	}
}	
		
	
			
		
		
		
		
		

