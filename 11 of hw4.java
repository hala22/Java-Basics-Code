package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
	
		int sum=0,temp=0;
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int n=input.nextInt();
		
		sum=num;
		temp=num;
		
		for(int i=0;i<n-1;i++){
			temp*=10;
			temp+=num;
			sum+=temp;
		}
		
		System.out.print(sum);
		
		
	}
		
}
