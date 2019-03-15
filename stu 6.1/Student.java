package com.hala.stu;

public class Student {
	String name;
	int classNo;
	int num;
	int age;
	
	
	
	public Student(String name, int classNo, int num, int age) {
		super();
		this.name = name;
		this.classNo = classNo;
		this.num = num;
		this.age = age;
	}



	public String toString(){
		return "name:"+name+
				"、classNo:"+classNo+
				"、num: "+num+
				"、age:"+age;
	}

}
