
import java.util.Scanner;

public class HomeWork{
	private static int thousand=0;
	private static int hundred=0;
	private static int decade=0;
	private static int unit=0;

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("请输入四位整数：");
		int numb=in.nextInt();
		print(numb);
		translate(thousand);
		translate(hundred);
		translate(decade);
		translate(unit);
		swap(thousand,unit);
		swap(hundred,decade);
		System.out.println("密文是："+thousand+hundred+decade+unit);
	}

	public static void print(int num){

		unit=num%10;
		num/=10;
		decade=num%10;
		num/=10;
		hundred=num%10;
		num/=10;
		thousand=num;
	}

	public static void translate(int num){
		num+=5;
		num%=10;
	}

	public static void swap(int num1,int num2){
		int num;
		num=num1;
		num1=num2;
		num2=num;
	}
}