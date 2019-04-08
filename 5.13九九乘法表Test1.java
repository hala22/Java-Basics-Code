package test;

import java.util.Scanner;

public class Test1 {
	
	public static void print() {
		int[][] num=new int[9][];
		
		for(int i=0;i<9;i++) {
			num[i]=new int[i+1];
			for(int j=0;j<=i;j++) {
				num[i][j]=(i+1)*(j+1);
			}
		}
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(num[i][j]+"\t");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
	}


}
