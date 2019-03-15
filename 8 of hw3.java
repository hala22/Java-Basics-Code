import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int a=num;
		int num1,num2,num3;
		num1=a%10;
		a/=10;
		num2=a%10;
		a/=10;
		num3=a%10;
		int count=num1*num1*num1+num2*num2*num2+num3*num3*num3;
		if(num==count){
			System.out.print(num+"是水仙花数。");
		}else{
			System.out.print(num+"不是水仙花数。");
		}
		
	}
	
	

}
