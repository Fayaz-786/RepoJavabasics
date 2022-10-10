package com.technoelevate.javabasics.module;

public class AcessSpecifierDemo {
public void service() {
	System.out.println("service public");
}
protected void  display(){
	System.out.println("display procted");
}
private void development() {
	System.out.println("development private");
}
void show() {
	System.out.println("show default");
}
	public static void main(String[] args) {
    AcessSpecifierDemo acessSpecifierDemo=new AcessSpecifierDemo();
    acessSpecifierDemo.service();
    acessSpecifierDemo.display();
    acessSpecifierDemo.development();
    acessSpecifierDemo.show();
	}
	

}
