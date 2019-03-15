package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
	
		int[] array=new int[20];
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输入数数值个数：");
		int n=input.nextInt();
		System.out.println("请输入数组：");
		for(int i=0;i<array.length;i++){
			array[i]=9999;
		}
		
		for(int i=0;i<n;i++){
			array[i]=input.nextInt();
		}
		
		Arrays.sort(array);
		
		System.out.println("请输入插入数据：");
		int num=input.nextInt();
		for(int i=0;i<n;i++){
			if(num<=array[i]){
				for(int j=n-1;j>=i;j--){
					array[j+1]=array[j];
				}
				array[i]=num;
				break;
			}
		}
		
		for(int i=0;i<n+1;i++){
			System.out.print(array[i]+"  ");
		}
	}
	
}
