package com.wch.Reflection;

public class User{

	private int age;
	
	private int id;
	
	public String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public User(int age, int id, String name) {
		super();
		this.age = age;
		this.id = id;
		this.name = name;
	}

	public User() {
		
		this.name = "吴";
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
