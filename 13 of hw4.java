package HomeWork;


public class HomeWork {
	

	public static void main(String[] args) {
	
		
		for(int i=2;i<=1000;i++) {
			int flag=i;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) {
					flag-=j;
				}
			}
			
			if(flag==0)
				System.out.println(i);
		}
		
	}
		
}
