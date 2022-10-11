package com.technoelevate.javabasics.exception;

import java.util.Scanner;

public class Election {
public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the age");
	int age=scanner.nextInt();

	VoteCheck eligibility=new VoteCheck();
       try {
			eligibility.vote(age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			}
	
}
}
