package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		
		int c=0,r=0;
		for(int i=1;i<=35;i++){
			if(i*2+(35-i)*4==94){
				c=i;
				r=35-i;
			}
		}
		
		System.out.println("鸡："+c+"只，兔："+r+"只");
	}
	
		
}
