import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		
		if(num1+num2>num3&&num2+num3>num1&&num1+num3>num2){
			System.out.print("可以组成三角形。");
		}else{
			System.out.print("不可以组成三角形。");
		}
		
	}

}