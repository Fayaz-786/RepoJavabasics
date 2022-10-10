package com.restaurant.javabasics.food;

import java.util.Scanner;

public class Hotel {
	public static void order() {
		Scanner input = new Scanner(System.in);
		System.out.println("Restaurant menu");
		String[] items = { "", "1.chicken biryani", "2.mutton biryani", "3.khabab",
				"4.chicken pakoda" };
		int[] price = { 0, 150, 200, 100, 80 };
		for (int i = 1; i < items.length; i++) {
			System.out.println(items[i]+"->"+price[i]);
		}
		System.out.println("Choose items");
		int sum = 0;
		while (true) {

			int n = input.nextInt();
			sum = sum + price[n];
			System.out.println(items[n]);
			System.out.println("if you want anything press yes");
			String yes = input.next();
			if (yes.equalsIgnoreCase("yes")) {
				System.out.println("which item you want");

				continue;
			} else {
				break;
			}
		}
		System.out.println("Total Bill->" + sum);

	}
}
