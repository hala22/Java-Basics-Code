package com.hala.c;

public class c {
	
	private int num0;
	private int num1;
	
	public c() {
		// TODO Auto-generated constructor stub
	}
	
	

	public c(int num0) {
		super();
		this.num0 = num0;
	}


	public c(int num0, int num1) {
		super();
		this.num0 = num0;
		this.num1 = num1;
	}



	public int getNum0() {
		return num0;
	}



	public void setNum0(int num0) {
		this.num0 = num0;
	}



	public int getNum1() {
		return num1;
	}



	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int absolute(int num){
		
		int result=0;
		if(num>=0){
			result=num;
		}else{
			result=-num;
		}
		return result;
	}
	
	public int min(int num0,int num1){
		int result=0;
		if(num0>=num1){
			result=num1;
		}else{
			result=num0;
		}
		return result;
	}
	
	public int factorial(int num){
		int result=1;
		for(int i=1;i<=num;i++){
			result*=i;
		}
		return result;
	}
	
	
}
