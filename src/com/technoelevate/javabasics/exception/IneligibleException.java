package com.technoelevate.javabasics.exception;

public class IneligibleException extends Exception{
  String message;
  public IneligibleException(String message){
	  this.message=message;
  }
  public String getMessage() {
	  return message;
  }
	

}