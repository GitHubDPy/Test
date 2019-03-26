package com.wch.test;

import java.util.Scanner;

public class Main {
	
	//如果一行确定只输入一个字符串，则用scanner.next();
	//如果一行输入包括空格的多个字符串，则用scanner.nextLine();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {

			int data = scanner.nextInt();

			if (data != 0) {
				if (data == 1) {
					System.out.println(0);
				} else {
					int num = 0;
					int enptyNum = data;
					while (enptyNum > 1) {
						num += (enptyNum / 3);

						enptyNum = (enptyNum % 3) + (enptyNum / 3);
						if (enptyNum == 2) {
							num++;
							enptyNum = 1;
						}
					}
					System.out.println(num);
				}
			}

		}

	}

}
