package com.hala.vehicle;

public class Vehicle {
	
	int speed;
	int size;
	
	
	
	public Vehicle() {
		super();
	}

	public Vehicle(int speed, int size) {
		super();
		this.speed = speed;
		this.size = size;
	}
	
	

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void move(int a){
		System.out.println("小车移动了"+a+"米");
	}
	
	public void speedUp(int a){
		System.out.println("加速前的速度是："+this.getSpeed());
		int speedNow=this.getSpeed();
		speedNow+=a;
		this.setSpeed(speedNow);
		System.out.println("现在速度是："+this.getSpeed());
	}
	
	public void speedDown(int a){
		//这里getSpeed本身就调用了this,所以不写this.也可以
		System.out.println("减速前的速度是："+this.getSpeed());
		int speedNow=this.getSpeed();
		speedNow-=a;
		this.setSpeed(speedNow);
		System.out.println("现在速度是："+this.getSpeed());
	}
	
}
