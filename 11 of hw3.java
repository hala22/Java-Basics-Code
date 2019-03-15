package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请依次输入时分秒");
		int hour=input.nextInt();
		int minute=input.nextInt();
		int second=input.nextInt();
		
		if(hour>=0&&hour<=23&&minute>=0&&minute<=59&&second>=0&&second<=59){
			System.out.print(hour+":"+minute+":"+second);
		}else{
			System.out.print("请重新输入");
		}
		
	}
	
	

}
