package HomeWork;

public class HomeWork {
	

	public static void main(String[] args) {
	
		int[][] array={{1,2,4,6},{6,7,12,6,7},{3,4,5}};
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				if(j!=array[i].length-1){
					System.out.print(array[i][j]+",");
				}else{
					System.out.print(array[i][j]);
				}
			}
			
			System.out.println();
		}
		
	}
	
}
