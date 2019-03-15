package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输数字：");
		int date=input.nextInt();
		
		switch(date){
		case 12:
		case 1:
		case 2:
			System.out.print("冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.print("春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.print("夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.print("秋季");
		default:
			System.out.print("输入错误，请重新输入");
			break;
				
		}
		
	}
	
	

}
