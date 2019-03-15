package HomeWork;

package HomeWork;

import java.util.Scanner;

public class HomeWork {
	

	public static void main(String[] args) {
		
		float C=0f,F=0f;
		
		do{
			F=C*9/5.0f+32;
			System.out.println("摄氏度："+C+"   华氏度："+F);
			C+=20;
		}while(C<=250);
		
	}
		
}
