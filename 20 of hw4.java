package HomeWork;


public class HomeWork {
	

	public static void main(String[] args) {
		
		for(int i=101;i<=200;i++){
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					break;
				}else if(j==i/2){
					System.out.print(i+"  ");
					break;
				}
			}
		}
	}
		
}
