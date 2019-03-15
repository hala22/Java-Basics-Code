package HomeWork;


public class HomeWork {
	

	public static void main(String[] args) {
		
		int[] array=new int[25];
		array[0]=1;
		array[1]=1;
		
		for(int i=2;i<array.length;i++){
			array[i]=array[i-1]+array[i-2];
		}
		
		for(int i=0;i<20;i++){
			System.out.print(array[i]+"  ");
		}
		
	}
	
}
