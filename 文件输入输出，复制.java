package product;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
	
	public static void read(File file) {
		
		try {
			FileInputStream fis=new FileInputStream(file);
			
			int temp=-1;
			while((temp=fis.read())!=-1) {
				System.out.print((char)temp);
			}
			
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			e.getSuppressed();
		}
	}
	
	public static void write(File file) {
		
		try {
			FileOutputStream fos=new FileOutputStream(file);
			
			for(char c='a';c<='z';c++) {
				fos.write(c);
			}
			
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void readFile(File file) {
		
		try {
			FileReader fr=new FileReader(file);
	
			int temp=-1;
			while((temp=fr.read())!=-1) {
				System.out.println((char)temp);
			}
			
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writeFile(File file) {
		
		try {
			FileWriter fw=new FileWriter(file);
			
			Scanner input=new Scanner(System.in);
			String str=input.next();
			fw.write(str);
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void copyFile(File file,File file1) {
		
		try {
			FileInputStream fis=new FileInputStream(file);
			FileOutputStream fos=new FileOutputStream(file1);
			
			byte[] b=new byte[8*1024];
			int length=-1;
			while((length=fis.read(b))!=-1) {
				fos.write(b,0,length);
			}
			
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	public static void main(String[] args) {
		
		File file=new File("/Users/air/eclipse-workspace/single/src/product/Test.java");
		File file1=new File("/Users/air/Documents/IOTest/aa.txt");
		
	//	write(file);
	//	read(file);
	//	readFile(file);
	//	writeFile(file);
		
		copyFile(file,file1);
		
	}

}
