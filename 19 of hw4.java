package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		
		int cd=1,cm=1;
	
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		int n=input.nextInt();
		
		
		if(m<n){
			int temp;
			temp=m;
			m=n;
			n=temp;
		}
		
		for(int i=n/2;i>=1;i--){
			if(m%i==0&&n%i==0){
				cd=i;
				break;
			}
		}
		
		cm=cd*(m/cd)*(n/cd);
		
		System.out.println("最大公约数："+cd);
		System.out.println("最小公倍数："+cm);
	}
		
}
