package com.wch.test;

import java.util.Scanner;

public class SystemIn {

	public static void main(String[] args) {

		//输入一组数据
		Scanner scanner = new Scanner(System.in);
		
		
		Integer line = Integer.valueOf(scanner.nextLine());
		
		
		//输入多组数据
		while(scanner.hasNextLine()) {
			
			String string = scanner.nextLine();
			
			System.out.println(string);
		}
		
		
		
	}

}
