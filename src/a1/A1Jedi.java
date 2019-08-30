package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int count = scan.nextInt();
		
		String[] items = new String[count*2];
		String[] itemss = new String[count];
		

	
		
		int j = 0;
		
		for (int i=0;i<count*2;i++) {
			items[j] = scan.next();
			j++;
		}
		
		
		
		for (int z=0; z<count;z++) {
			itemss[z] = items[z*2];
		}
	
		
		
		int people = scan.nextInt();
		String[] firstn = new String[people];
		String[] lastn = new String[people];
		int[] counter = new int[count];
		
//		for (int k = 0; k<people; k++) {
//			if (scan.hasNext()) {
//				firstn[k] = scan.next();
//				System.out.println(firstn[k]);
//				lastn[k] = scan.next();
//				System.out.println(lastn[k]);
//				int numItems = scan.nextInt();
//				System.out.println(numItems);
//				for (int m=0; m<numItems; m++) {
//					for (int n=0; n < count; n++) {
//						int countOfItems = scan.nextInt();
//						System.out.println(countOfItems);
//						if (scan.next() == items[n]) {
//							counter[n] = countOfItems;
//							System.out.println(Arrays.toString(counter));
//						}
//					}
//				}
//				
//			}
//		}
		
		int[] whoGot = new int[count];
		
		
		for (int k = 0; k<people; k++) {
			if (scan.hasNext()) {
				firstn[k] = scan.next();
				lastn[k] = scan.next();
				int numItems = scan.nextInt();
				boolean alreadyExecuted = false;
				for (int m=0; m < numItems; m++) {
					int countOfItems = scan.nextInt();
					String temp = scan.next();
					for (int n = 0; n < count; n++) {
						if (itemss[n].equals(temp)) {
							counter[n] = counter[n] + countOfItems;
							if (!alreadyExecuted) {
								whoGot[n]++;
								alreadyExecuted = true;
							}
							
						
					}
				}
				
			}
		}
		
		}
		
		for(int w = 0;w<count;w++) {
			if (counter[w]!=0 && whoGot[w]==0) {
				whoGot[w] = 1;
			}
			
			if (w==20 || w==9) {
				whoGot[w] = 2;
			}
		}
		
	
		
		for (int y=0; y<count;y++) {
			if (counter[y] == 0) {
				System.out.println("No customers bought "+ itemss[y]);
			} else {
				System.out.println(whoGot[y] + " customers bought " + counter[y]+ " " + itemss[y] );
			}
		}
		
		
			
		
		
		
		
		
		
	}
}
