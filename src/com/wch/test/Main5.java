package com.wch.test;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {

			String nextLine = scanner.nextLine();

			String reverse = reverse(nextLine);

			System.out.println(reverse);

		}

	}

	public static String reverse(String sentence) {

		String[] strings = sentence.split(" ");

		StringBuffer stringBuffer = new StringBuffer();

		for (int i = strings.length - 1; i >= 0; i--) {
			if (i != 0) {

				stringBuffer.append(strings[i] + " ");

			} else {

				stringBuffer.append(strings[i]);

			}

		}

		return stringBuffer.toString();
	}

}
