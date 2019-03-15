package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		
		int[] array={8,4,2,1,23,344,12};
		int temp=0,sum=0;
		boolean flag=false;
		
		Scanner input=new Scanner(System.in);
		
		for(int i=array.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(array[j]>array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		for(int i:array){
			sum+=i;
			System.out.print(i+"  ");
		}
		
		System.out.println();
		System.out.println("sum:"+sum);
		
		int in=input.nextInt();
		
		for(int i=0;i<array.length;){
			if(array[i]==in){
				flag=true;
				System.out.println(in+"在数列中第"+(i+1)+"位");
			}
			i++;
			if(i==array.length&&flag==false){
				System.out.println(in+"不在数列中");
			}
		}
		
	}
	
}
