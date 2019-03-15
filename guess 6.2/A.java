package com.hala.guess;

import java.util.Scanner;

public class A {
	
	int v=100;

	public void guess(){
		int num;
		Scanner input=new Scanner(System.in);
		do{
			System.out.println("请输入数字：");
			num=input.nextInt();
			if(num>v){
				System.out.println("大了！");
			}else if(num<v){
				System.out.println("小了！");
			}else{
				System.out.println("猜中了！");
			}
		}while(num!=v);
	}
}
