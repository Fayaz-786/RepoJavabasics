package com.restaurant.javabasics.food;

public class AIOOBException extends Exception {
	String msg;
	AIOOBException(String msg){
		this.msg=msg;
		
	}
   public String getMessage() {
	   return msg;
   }
}