import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int a=num;
		int num1=0,num2=0,num3=0,num4=0,num5=0;
		num1=a%10;
		a/=10;
		num2=a%10;
		a/=10;
		num3=a%10;
		a/=10;
		num4=a%10;
		a/=10;
		num5=a%10;
		a/=10;
		
		if(num1==num5&&num2==num4){
			System.out.println(num1+""+num2+num3+num4);
			System.out.print(num+"是回文数。");
		}else{
			System.out.print(num+"不是回文数。");
		}
		
	}
	
	

}
