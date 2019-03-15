package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		
		float[] array=new float[10];
		float score,max=0,min=9999,sum=0,average=0;
		int num=0;
		Scanner input=new Scanner(System.in);
		
		for(int i=0;i<10;i++){
			System.out.println("请输入第"+(i+1)+"位评委的分数：");
			score=input.nextFloat();
			array[i]=score;
			if(score>max){
				max=score;
			}else if(score<min){
				min=score;
			}
			
		}
		
		for(int i=0;i<array.length;i++){
			if(array[i]==max&&num<=2){
				num++;
				continue;
			}else if(array[i]==min&&num<=2){
				num++;
				continue;
			}else{
				sum+=array[i];
			}
		}
		
		average=sum/(array.length-2);
		
		System.out.println("average:"+average);
		
	}
	
}
