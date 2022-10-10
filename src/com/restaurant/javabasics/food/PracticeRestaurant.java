package com.restaurant.javabasics.food;

import java.util.Scanner;

public class PracticeRestaurant {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
      String[] items= {"","1-Idly","2-Dosa","3-Puri"};
      int[] price= {0,50,60,40};
      System.out.println("Menu");
      for(int i=1;i<items.length;i++) {
    	  System.out.println(items[i]+"->"+price[i]);
      }
      System.out.println("Choose number of items you want");
      int n=input.nextInt();
      String[] ni=new String[n];
      int[] pi=new int[n];
      int sum=0;
      for(int i=0;i<n;i++) {
    	  System.out.println("choose an item");
    	  int it=input.nextInt();
    	 ni[i]=items[it];
    	 pi[i]=price[it];
    	 sum=sum+price[it];
    	 System.out.println(items[it]+"->"+price[it]);
    	 System.out.println("If you want anything else press yes");
    	 String yes=input.next();
    	 if(yes.equalsIgnoreCase("yes")) {
    		 continue;
    	 }
    	 else {
    		 break;
    	 }
    	  
      }
      System.out.println("Total bill-> "+sum);
      
      
      
      
	}

}
