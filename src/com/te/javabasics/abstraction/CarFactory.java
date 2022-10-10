package com.te.javabasics.abstraction;


import java.util.Scanner;

public class CarFactory {
	public static Car getCar() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the car name");
		String input = scanner.next();
		if(input.equalsIgnoreCase("Audi")) {
				return new Audi();
		}
		else if(input.equalsIgnoreCase("BMW")) {
			return new BMW();
		}
		return null;	
	}
}
