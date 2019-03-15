package HomeWork;

public class HomeWork {
	

	public static void main(String[] args) {
	
		int[][] array=new int[9][9];
		
		for(int i=0;i<9;i++){
			for(int j=0;j<=i;j++){
				array[i][j]=(i+1)*(j+1);
			}
		}
		
		for(int i=0;i<9;i++){
			for(int j=0;j<=i;j++){
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
}
