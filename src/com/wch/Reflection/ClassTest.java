package com.wch.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ClassTest {
	
	public static void main(String[] args) throws Exception {
		
		
	
		
		Class<?> clazz = Class.forName("com.wch.Reflection.User");
		
		Field[] fields = clazz.getFields();
		
		User newInstance = (User) clazz.newInstance();
		
		
		System.out.println(newInstance.toString());
		
		
		Constructor constructor = clazz.getConstructor(int.class,int.class,String.class);
		
		User newInstance2 = (User) constructor.newInstance(1,2,"Nihao");
		
		System.out.println(newInstance2.toString());
		
		Method declaredMethod = clazz.getDeclaredMethod("setName", String.class);
		
		
		declaredMethod.invoke(newInstance2, "吴超辉");
		
		System.out.println(newInstance2.toString());
		
				
				
		
		
	
	}

}

