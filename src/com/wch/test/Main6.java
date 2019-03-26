package com.wch.test;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {

			String string = scanner.nextLine();

			String[] strings = string.split(";");

			int x = 0;

			int y = 0;

			for (int i = 0; i < strings.length; i++) {	
				
				if(strings[i].length()>1) {
					if (strings[i].charAt(0) == 'A') {

						String substring = strings[i].substring(1);

						boolean isNum = isNum(substring);

						if (isNum) {
							x -= Integer.parseInt(substring);
						}
					}
					
					if (strings[i].charAt(0) == 'D') {

						String substring = strings[i].substring(1);

						boolean isNum = isNum(substring);

						if (isNum) {
							x += Integer.parseInt(substring);
						}
					}
					
					if (strings[i].charAt(0) == 'S') {

						String substring = strings[i].substring(1);

						boolean isNum = isNum(substring);

						if (isNum) {
							y -= Integer.parseInt(substring);
						}
					}
					
					if (strings[i].charAt(0) == 'W') {

						String substring = strings[i].substring(1);

						boolean isNum = isNum(substring);

						if (isNum) {
							y += Integer.parseInt(substring);
						}
					}
				}

			
			}
			
			System.out.println(x+","+y);
		}

	}

	public static boolean isNum(String subString) {
		boolean isNum = true;

		for (int i = 0; i < subString.length(); i++) {

			if (!(subString.charAt(i) >= '0' && subString.charAt(i) <= '9')) {
				isNum = false;
				break;
			}
		}

		return isNum;
	}

}
