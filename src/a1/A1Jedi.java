package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int types = scan.nextInt();
		double[] prices = new double[types];
		String[] item = new String[types];
		int[] num_items = new int[types];
		int[] customers_bought = new int[types];
	
		for (int i = 0; i < types; i++) {
			item[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		int customers = scan.nextInt();
		
		for (int j = 0; j < customers; j++) {

			String first = scan.next();
			String last = scan.next();
			int diff_items = scan.nextInt();
			//boolean[] food = new boolean[types];
			for (int k = 0; k < diff_items; k++) {
				int amount = scan.nextInt();
				String[] new_food = new String[types];
				String newFood = scan.next();
				
				for (int l = 0; l < types; l++) {
					new_food[l] = newFood;
					if (newFood.equals(item[l])) {
						num_items[l] += amount;
						customers_bought[l]++;
						//food[l] = true;
					}
					//if (countInArray(new_food, newFood) == 1) {
					//	customers_bought[l]++;
					//for (int z = 0; z < num_type; z++) {
					//		food[l] = false;
					//	}
				//	}
				//	if (food[l] == false) {
					//	customers_bought[1]++;
					//}
				}
			}	
		}
		for (int m = 0; m < types; m++)	{
			if (num_items[m] == 0) {
				System.out.println("No customers bought " + item[m]);
			} else {
				System.out.println(customers_bought[m] + " customers bought " + num_items[m] + " " + item[m]);
			}
		}
	}
		




	
	// You can define / use static helper methods here.

	
}
