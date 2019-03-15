import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double num=input.nextInt();
		double profit;
		if(num<=100000){
			profit=num*0.1;
		}else if(num>100000&&num<=200000){
			profit=10000+(num-100000)*0.075;
		}else if(num>200000&&num<=400000){
			profit=10000+7500+(num-200000)*0.05;
		}else if(num>400000&&num<=600000){
			profit=10000+7500+10000+(num-400000)*0.03;
		}else if(num>600000&&num<=1000000){
			profit=10000+7500+10000+6000+(num-600000)*0.015;
		}else{
			profit=10000+7500+10000+6000+(num-600000)*0.01;
		}
		
		System.out.print("profit:"+profit);
		
	}
	
	

}
