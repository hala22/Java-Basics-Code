package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int line=input.nextInt();
		
		for(int i=1;i<=line/2+1;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=line/2+2;i<=line;i++){
			for(int j=1;j<=1+line-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
}
