package HomeWork;


public class HomeWork {
	

	public static void main(String[] args) {
		
		int temp=1,sum=1;
		
		for(int i=0;i<4;i++){
			sum=(sum*5+1);
			if(sum%4==0){
				sum/=4;
			}else{
				i=-1;
				temp++;
				sum=temp;
			}
		}
		
		sum=(sum*5)+1;
		System.out.print(sum);
		
	}
		
}
