package HomeWork;



public class HomeWork {
	

	public static void main(String[] args) {
		
		int m=0,f=0,c=0;
		
		for(int i=0;i<=100;i++){
			for(int j=0;j<=100-i;j++){
				if((100-i-j)%3==0&&5*i+3*j+(100-i-j)/3==100){
					m=i;
					f=j;
					c=100-i-j;
					System.out.println("有公鸡："+m+"只，母鸡："+f+"只，雏鸡："+c+"只");
				}
			}
		}
	}
	
		
}
