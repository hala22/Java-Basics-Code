package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		
		float price1=245.0f,price2=570.0f,price3=545.0f;
		float sum=0f,ssum=0f,lc=0f;
		String Iscontinue="n";
		
		Scanner input=new Scanner(System.in);
		System.out.println("我行我素购物管理系统 > 购物结算");
		System.out.println();
		System.out.println();
		System.out.println("**************************************");
		
		System.out.println("请选择购买商品的编号：");
		System.out.println();
		System.out.println("1.T恤   2.网球鞋   3.网球拍");
		System.out.println("**************************************");
		
		System.out.println();
		System.out.println();
		
		do{
			System.out.println("请输入商品编号：");
			int numb=input.nextInt();
			System.out.println("请输入购买数量：");
			int num=input.nextInt();
			
			
			if(numb==1){
				sum=price1*num;
				ssum+=sum;
				System.out.println("T恤     "+"¥"+price1+"    ¥"+sum);
				System.out.println();
				System.out.println("是否继续（y/n）");
				System.out.println();
				System.out.println();
				Iscontinue=input.next();
			}else if(numb==2){
				sum=price2*num;
				ssum+=sum;
				System.out.println("网球鞋     "+"¥"+price2+"    ¥"+sum);
				System.out.println();
				System.out.println("是否继续（y/n）");
				System.out.println();
				System.out.println();
				Iscontinue=input.next();
			}else if(numb==3){
				sum=price2*num;
				ssum+=sum;
				System.out.println("网球鞋     "+"¥"+price2+"    ¥"+sum);
				System.out.println();
				System.out.println("是否继续（y/n）");
				System.out.println();
				System.out.println();
				Iscontinue=input.next();
			}

//			字符串等于要用equals函数实现
		}while(Iscontinue.equals("y"));
		
		System.out.println("折扣：0.8");
		ssum*=0.8f;
		System.out.println("金额总计  ¥"+ssum);
		System.out.println("实际缴费  ¥");
		float money=input.nextFloat();
		lc=money-ssum;
		System.out.println("找钱     ¥"+lc);
	
		
		
	}
	
		
}
