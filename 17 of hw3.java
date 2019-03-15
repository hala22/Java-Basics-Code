package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入年月");
		int year=input.nextInt();
		int month=input.nextInt();
		
		if(year%400==0||year%4==0&&year%100!=0){
			print(year,month,29);
		}else{
			print(year,month,28);
		}
		
		
	}
	
	public static void print(int year,int month,int Feb){
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.print(year+"年"+month+"月有31天");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print(year+"年"+month+"月有30天");
				break;
			case 2:
				System.out.print(year+"年"+month+"月有"+Feb+"天");
				break;
			default:
				System.out.print("输入错误");
				break;
					
		}
	}
	
	

}
