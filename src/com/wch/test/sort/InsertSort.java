package com.wch.test.sort;

public class InsertSort {

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

		for (int i = 1; i < array.length; i++) {

			int insertValue = array[i];

			int insertIndex = i - 1;

			while (insertIndex >= 0 && insertValue < array[insertIndex]) {

				array[insertIndex + 1] = array[insertIndex];

				insertIndex--;
			}

			array[insertIndex + 1] = insertValue;

		}
	}
}
