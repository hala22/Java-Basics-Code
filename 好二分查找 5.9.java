package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	
	public static int DICHOTOMY(int[] a,int num){
		int left=0,right=a.length-1;
		int mid,location=-1;
		while(left<=right){
			mid=(left+right)/2;
			if(a[mid]==num){
				location=mid;
				break;
			}else if(a[mid]<num){
				left=mid+1;
			}else{
				right=mid-1;
			}
		}
		return location;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输组数据个数：");
		int n=input.nextInt();
		int[] a=new int[n];
		System.out.println("请输入第一个数组：");
		for(int i=0;i<n;i++){
			a[i]=input.nextInt();
		}
		
		Arrays.sort(a);
		
		System.out.println("请输入要查找的数：");
		int num=input.nextInt();
		int result=DICHOTOMY(a,num);
		
		if(result!=-1){
			System.out.println("找到了，数组下标为："+result);
		}else{
			System.out.println("该数不在这个数组中");
		}
		
		
	}

}
