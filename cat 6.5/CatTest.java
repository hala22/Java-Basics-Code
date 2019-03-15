package com.hala.cat;

import java.util.Scanner;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat one=new Cat("小黑",2,"黑色");
		Cat two=new Cat("小白",5,"白色");
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入小猫的名字：");
		String name=input.next();

		
		if(name.equals(one.getName())){
			one.printer();
		}else if(name.equals(two.getName())){
			two.printer();
		}else{
			System.out.println("小红没有养这只猫");
		}
	}

}
