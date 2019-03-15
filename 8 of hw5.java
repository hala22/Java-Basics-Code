package HomeWork;

public class HomeWork {
	

	public static void main(String[] args) {
		
		int[] array={1,2,3,1,0};
		boolean flag=false;
		
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]==array[j]){
					flag=true;
					break;
				}
			}
			
			if(flag==true){
				break;
			}
		}
		
		System.out.println("重复");
		
	}
	
}
