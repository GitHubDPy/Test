package com.wch.classLoder;

import org.apache.catalina.core.ApplicationContext;

public class TestClassLoder {

	public static void main(String[] args) {

		System.out.println(ClassLoader.getSystemClassLoader());
		
		System.out.println(System.getProperty("java.class.path"));
		
		String aString = "s";
		
		
		
	}

}
