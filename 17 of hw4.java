package HomeWork;


public class HomeWork {
	

	public static void main(String[] args) {
		
		int sum=0,temp=1;
		
		for(int i=1;i<=20;i++){
			temp*=i;
			sum+=temp;
			i++;
		}
		
		System.out.print(sum);
	}
		
}
