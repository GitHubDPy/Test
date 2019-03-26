package com.wch.test;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {

			String string1 = scanner.nextLine();
			
			String string2 = scanner.nextLine();
			
			String[] strings1 = handleString(string1);
			String[] strings2 = handleString(string2);
			for (String string : strings1) {
				System.out.println(string);
			}

			
		}
	}
	
	public static String[] handleString(String string) {
		
		if(string.length()% 8 !=0) {
			
			int n = string.length() / 8;
			String[] strings = new String[n+1];
			
			for(int i = 0;i<n;i++) {
				strings[i] = string.substring(i*8, 8*i+8);
			}
			
			String laString = string.substring(n*8, string.length());
			
			StringBuffer stringBuffer = new StringBuffer(laString);
			
			for(int i = 0 ;i<8-laString.length();i++) {
				stringBuffer.append("0");
			}
			
			strings[n] = stringBuffer.toString();
			return strings;
		}else {
			int n = string.length() / 8;
			String[] strings = new String[n];
			
			for(int i = 0;i<n;i++) {
				strings[i] = string.substring(i*8, 8*i+8);
			}
			
			
			return strings;
		}
		
	}
	
	
}
