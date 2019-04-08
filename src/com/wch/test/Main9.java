package com.wch.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Main9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Map map = new HashMap<String,Integer>();
		
		map.put("abc", 2);
		map.put("def", 3);
		map.put("ghi", 4);
		map.put("jkl", 5);
		map.put("mno", 6);
		map.put("pqrs", 7);
		map.put("tuv", 8);
		map.put("wxyz", 9);
	
		while(scanner.hasNext()) {
			
			String nextLine = scanner.nextLine();
			
			StringBuffer stringBuffer = new StringBuffer();
			
			for(int i = 0 ; i < nextLine.length();i++) {
				
				if(nextLine.charAt(i)>='A'&& nextLine.charAt(i)<='Y') {
					
					
					
					stringBuffer.append(Character.toChars(String.valueOf(nextLine.charAt(i)).toLowerCase().charAt(0)+1));
		
				}
				if(nextLine.charAt(i)=='Z') {
					
					stringBuffer.append('a');
				}
				if(nextLine.charAt(i)>='0'&& nextLine.charAt(i)<='9') {
					
					stringBuffer.append(String.valueOf(nextLine.charAt(i)));
				}
				if(nextLine.charAt(i)>='a'&& nextLine.charAt(i)<='z') {
					
					Set<String> keySet = map.keySet();
					
					for (String string : keySet) {
						if(string.contains(String.valueOf(nextLine.charAt(i)))) {
							
							stringBuffer.append(map.get(string));
						}	
							
					}
					
				}
									
			}
			
			System.out.println(stringBuffer.toString());
		}
		
	}

}
