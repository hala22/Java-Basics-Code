package HomeWork;

public class HomeWork {
	

	public static void main(String[] args) {
		
		int f=0,m=0,c=0;
		for(int i=0;i<=30;i++){
			for(int j=0;j<=30-i;j++){
				if(3*i+2*j+(30-i-j)==50){
					m=i;
					f=j;
					c=30-i-j;
					System.out.println("男人："+m+"人，女人："+f+"人，小孩："+c+"人");
				}
			}
		}
	}
	
		
}
