package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class test implements Comparator<Student>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu1=new Student(1,"张三",20);
		Student stu2=new Student(2,"李四",21);
		Student stu3=new Student(3,"王五",21);
		Student stu4=new Student(4,"赵六",22);
		
		ArrayList<Student> list=new ArrayList<>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		
		Collections.sort(list,new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getAge()==o2.getAge()) {
					return o1.getId()-o2.getId();
				}else if(o1.getAge()>o2.getAge()) {
					return -1;
				}else {
					return 1;
				}
			}
			
		});
		
//		for(Student stu:list) {	
//			System.out.println(stu);
//		}
		
		Iterator<Student> it=list.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println(s);
		}
		
		
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
