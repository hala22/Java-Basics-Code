package product;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Test {
	
	public static void create(File file) {
		
		File parent=file.getParentFile();
		if(!parent.exists()) {
			parent.mkdirs();
		}
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void copy(File file1,File file2) {
		
		if(file1==null||!file1.exists()) {
			System.out.println("文件不存在");
			return;
		}
		
		if(file2==null||!file2.exists()) {
			create(file2);
		}
		
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
				new File("/Users/air/Documents/aa.mp4");
		File file2=
				new File("/Users/air/Documents/IOTest/bb.mp4");
		
		copy(file1,file2);
		
	}

}
