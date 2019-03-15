import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		
		if(num1%2==0){
			System.out.println("num1是偶数。");
		}else{
			System.out.println("num1是奇数。");
		}
		
	}

}