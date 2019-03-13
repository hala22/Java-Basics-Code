package product;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Test {
	
	public static void read(File file) {
		try {
			FileInputStream fis=new FileInputStream(file);
			BufferedInputStream bis=new BufferedInputStream(fis);
			
			int temp=-1;
			
			while((temp=bis.read())!=-1) {
				System.out.print((char)temp);
			}
			
			fis.close();
			bis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void write(File file) {
		
		try {
			FileOutputStream fos=new FileOutputStream(file);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			for(char c='a';c<='z';c++) {
				bos.write(c);
			}
			
			bos.close();
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
			BufferedReader br=new BufferedReader(fr);
	
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
			fr.close();
			br.close();
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
			BufferedWriter bw=new BufferedWriter(fw);
			
			Scanner input=new Scanner(System.in);
			String str=input.next();
			bw.write(str);
			bw.newLine();
			bw.write(str);
			
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void copyFile(File file,File file1) {
		
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			FileWriter fw=new FileWriter(file1);
			BufferedWriter bw=new BufferedWriter(fw);
	//		PrintWriter pw=new PrintWriter(fw);
			String line=null;
			while((line=br.readLine())!=null) {
				bw.write(line);
				bw.newLine();
//				pw.write(line);
//				pw.println();
			}
			br.close();
			bw.close();
	//		pw.close();
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
		
	//	write(file1);
	//	read(file1);
	//	readFile(file);
	//	writeFile(file1);
		
		copyFile(file,file1);
		
	}

}
