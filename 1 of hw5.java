package HomeWork;



public class HomeWork {
	

	public static void main(String[] args) {
		
		int[] array={7,3,4,9,3,2,6,10,16,12,4};
		int max=0,min=99999;
		for(int i=0;i<array.length;i++){
			if(array[i]>max){
				max=array[i];
			}
			
			if(array[i]<min){
				min=array[i];
			}
		}
		
		System.out.println("max:"+max+"  min:"+min);
	
	}
	
}
