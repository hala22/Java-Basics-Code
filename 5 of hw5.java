package HomeWork;


public class HomeWork {
	

	public static void main(String[] args) {
		
		int[] array=new int[50];
		int num=0;
	
//？怎样弄出50？
		for(int i=0;i<50;i++){
			num=(int)(Math.random()*40+10);
			array[num]++;
		}
		
		for(int i=0;i<array.length;i++){
			if(array[i]!=0){
				System.out.println(i+"出现了"+array[i]+"次");
			}
		}
	}
	
}
