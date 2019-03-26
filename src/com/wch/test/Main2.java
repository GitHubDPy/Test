package com.wch.test;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			
			//代码一定要放在while里面
			
			String string = scanner.nextLine();
			
			String[] strings = string.split("x");
			
			String xString  = strings[1];
			int count = 0;
			for(int i =0;i<xString.length();i++) {
				if(xString.charAt(i)>='A'&&xString.charAt(i)<='F') {
					
					count += (xString.charAt(i)-55)*Math.pow(16.0, xString.length()-1-i);
				}
				else {
					count += (xString.charAt(i)-48)*Math.pow(16.0, xString.length()-1-i);
				}
				
				
			}
			System.out.println(count);
		}
		

		
		
	}
}

