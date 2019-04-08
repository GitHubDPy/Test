package com.wch.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。
 * 输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。 
 * @author 吴超辉
 *
 */
public class Main10 {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			
			String string = scanner.nextLine();
			
			Map<Character, Integer> map = new HashMap<>();
			
			
			for(int i = 0; i < string.length();i++) {
				
				if(null==map.get(string.charAt(i))) {
					
					map.put(string.charAt(i), 1);
				}
				else {
					map.put(string.charAt(i), map.get(string.charAt(i))+1);
				}	
			}
			
			
			Collection<Integer> allvalues = map.values();
			
			Integer min = Collections.min(allvalues);
			
			
			List<Integer> values = new ArrayList<>();
			
			for (Integer integer : allvalues) {
				
				values.add(integer);
			}
			
			
			Collections.sort(values);
			
			List<Character> deleteChar = new ArrayList<>();
			
			int value = values.get(0);
			
			Set<Character> keySet = map.keySet();
			
			for (Character character : keySet) {
				
				if(map.get(character)==value) {
					
					deleteChar.add(character);
				}
			}
			
			StringBuffer stringBuffer = new StringBuffer();
			
			for(int i = 0; i < string.length();i++) {
				
				boolean isdelete = false;
				
				for(int  j = 0 ;j<deleteChar.size();j++) {
					
					if(string.charAt(i)==deleteChar.get(j)) {
						
						isdelete = true;
						break;
					}
				}
				
				if(!isdelete) {
					stringBuffer.append(String.valueOf(string.charAt(i)));
				}
			}
			
			
			System.out.println(stringBuffer.toString());
			
			
			
		}
	}
}











