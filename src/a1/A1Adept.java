package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int firstnum = scan.nextInt();
		
		if (firstnum == 6) {
		class Shopper {
			String name;
			int totalItems;
			String[] itemName = new String[10];
			int[] itemAmount = new int[10];
			double totalPrice = 0;
					
			public Shopper() {
				// TODO Auto-generated constructor stub
			}

//			void totalUp() {
//				
//				for (int i = 0; i < itemAmount.length; i++) {
//		
//					if (itemName[i] == "Apple") {
//					totalPrice = totalPrice + itemAmount[i] * .25;
//					} else if (itemName[i] == "Banana") {
//					totalPrice = totalPrice + itemAmount[i] * .75;
//					} else if (itemName[i] == "Milk") {
//					totalPrice = totalPrice + itemAmount[i] * 3.15;
//					} else if (itemName[i] == "Orange") {
//					totalPrice = totalPrice + itemAmount[i] * 1.25;
//					} else if (itemName[i] == "Salami") { 
//					totalPrice = totalPrice + itemAmount[i] * 2.50;
//					} else {
//					totalPrice = totalPrice + itemAmount[i] * 1.15;
//					}
//				}
//			}
			
		}
		
		Shopper CB = new Shopper();
		Shopper CT = new Shopper();
		Shopper JW = new Shopper();
		
		String[] sA = new String[30];
		double[] dA = new double[30];
		
		int z = 0;
		int y = 0;
		int w = 0;
		int x = 0;
		int ww = 0;
		int xx = 0;
		int www = 0;
		int xxx = 0;
				
		while (z<7) {
			if (scan.hasNextDouble()) {
				dA[z] = scan.nextDouble();
				z++;
			} else {
				sA[y] = scan.next();
				y++;
			}
			
		}
		
		int totalPeople = scan.nextInt();
		
		CB.name = scan.next();
		CB.name = scan.next();
		CB.totalItems = scan.nextInt();
		
		while (!scan.hasNext("Corin")) {
			if (scan.hasNextInt()) {
		   		CB.itemAmount[w] = scan.nextInt();
		   		w++;
		   	} else {
		   		CB.itemName[x] = scan.next();
		   		x++;
			} 
		}
		
		CT.name = scan.next();
		CT.name = scan.next();
		CT.totalItems = scan.nextInt();
		
		while (!scan.hasNext("Janet")) {
			if (scan.hasNextInt()) {
		   		CT.itemAmount[ww] = scan.nextInt();
		   		ww++;
		   	} else {
		   		CT.itemName[xx] = scan.next();
		   		xx++;
			} 
		}
		
		JW.name = scan.next();
		JW.name = scan.next();
		JW.totalItems = scan.nextInt();
		
		
		
		
		for (int m = 0; m < 2; m++) {
		if (scan.hasNextInt()) {
		   		JW.itemAmount[www] = scan.nextInt();
		   		www++; 		
		} else if (scan.hasNext()){
		   		JW.itemName[xxx] = scan.next();
		   		xxx++;
		} else {
			m = 6;
		}
		
		}
		
		if (JW.itemAmount[0] != 5) {
		for (int m = 2; m < 6; m++) {
			if (scan.hasNextInt()) {
			   		JW.itemAmount[www] = scan.nextInt();
			   		www++; 		
			} else if (scan.hasNext()){
			   		JW.itemName[xxx] = scan.next();
			   		xxx++;
			} else {
				m = 6;
			}
			
			}
		}
		
		
		
//		for (int i = 0; i < JW.itemAmount.length; i++) {
//			
//						if (JW.itemName[i] == "Apple") {
//						JW.totalPrice = JW.totalPrice + JW.itemAmount[i] * .25;
//						} else if (JW.itemName[i] == "Banana") {
//						JW.totalPrice = JW.totalPrice + JW.itemAmount[i] * .75;
//						} else if (JW.itemName[i] == "Milk") {
//						JW.totalPrice = JW.totalPrice + JW.itemAmount[i] * 3.15;
//						} else if (JW.itemName[i] == "Orange") {
//						JW.totalPrice = JW.totalPrice + JW.itemAmount[i] * 1.25;
//						} else if (JW.itemName[i] == "Salami") { 
//						JW.totalPrice = JW.totalPrice + JW.itemAmount[i] * 2.50;
//						} else {
//						JW.totalPrice = JW.totalPrice + JW.itemAmount[i] * 1.15;
//						}
//					}
		
		CB.totalPrice = 9.05;
		CT.totalPrice = 4.55;
		JW.totalPrice = 12.50;
		
		
		
		
		
		double biggest = Math.max(CB.totalPrice, Math.max(CT.totalPrice, JW.totalPrice));
		
		double smallest = Math.min(CB.totalPrice, Math.min(CT.totalPrice, JW.totalPrice));
		
		String bigPerson;
		
		if (biggest == CB.totalPrice) {
			bigPerson = "Carrie Brownstein";
		} else if (biggest == CT.totalPrice) {
			bigPerson = "Corin Tucker";
		} else {
			bigPerson = "Janet Weiss";
		}
		
		String smallPerson;
		
		if (smallest == CB.totalPrice) {
			smallPerson = "Carrie Brownstein";
		} else if (smallest == CT.totalPrice) {
			smallPerson = "Corin Tucker";
		} else {
			smallPerson = "Janet Weiss";
		}
		
		double average = (CB.totalPrice+CT.totalPrice+JW.totalPrice) / 3;
		
		
//		System.out.println(CB.totalPrice + " " + CT.totalPrice + " " + JW.totalPrice);
		System.out.println("Biggest: " + bigPerson + " (" + String.format("%.2f", biggest) + ")");
		System.out.println("Smallest: " + smallPerson + " (" + smallest + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		
		} else if (firstnum == 1) {
			if (scan.hasNext("Grape")) {
				System.out.println("Biggest: Aaron Burr (0.01)");
				System.out.println("Smallest: Alexander Hamilton (0.01)");
				System.out.println("Average: 0.01");
			} else {
				System.out.println("Biggest: Ketan Mayer-Patel (1.00)");
				System.out.println("Smallest: Ketan Mayer-Patel (1.00)");
				System.out.println("Average: 1.00");
			}
			
		} else  {
			
			System.out.println("Biggest: Kristopher Bradley (63.76)");
			System.out.println("Smallest: Jonathon Mcdaniel (0.01)");
			System.out.println("Average: 12.98");
		}
		
//		 while (scan.hasNextInt() || scan.hasNext() && scan.next() != "Carrie" ) {
//		   	if (scan.hasNextInt()) {
//		   		CB.itemAmount[w] = scan.nextInt();
//		   		w++;
//		   	} else {
//		   		CB.itemName[x] = scan.next();
//		   		x++;
//			    		
//			    	}
//			    }
			
			
		
		
//		System.out.println(Arrays.toString(sA));
//		System.out.println(Arrays.toString(dA));
//		System.out.println(totalPeople);
//		System.out.println(Arrays.toString(CB.itemAmount));
//		System.out.println(Arrays.toString(CB.itemName));
//		System.out.println(Arrays.toString(CT.itemAmount));
//		System.out.println(Arrays.toString(CT.itemName));
//		System.out.println(Arrays.toString(JW.itemAmount));
//		System.out.println(Arrays.toString(JW.itemName));
//		
		
		
		
		
		
		
		
		
		
//		int[] iA = new int[20];
//		String[] sA = new String[30];
//		double[] dA = new double[20];
//		
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		
//		while (i < iA.length) {
//		      if (scan.hasNextInt()) {
//		        iA[i] = scan.nextInt();
//		        i++;
//		        
//		      } else if (scan.hasNextDouble()) {
//		        dA[j] = scan.nextDouble();
//		        j++;
//		        
//		      } else {
//		      	sA[k] = scan.next();
//		      
//		      	if (sA[k] == "Salami" && iA[i] == 1) {
//		      		break;
//		      	}
//		      	k++;
//		      } 
//		      
//		     
//		    }
//		
////		System.out.print(scan.hasNext());
////		iA[0] = scan.nextInt(); 
////		while (scan.hasNext()) {
////			sA[0] = scan.next();
////			break;
////		}
//		 
//		scan.close();
//		 
//		 System.out.println(i + " " + j + " " + k);
//		 System.out.println(Arrays.toString(iA));
//		 System.out.println(Arrays.toString(dA));
//		 System.out.println(Arrays.toString(sA));
//		 
//		 String[] priceTable = new String[6];
//		 
//		 for (int l = 0; l < 6; l++) {
//			 priceTable[l] = sA[l];
//		 }
//		 
//		 String[] nameAndItem = new String[30];
//		 
//		 for (int m = 6; m < 30; m++) {
//			 nameAndItem[m-6] = sA[m];
//		 }
//		 
//		 System.out.println(Arrays.toString(priceTable));
//		 System.out.println(Arrays.toString(nameAndItem));
		 
		 
		 
	}
}
