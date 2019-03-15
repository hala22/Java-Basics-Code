package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		String useName,password,Rpass="123456",Rname="hala22";
		boolean Isright=false;
		int n=3;
		
		Scanner input=new Scanner(System.in);
		
		do{
			System.out.println("请输入用户名：");
			useName=input.next();
			System.out.println("请输入密码：");
			password=input.next();
			
			if(useName.equals(Rname)&&password.equals(Rpass)){
				Isright=true;
			}else{
				n--;
				System.out.println("输入错误！您还有"+n+"次机会！");
			}
			
			System.out.println();
			System.out.println();
			
		}while(Isright==false&&n>0);
		
		if(Isright==true){
			System.out.println("欢迎登陆Myshopping系统！");
		}else{
			System.out.println("对不起，您3次均输入错误！");
		}
		
		
	}
	
		
}
