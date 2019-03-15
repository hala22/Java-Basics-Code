package HomeWork;


public class HomeWork {
	

	public static void main(String[] args) {
	
		
		
		for(int i=1;i<=1000;i++){
			int temp=0;
			// 这里只需要检验到i的一半就够了，提高效率
			for(int j=1;j<i/2;j++){
				if(i%j==0){
					temp+=j;
				}
			}
			
			if(temp==i){
			System.out.print(i+"  ");
			}
		}
		
	}
		
}
