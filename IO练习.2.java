package product;

import java.io.File;

public class Test {
	
	
	public static void printFile(File file) {
		
		if(file==null||!file.exists()) {
			System.out.println("文件不存在");
			return;
		}
		
		if(file.isDirectory()) {
			printDir(file);
		}else {
			if(file.getName().contains(".java")) {
				System.out.println(file.getAbsolutePath());
			}else {
				System.out.println("不是java文件");
			}
		}
	}

	private static void printDir(File file) {
		// TODO Auto-generated method stub
		File[] subFiles=file.listFiles();
		
		for (File subFile : subFiles) {
			if(subFile.isDirectory()) {
				printDir(subFile);
			}else {
				if(subFile.getName().contains(".java")) {
					System.out.println(subFile.getAbsolutePath());
				}
			}
		}
		
		if(file.getName().contains(".java")) {
			System.out.println(file.getAbsolutePath());
		}
		
	}

	public static void main(String[] args) {
		
		File file=new File("/Users/air/Documents/eclipse-workspace/single/src");
		
		
		printFile(file);
	}

}
