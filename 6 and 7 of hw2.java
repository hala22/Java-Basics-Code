
import java.util.Scanner;

public class HomeWork{
	private static int hundred=0;
	private static int decade=0;
	private static int unit=0;

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("请输入三位整数：");
		int numb=in.nextInt();
		print(numb);
		System.out.println("百位数是："+hundred);
		System.out.println("十位数是："+decade);
		System.out.println("个位数是："+unit);
		System.out.println("逆序输出是："+unit+decade+hundred);
	}

	public static void print(int num){
		unit=num%10;
		num/=10;
		decade=num%10;
		num/=10;
		hundred=num;
	}
}