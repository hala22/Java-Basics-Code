package com.hala.c;

import java.util.Scanner;

public class TestC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		c one=new c();
		Scanner input=new Scanner(System.in);
		
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		int result1=one.absolute(num1);
		System.out.println("绝对值："+result1);
		int  result2=one.min(num1, num2);
		System.out.println("最小值："+result2);
		int result3=one.factorial(num2);
		System.out.println("阶乘："+result3);
	}

}
