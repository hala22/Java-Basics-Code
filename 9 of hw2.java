
import java.util.Scanner;
public class HomeWork{
	public static void public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("请输入数字：");
		int a0=in.nextInt();
		int a1,a2,s;
		a1=a0*10+a0;
		a2=a1*10+a0;
		s=a0+a1+a2;
		System.out.println("结果为："+s);
	}
}