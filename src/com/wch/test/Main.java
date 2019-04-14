package com.wch.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws Throwable {

		String a = "ab";
		String bb = "b";
		String b = "a" + bb;
		System.out.println((a == b)); // result = false

		A a2 = new A();

		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

		System.out.println(systemClassLoader);

		Map<String, String> map = new HashMap<>();

		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		
		Entry<String, String> next = iterator.next();
		
		Object o = new Object();
		
		
		

//		String a = "ab";   
//		final String bb = "b";   
//		String b = "a" + bb;   
//		System.out.println((a == b)); //result = true 
//
//	
//		String a = "ab";   
//		final String bb = getBB();   
//		String b = "a" + bb;   
//		System.out.println((a == b)); //result = false   

	}

}

class A {

	static int width;

	static {

		width = 200;
		System.out.println("A静态代码块,");
	}

	public A() {
		System.out.println("A构造函数");
	}

}

class B extends A {

	String name;

	static int high;

	static {

		high = 200;
		System.out.println("B静态代码块,");
	}

	public B() {

		System.out.println("B构造函数");
	}

	public B(String name) {
		this.name = name;
	}

}
