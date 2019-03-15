package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		
		
		int hundred=0,decade=0,unit=0,temp=0;
		
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int n=input.nextInt();
		
		int m=0;
		m=num;
		
//这里不能num*=num,因为num会翻倍
		
		for(int i=0;i<n-1;i++ ){
			m*=num;
		}
		
		temp=m;
		unit=temp%10;
		temp/=10;
		decade=temp%10;
		temp/=10;
		hundred=temp%10;
		
		System.out.print(hundred+""+decade+""+unit+"");
	}	
		
}
