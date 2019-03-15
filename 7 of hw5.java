package HomeWork;

public class HomeWork {
	

	public static void main(String[] args) {
		
		int[] array=new int[20];
		int num=35,i=0;
		
		do{
			array[i]=num%2;
			num/=2;
			i++;
		}while(num!=0);
		
		for(int j=i-1;j>=0;j--){
			System.out.print(array[j]);
		}
		
		
	}
	
}
