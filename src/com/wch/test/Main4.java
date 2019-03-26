package com.wch.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Set<Integer> set = new HashSet<>();

		while (scanner.hasNext()) {

			String string = scanner.nextLine();
			
			StringBuffer stringBuffer = new StringBuffer();

			for (int i = string.length() - 1; i >= 0; i--) {

				stringBuffer.append(String.valueOf(string.charAt(i)));
			}

			string = stringBuffer.toString();
			StringBuffer stringBuffer1 = new StringBuffer();

			for (int i = 0; i < string.length(); i++) {

				if (set.add(Integer.valueOf(string.charAt(i)))) {

					stringBuffer1.append(String.valueOf(string.charAt(i)));

				}
			}

			String out = stringBuffer1.toString();
			System.out.println(out);

		}
	}

}
