package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
	
		int[][] array=new int[3][3];
		int sum=0;
		Scanner input=new Scanner(System.in);
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				array[i][j]=input.nextInt();
			}
		}
		
		for(int i=0;i<array.length;i++){
			
			for(int j=0;j<array[i].length;j++){
				if(i==j){
					sum+=array[i][j];
				}
			}
		}
		
		System.out.println(sum);
	}
	
}
