package HomeWork;


public class HomeWork {
	

	public static void main(String[] args) {
		
		float n=100f,s=0,h=0;
		
		for(int i=0;i<5;i++){
			s=s+n+n/2;
			h=n/2;
			n/=2;
		}
		
		System.out.print("共经过路程："+s+" 第5次反弹高度："+h);
	
	}
		
}
