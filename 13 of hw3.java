package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输数字：");
		int date=input.nextInt();
		
		switch(date){
		case 1:
			System.out.print("星期一");
			break;
		case 2:
			System.out.print("星期二");
			break;
		case 3:
			System.out.print("星期三");
			break;
		case 4:
			System.out.print("星期四");
			break;
		case 5:
			System.out.print("星期五");
			break;
		case 6:
			System.out.print("星期六");
			break;
		case 7:
			System.out.print("星期日");
			break;
		default:
			System.out.print("输入错误，请重新输入");
				
		}
		
	}
	
	

}
