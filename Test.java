package HomeWork;

import java.util.Scanner;

public class Test {
	
	//取两个字符串最大的共同子串算法
	public static void getMaxSubString(String string1,String string2){
		
		String max="",min="",result="";
		//result的引入是为了解决有多个最大字符串的问题
		max=(string1.length()>string2.length())?string1:string2;
		min=(max==string1)?string2:string1;
		//从最长的情况开始匹配
		for(int i=0;i<min.length();i++){
			for(int j=0,k=min.length()-i;k<=min.length();j++,k++){
				String flag=min.substring(j,k);
				if(max.contains(flag)&&flag.length()>=result.length()){
					result=flag;
					System.out.println(result);
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method
	
		Scanner input=new Scanner(System.in);
		System.out.println("请输入字符串1：");
		String string1=input.next();
		System.out.println("请输入字符串2：");
		String string2=input.next();
		
		getMaxSubString(string1,string2);
	}

}
