package HomeWork;

public class HomeWork {
	

	public static void main(String[] args) {
		
		
		int hundred=0,decade=0,unit=0,temp=0;
		
		for(int i=100;i<1000;i++ ){
			temp=i;
			hundred=temp%10;
			temp/=10;
			decade=temp%10;
			temp/=10;
			unit=temp;
			
			if(i==hundred*hundred*hundred+decade*decade*decade+unit*unit*unit){
				System.out.print(i+"  ");
			}
			
		
		}
	}	
		
}
