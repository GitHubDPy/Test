package com.wch.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveList {
	
	public static void main(String[] args) {
		
		ArrayList<String> list =  new ArrayList<String>();
		list.add("f1");
		list.add("f2");
		list.add("f3");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
		{
			String string = iterator.next();
			
			if(string.equals("f3")) {
				iterator.remove();
			}
		}
		
//		for (String string : list) {
//			
//			if(string.equals("f3")) {
//				list.remove(string);
//			}
//			
//		}
		
		for (String string : list) {
			System.out.println(string);
			
		}
		
	} 

}
