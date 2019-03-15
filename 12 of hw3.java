package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入时成绩：");
		int score=input.nextInt();
		
		if(score>=90&&score<=100){
			System.out.print("优");
		}else if(score>=80&&score<90){
			System.out.print("良");
		}else if(score>=70&&score<80){
			System.out.print("中");
		}else if(score>=60&&score<70){
			System.out.print("及格");
		}else if(score<60){
			System.out.print("不及格");
		}else{
			System.out.print("请重新输入");
		}
		
	}
	
	

}
