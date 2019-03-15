package HomeWork;


public class HomeWork {
	

	public static void main(String[] args) {
	
		
		float a=1f,b=2f,t=0f;
		float sum=0f,temp=0f;
		
		sum=1.0f/2;
		
		for(int i=0;i<19;i++){
			
			t=a+b;
			a=b;
			b=t;
			temp=a/b*1.0f;
			sum+=temp;
		}
		
		System.out.print(sum);
		
		
	}
		
}
