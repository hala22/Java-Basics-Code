package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
	
		int temp=0,n=0;
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		temp=num;
		
		do{
			n=temp%10;
			temp/=10;
			System.out.print(n);
		}while(temp>0);
		
	}
		
}
