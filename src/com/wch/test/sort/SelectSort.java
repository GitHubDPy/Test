package com.wch.test.sort;

public class SelectSort {

	public static void main(String[] args) {

		int[] arrays = { 9, 2, 6, 23, 15, 8 };

		for (int i : arrays) {

			System.out.print(i + " ");

		}

		System.out.println();
		sort(arrays);

		for (int i : arrays) {

			System.out.print(i + " ");

		}

	}

	public static void sort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			int minDex = i;

			int min = array[i];

			for (int j = i; j < array.length; j++) {

				if (min > array[j]) {

					min = array[j];

					minDex = j;
				}

			}

			int temp = array[i];

			array[i] = array[minDex];

			array[minDex] = temp;

		}
	}
}
