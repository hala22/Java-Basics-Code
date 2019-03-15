package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
	
		int[] array=new int[20];
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输入数数值个数：");
		int n=input.nextInt();
		System.out.println("请输入数组：");
		
		for(int i=0;i<n;i++){
			array[i]=input.nextInt();
		}
		
		System.out.println("请输入m:");
		int m=input.nextInt();
	
		for(int i=n-m-1,j=0;j<m;j++,i--){
			array[i+m]=array[i];
		}
		
		for(int i=0;i<n;i++){
			System.out.print(array[i]+"  ");
		}
		
	}
	
}
