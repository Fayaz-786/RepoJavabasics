package com.technoelevate.javabasics.module1;

import com.technoelevate.javabasics.module.AcessSpecifierDemo;

public class AcessSpecifierDemo2 extends AcessSpecifierDemo {

	public static void main(String[] args) {
		//AcessSpecifierDemo2 acessSpecifierDemo2=new AcessSpecifierDemo2();
	//	AcessSpecifierDemo acessSpecifierDemo=new AcessSpecifierDemo();
		AcessSpecifierDemo acessSpecifierDemo=new AcessSpecifierDemo2();
		acessSpecifierDemo.service();
		  
		   AcessSpecifierDemo2 acessSpecifierDemo2=(AcessSpecifierDemo2)acessSpecifierDemo;
		   acessSpecifierDemo2.display();
		  //acessSpecifierDemo.development();
		 // acessSpecifierDemo.show();
	}

}
