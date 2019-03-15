package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输人数：");
		int n=input.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=i+1;
		}
		
		int flag=n,i=0,num=0;
		while(flag>1){
			if(a[i]!=0){
				num++;
				num%=3;
				if(num==0){
					a[i]=0;
					flag--;
				}
			}
			
			i++;
			if(i>=a.length){
				i%=a.length;
			}
		}
		
		for(int m:a){
			if(m!=0){
				System.out.println("剩下的号码是："+m);
			}
		}
		
	}

}
