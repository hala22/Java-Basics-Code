package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

// 较差的插入排序
	
	public static void insert(int[] num){
		int temp;
		for(int i=1;i<num.length;i++){
			for(int j=0;j<i;j++){
				if(num[i]<num[j]){
					temp=num[i];
					for(int k=i;k>j;k--){
						num[k]=num[k-1];
					}
					num[j]=temp;
				}
			}
		}
		
	}



// 较好的插入排序 升序
// 因为只要是从左到右行进排序，所以其左边的是排好的，这样就只需就近原则比较就可以了
	public static void INSERTION_SORT_MIN(int[] num){

		int key;
		int j;
		for(int i=1;i<num.length;i++){
			key=num[i];
			j=i-1;
			while(j>=0&&num[j]>key){
				num[j+1]=num[j];
				j=j-1;
			}

			num[j+1]=key;
		}
	}

//	插入排序 降序
	public static void INSERTION_SORT_MAX(int[] num){
		int key;
		int j;

		for(int i=1;i<num.length;i++){
			key=num[i];
			j=i-1;

			while(j>=0&&num[j]<key){
				num[j+1]=num[j];
				j=j-1;
			}

			num[j+1]=key;
		}
	}
	
//	选择排序
	
	public static void SELECT_SORT(int[] num){
		int key;
		int location;
		for(int i=0;i<num.length-1;i++){
			key=num[i];
			location=i;
			for(int j=i+1;j<num.length;j++){
				if(num[j]<key){
					key=num[j];
					location=j;
				}
			}
			num[location]=num[i];
			num[i]=key;
		}
	}
	
//	冒泡排序
	public static void BUBBLE_SORT(int[] num){
		for(int i=num.length-1;i>=1;i--){
			for(int j=0;j<i;j++){
				
				if(num[j]>num[j+1]){
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("输入数字个数?");
		int n=in.nextInt();
		int[] num=new int[n];
		System.out.print("请输入数列：");
		
		for(int i=0;i<n;i++){
			num[i]=in.nextInt();
		}
		
		BUBBLE_SORT(num);
		
		for(int j:num){
			System.out.print(j+" ");
		}
		
		   
	}
	
	
}
