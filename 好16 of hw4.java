package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int i=2;
			
//问题一：什么时候循环停止
//问题二：怎么判断一个数是质数：从2直接往上加，因为首先遇到质因子
//问题三：怎样处理同样质数出现：将小的质因子用完，才用大的质因子
		while(num>1){
	
			if(num%i==0){
				if(num!=i){
					System.out.print(i+"*");
				}else{
					System.out.print(i);
				}
				num/=i;
			}else{
				i++;
			}
		}
		
	
	}
		
}
