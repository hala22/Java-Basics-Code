package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("请输入年龄：");
		int age=input.nextInt();
		
		if(age>=60){
			System.out.print("老年人");
		}else if(age>=40&&age<60){
			System.out.print("中年人");
		}else if(age>=20&&age<40){
			System.out.print("青年人");
		}else if(age>=10&&age<20){
			System.out.print("青少年");
		}else{
			System.out.print("儿童");
		}
		
		
	}	
		
}
