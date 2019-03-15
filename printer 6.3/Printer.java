package com.hala.printer;

public class Printer {
	
	String brand;
	double price;
	
	
	
	public Printer(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public String toString(){
		return "这是"+brand+"打印机,"+"价格为："+price;
	}
	
	public void printer(String a){
		System.out.println("打印"+a);
	}
	
}
