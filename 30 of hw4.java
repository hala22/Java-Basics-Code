package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		
		int sum=0;
		String in;
		Scanner input=new Scanner(System.in);
		
		for(int i=1;i<=5;i++){
			int num=0;
			System.out.println("欢迎光临第"+i+"家专卖店");
			
			do{
			System.out.println("要离开吗（y/n）?");
			in=input.next();
			if(in.equals("n")){
				System.out.println("买了一件衣服");
				num++;
				sum++;
			}else if(in.equals("y")){
				System.out.println("离店结账");
			}
			
			}while(num<3&&in.equals("n"));
			
			System.out.println();
			System.out.println();
	
		}
		
		System.out.println("总共买了"+sum+"件衣服");
		
	}
	
		
}
