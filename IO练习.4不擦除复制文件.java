package product;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	
	public static void copy(File file1,File file2) {
		
		try {
			BufferedInputStream bis=
					new BufferedInputStream(new FileInputStream(file1));
			BufferedOutputStream bos=
					new BufferedOutputStream(new FileOutputStream(file2,true));
			
			int temp=-1;
			
			while((temp=bis.read())!=-1) {
				bos.write((char)temp);
			}
			
			bis.close();
			bos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


	public static void main(String[] args) {
		File file1=
				new File("/Users/air/eclipse-workspace/single/src/product/Test.java");
		File file2=
				new File("/Users/air/Documents/IOTest/aa.txt");
		
		copy(file1,file2);
		
	}

}
