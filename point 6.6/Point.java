package com.hala.point;

public class Point {
	
	int x;
	int y;
	
	
	public Point() {
		super();
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString(){
		return "("+this.x+","+this.y+")";
	}
	
}
