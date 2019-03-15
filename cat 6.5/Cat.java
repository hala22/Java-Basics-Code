package com.hala.cat;

public class Cat {
	
	String name;
	int age;
	String color;
	
	public Cat(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void printer(){
		System.out.println("name:"+this.name+
				",age:"+this.age+
				",color:"+this.color);
	}
	
	
	
}
