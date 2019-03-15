package HomeWork;

public class HomeWork {
	

	public static void main(String[] args) {
		
		int days=0,sum=0,num=2;
		float money=0;
		float result=0;
		
		while(num<=120){
			days++;
			sum+=num;
			num*=2;
		}
		
		money=sum*2.4f;
		result=money/days;
		
		System.out.print("结果为："+result);
	
	}	
		
}
