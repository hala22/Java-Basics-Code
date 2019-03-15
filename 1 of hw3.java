import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		if(num1>num2){
			int num;
			num=num1;
			num1=num2;
			num2=num;
		}
		
		System.out.println("num1:"+num1+",num2:"+num2);
	}

}