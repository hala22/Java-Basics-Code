package product;

import java.io.File;
import java.io.IOException;

public class Test {
	
	public static boolean creatFile(String path) {
		
		File file=new File(path);
		
		if(file.exists()) {
			System.out.println("文件已经存在");
			return false;
		}
		
		File parent=file.getParentFile();
		
		if(!parent.exists()) {
			parent.mkdirs();
		}
		
		boolean result=false;
		
		try {
			result=file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static void deleteFile(File file) {
		
		if(file==null||!file.exists()) {
			System.out.println("文件不存在");
			return;
		}
		
		if(file.isDirectory()) {
			deleteDir(file);
		}else {
			System.out.println("删除文件"+file.getName());
			file.delete();
		}
	}
	
	private static void deleteDir(File file) {
		// TODO Auto-generated method stub
		File[] subFiles=file.listFiles();
		
		for (File subFile : subFiles) {
			if(subFile.isDirectory()) {
				deleteDir(subFile);
			}else {
				System.out.println("删除文件"+subFile.getName());
				subFile.delete();
			}
		}
		
		System.out.println("删除文件夹"+file.getName());
		file.delete();
	}

	public static void main(String[] args) {
	
		System.out.println(File.separator);
		boolean flag=creatFile("/Users/air/Documents/未命名文件夹/aa.txt");
		System.out.println(flag);
		
		File file=new File("/Users/air/Documents/未命名文件夹/aa.txt");
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		File parentFile=file.getParentFile();
		System.out.println(parentFile.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.length());
		//创建时传的是否是绝对路径
		System.out.println(file.isAbsolute());
		File file1=new File("aa.txt");
		System.out.println(file1.exists());
		//显示绝对路径
		System.out.println(file1.getAbsolutePath());
		//创建时传的啥就显示啥
		System.out.println(file1.getPath());
		
		
		deleteFile(file1);
	//deleteFile(parentFile);
	}

}
