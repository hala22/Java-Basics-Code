package test;

import java.util.Calendar;
import java.util.Scanner;

public class test {
	
	
	public static void LoveCalendar(int year,int month) {
		Calendar calendar=Calendar.getInstance();
		int tYear=calendar.get(Calendar.YEAR);
		int tMonth=calendar.get(Calendar.MONTH)+1;
		int tDay=calendar.get(Calendar.DAY_OF_MONTH);
		long end1=calendar.getTimeInMillis();
		
		calendar.set(2018,8,28);
		int LYear=calendar.get(Calendar.YEAR);
		int LMonth=calendar.get(Calendar.MONTH)+1;
		int LDay=calendar.get(Calendar.DAY_OF_MONTH);
		long start=calendar.getTimeInMillis();
		
		calendar.set(year,month-1,1);
		int days=calendar.getMaximum(Calendar.DAY_OF_MONTH);
		int count=calendar.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int i=0;i<count;i++) {
			System.out.print(" \t");
		}
		
		long LoveDays1=(end1-start)/(1000*3600*24)+1;
		
		for(int i=0;i<days;i++) {
			if(year==tYear&&month==tMonth&&i==(tDay-1))
				System.out.print("*");
			if(year==LYear&&month==LMonth&&i==(LDay-1))
				System.out.print("❤️");
			System.out.print((i+1)+"\t");
			count++;
			if(count==7) {
				System.out.println();
				count=0;
			}
			
		}
		System.out.println();
		System.out.println("今天是和宝贝在一起的第"+LoveDays1+"天，宠她！");
	}

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入年份：");
		int year=input.nextInt();
		System.out.println("请输入月份：");
		int month=input.nextInt();
		
		LoveCalendar(year,month);
		
	}
}
