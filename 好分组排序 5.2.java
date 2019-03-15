package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输入第一个数组数据个数：");
		int n=input.nextInt();
		int[] a=new int[n];
		System.out.println("请输入第一个数组：");
		for(int i=0;i<n;i++){
			a[i]=input.nextInt();
		}
		
		System.out.println("请输入第二个数组数据个数：");
		int m=input.nextInt();
		int[] b=new int[m];
		System.out.println("请输入第二个数组：");
		for(int i=0;i<m;i++){
			b[i]=input.nextInt();
		}
		
		
		int length=a.length+b.length;
		int[] c=new int[length];

		Arrays.sort(a);
		Arrays.sort(b);

		int num=0;//为c计数
		int i=0,j=0;//为a,b数组计数
		boolean flag=false;//记录最后哪个数组剩下了 为真-b数组
		for(;j<b.length&&i<a.length;){
			if(a[i]<b[j]){
				c[num]=a[i];
				i++;
				num++;
			}else{
				c[num]=b[j];
				j++;
				num++;
			}
			
			if(i==a.length){
				flag=true;
			}
			
		}
		
		if(flag){
			for(;j<b.length;j++){
				c[num]=b[j];
				num++;
			}
		}else{
			for(;i<a.length;i++){
				c[num]=a[i];
				num++;
			}
		}
		
		for(int k:c){
			System.out.print(k+"  ");
		}
		System.out.println();

	}

}
