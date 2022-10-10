package com.te.javabasics.abstraction;

public interface Car {
   void brake();
   void accelerate();
   void gear();
   
   default void gps() {
	   
   }
	

}
