package com.restaurant.javabasics.food;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu of restaurant");
		String[] items = { "", "1: Dosa", "2: Idly", "3: Vada", "4: Puri" };
		int price[] = { 0, 100, 80, 30, 60 };
		for (int i = 1; i < items.length; i++) {
			System.out.println(items[i]+"->"+price[i]);
		}
		int sum=0;
		while(true) {
		System.out.println("How many items you need");
		int n = sc.nextInt();
		System.out.println("which items do you need");
		int[] na = new int[n];
		String[] ns = new String[n];
		
		for (int i = 0; i < n; i++) {
			int orderedItem = sc.nextInt();
			sum = sum + price[orderedItem];
			ns[i] = items[orderedItem];
			na[i] = price[orderedItem];
		}
		for (int i = 0; i < ns.length; i++) {
			System.out.println(ns[i] + " " + na[i]);
		}
		System.out.println("if you want anything press yes");
		String yes=sc.next();
		if(yes.equalsIgnoreCase("yes")) {
			continue;
		}
		else  
			break;
	}	
		
		System.out.println("total amount : " + sum);

		
		
		
	}
}