package com.wch.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CompareTest {

	public static void main(String[] args) {
		Student s1 = new Student(19, 6);
		Student s2 = new Student(19, 4);
		Student s3 = new Student(19, 5);
		
		List<Student> list = new ArrayList<>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Collections.sort(list);	
		
		for (Student student : list) {
			System.out.println(student);
		}
	}
	
	

}


class Student implements Comparable<Student>{
	private int age;
	private int grade;
		
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Student(int age, int grade) {
		super();
		this.age = age;
		this.grade = grade;
	}

	@Override
	public int compareTo(Student o) {
		
		int compare = this.age+this.grade - o.getAge()-o.getGrade();
		
		return compare;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", grade=" + grade + "]";
	}
	
	
	
	
	
	
}
