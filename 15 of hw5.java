package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		System.out.println("请输入行数：");
		int n=input.nextInt();
		int[][] array=new int[n][n];
		
		
		for(int i=0;i<n;i++){
			array[i][0]=array[i][i]=1;
		}
		
		for(int i=2;i<n;i++){
			for(int j=1;j<i;j++){
				array[i][j]=array[i-1][j]+array[i-1][j-1];
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(array[i][j]==0){
					System.out.print(" ");
				}else{
					System.out.print(array[i][j]);
				}
			}
			System.out.println();
		}
		
		
	}
	
}
