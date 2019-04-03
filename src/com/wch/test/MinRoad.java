package com.wch.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class MinRoad {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			
			String nextLine = scanner.nextLine();
			
			String[] strings = nextLine.split(" ");
			
			List<String[]> list = new ArrayList<>();
			
			
			
			for(int i = 0 ;i < strings.length;i+=2) {
				
				String[] string = new String[2];
				
				string[0] = strings[i];
				 
				string[1] = strings[i+1];
				
				list.add(string);
			}
			
			System.out.println();
			
			Set<String> road = new HashSet<>();
			
			for(int j = 0;j<100000;j++) {

				StringBuffer stringBuffer = new StringBuffer();
				
				for(int i = 0;i<5;i++) {
					Random random = new Random();
					
					stringBuffer.append(String.valueOf((random.nextInt(5))));
					
				}
				if(isContain(stringBuffer.toString())) {
					road.add(stringBuffer.toString());
				}
				
			}
	
			
			
			
			
			List<Integer> counts = new ArrayList<>();
			
			
			for (String string : road) {
				
				counts.add(minRoad(list,string));
				
			}
			
			Collections.sort(counts);
			
			System.out.println(counts.get(0));
					
			
		}
		
		
	}

	public static int minRoad(List<String[]> list, String string) {

		Integer[] road = new Integer[5];
		
		for(int i = 0 ;i<string.length();i++) {
			
			road[i] = Integer.parseInt(String.valueOf((string.charAt(i))));
			
			
		}
		
		
		
		
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			double dis = 0;

			if (i == 0) {
				String[] strings1 = { "0", "0" };
				int x = Integer.parseInt(strings1[0]);
				int y = Integer.parseInt(strings1[1]);

				int x1 = Integer.parseInt(list.get(road[i])[0]);
				int y1 = Integer.parseInt(list.get(road[i])[1]);

				dis = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
				
			} else {
				
				String[] strings1 = list.get(road[i - 1]);
				int x = Integer.parseInt(strings1[0]);
				int y = Integer.parseInt(strings1[1]);

				int x1 = Integer.parseInt(list.get(road[i])[0]);
				int y1 = Integer.parseInt(list.get(road[i])[1]);

				dis = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
				if(i==list.size()-1) {
					dis += Math.sqrt(Math.pow(0 - x1, 2) + Math.pow(0 - y1, 2));
				}
			}

			count += dis;
		}
		
		return count;
	}
	
	public static boolean isContain(String string) {
		
		boolean isContain = true;
		
		int[] chars = new int[128];
		
		for(int i = 0;i < string.length();i++) {
			chars[string.charAt(i)]++;
		}
		for (int i : chars) {
			if(i>=2) {
				isContain = false;
				break;
			}
		}
		
		return isContain;
	}
	
}