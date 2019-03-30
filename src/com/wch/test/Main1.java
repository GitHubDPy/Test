package com.wch.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {

			int num = Integer.parseInt(scanner.nextLine());
			
			String[] strings = new String[num];

			String nextLine = scanner.nextLine();
			

			for(int i = 0 ; i<strings.length;i++) {
				strings[i] = nextLine.substring(i*9, 9*i+9);
			}
			
			
			for (int i = 0; i < strings.length; i++) {
				if (i != strings.length - 1) {

					if (strings[i].charAt(0) == '0') {

						StringBuffer stringBuffer = new StringBuffer();

						for (int j = 8; j > 0; j--) {

							stringBuffer.append(String.valueOf(strings[i].charAt(j)));

						}
						System.out.print(stringBuffer.toString() + " ");

					}

					if (strings[i].charAt(0) == '1') {

						StringBuffer stringBuffer = new StringBuffer();

						for (int j = 1; j < 9; j++) {

							stringBuffer.append(String.valueOf(strings[i].charAt(j)));

						}
						System.out.print(stringBuffer.toString() + " ");
					}

				} else {

					if (strings[i].charAt(0) == '0') {

						StringBuffer stringBuffer = new StringBuffer();

						for (int j = 8; j > 0; j--) {

							stringBuffer.append(String.valueOf(strings[i].charAt(j)));

						}
						System.out.print(stringBuffer.toString());

					}

					if (strings[i].charAt(0) == '1') {

						StringBuffer stringBuffer = new StringBuffer();

						for (int j = 1; j < 9; j++) {

							stringBuffer.append(String.valueOf(strings[i].charAt(j)));

						}
						System.out.print(stringBuffer.toString());
					}

				}

			}

		}

	}
}
