package product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test {

	public static HashMap<Integer,Student> readToStudent(File file) {
		if(file==null||!file.exists()) {
			System.out.println("文件为空");
			return null;
		}
		
		HashMap<Integer,Student> map=new HashMap<>();
		
		try {
			BufferedReader br=
					new BufferedReader(new FileReader(file));
			String line=null;
			while((line=br.readLine())!=null) {
				String[] strs=line.split(" ");
				Student stu=
						new Student(Integer.parseInt(strs[1]),
								strs[0],Integer.parseInt(strs[2]),
								strs[3]);
				map.put(stu.getId(), stu);
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return map;
		
	}

	public static void main(String[] args) {
		
		HashMap<Integer,Student> map=new HashMap<>();
		File file=
				new File("/Users/air/Documents/IOTest/aa.txt");	
		
		map=readToStudent(file);
		
		Collection<Student> list= map.values();
	
		
		Iterator<Student> it=list.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println(s);
		}
		
	}

}
