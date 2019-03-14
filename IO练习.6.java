package product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	


	public static void main(String[] args) {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		String line=null;
		
		try {
			line=br.readLine();
			while(line!=null&&!line.equals("exit")) {

				System.out.println(line);
				line=br.readLine();
			}
			
			isr.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
		
	}

}
