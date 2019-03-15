import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
	
		if(num%400==0||num%4==0&&num%100!=0){
			System.out.print(num+"是闰年。");
		}else{
			System.out.print(num+"不是闰年。");
		}
		
	}
	
	

}
