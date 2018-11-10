package com.hala.mineClearanceGame;

public class Floor {
	
	private boolean click=false;
	private char floor='#';
	private int num=0;
	private char mine='*';
	private int flag=2;
//	flag=1 - Mine flag=2 - NonMine
	
	
	public Floor() {
		super();
	}

	

	public Floor(boolean cleck, char floor, int num, char mine, int flag) {
		super();
		this.click = cleck;
		this.floor = floor;
		this.num = num;
		this.mine = mine;
		this.flag = flag;
	}



	public boolean isClick() {
		return click;
	}

	public void setClick(boolean cleck) {
		this.click = cleck;
	}

	public char getFloor() {
		return floor;
	}

	public void setFloor(char floor) {
		this.floor = floor;
	}



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public char getMine() {
		return mine;
	}



	public void setMine(char mine) {
		this.mine = mine;
	}



	public int getFlag() {
		return flag;
	}



	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	public void addNum(){
		int m=this.getNum();
		m++;
		this.setNum(m);
	}
	
	public void subNum(){
		int m=this.getNum();
		m--;
		this.setNum(m);
	}
	
	
	

}
