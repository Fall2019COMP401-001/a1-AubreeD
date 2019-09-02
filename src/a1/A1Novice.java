package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int customers = scan.nextInt();
		
		for(int i = 0; i < customers; i++) {
			String first = scan.next();
			String last = scan.next();
			int items = scan.nextInt();
			double price = 0;
			
				for(int j = 0; j < items; j++) {
					int type = scan.nextInt();
					String item_type = scan.next();
					double price_item = scan.nextDouble();
					price = price + (type * price_item);
				}
				String[] initial = first.split("");
				String first_letter = initial[0];
				
				System.out.println("\n" + first_letter + ". " + last + ": " + String.format("%.2f", price));
		}
		scan.close();
	}
}
