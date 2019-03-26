package com.wch.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			Set<Integer> set = new HashSet<>();
			
			int nextInt = scanner.nextInt();

			for (int i = 0; i < nextInt; i++) {
				set.add(scanner.nextInt());
			}
			
			int []array = new int[set.size()];
			int i = 0;
			for (Integer integer : set) {
				array[i] = integer;
				i++;
			}
					
			Arrays.sort(array);
			
			for (int m : array) {
				System.out.println(m);
			}

		}
	}
}