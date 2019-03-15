package com.hala.vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle one =new Vehicle();
		
		one.setSpeed(100);
		one.setSize(200);
		
		one.move(1000);
		one.speedUp(10);
		one.speedDown(20);
	}

}
