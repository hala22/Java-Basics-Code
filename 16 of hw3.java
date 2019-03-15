package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("请输入字母：");
		String week=input.next().toUpperCase();

		switch(week){
		case "M":
			System.out.print("星期一");
			break;
		case "TU":
			System.out.print("星期二");
			break;
		case "W":
			System.out.print("星期三");
			break;
		case "TH":
			System.out.print("星期四");
			break;
		case "F":
			System.out.print("星期五");
			break;
		case "SA":
			System.out.print("星期六");
			break;
		case "SU":
			System.out.print("星期日");
			break;
		}
		
		
		
	}	
		
}
