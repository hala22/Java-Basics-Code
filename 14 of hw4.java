package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		
		int n=0;
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		
		while(num>0){
			n++;
			num/=10;
		}
		
		System.out.print(n+"位");
	
	}
		
}
