package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int types = scan.nextInt();
		
		double[] prices = new double[types];
		String[] items = new String[types];
	
		
		for (int i = 0; i < types; i++) {
				items[i] = scan.next();
				prices[i] = scan.nextDouble();
		}
		int customers = scan.nextInt();
		double[] total = new double[customers];
		String[] first_names = new String[customers];
		String[] last_names = new String[customers];
		
		for (int j = 0; j < customers; j++) {
			double total2 = 0;
			first_names[j] = scan.next();
			last_names[j] = scan.next();
			int num_diff_items = scan.nextInt();
			for (int k = 0; k < num_diff_items; k++) {
				int food_amount = scan.nextInt();
				String new_food = scan.next();
				for (int l = 0; l < food_amount; l++) {
					for (int m = 0; m < types; m++) {
						if(new_food.equals(items[m])) {
							total2 += prices[m];
						}
					}
				}
			}
			total[j] = total2;
		}
		String biggest_first = "";
		String biggest_last = "";
		String smallest_first = "";
		String smallest_last = "";
		
		double biggest = 0;
		
		for (int n = 0; n < customers; n++) {
			if (total[n] >= biggest) {
				biggest = total[n];
				biggest_first = first_names[n];
				biggest_last = last_names[n];
			}
		}
		System.out.println("Biggest: " + biggest_first + " " + biggest_last + " (" + String.format("%.2f", biggest) + ")");
		
		double smallest = biggest + 1;
		for (int o = 0; o < customers; o++) {
			if (total[o] < smallest) {
				smallest = total[o];
				smallest_first = first_names[o];
				smallest_last = last_names[o];
			}
		}
		System.out.println("Smallest: " + smallest_first + " " + smallest_last + " (" + String.format("%.2f", smallest) + ")");
		
		double average = 0;
		for (int p = 0; p < customers; p++) {
			average += total[p];
		}
		average = average / total.length;
		
		System.out.println("Average: " + String.format("%.2f", average));
		//see if you can find a more compact way to do this
	
	}
}
