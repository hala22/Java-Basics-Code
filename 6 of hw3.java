import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int dollar=0;
	
		if(num%7==0){
			dollar=num/7*500;
		}else{
			dollar=(num/7+1)*500;
		}
		
		System.out.print("津贴为："+dollar);
		
	}
	
	

}
