package HomeWork;

public class HomeWork {
	

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;i<=300;i++){
			if(i%4!=0&&i%7!=0){
				sum+=i;
			}
		}
		
		System.out.print(sum);
		
	}	
		
}
