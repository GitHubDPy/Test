package com.wch.test;

import java.util.Arrays;


//
//
//和下面一样的思路，最简洁的代码
//public void quickSort_2(int[] data, int start, int end) {
//    if (data == null || start >= end) return;
//    int i = start, j = end;
//    int pivotKey = data[start];
//    while (i < j) {
//        while (i < j && data[j] >= pivotKey) j--;
//        if (i < j) data[i++] = data[j];
//        while (i < j && data[i] <= pivotKey) i++;
//        if (i < j) data[j--] = data[i];
//    }
//    data[i] = pivotKey;
//    quickSort_2(data, start, i - 1);
//    quickSort_2(data, i + 1, end);
//}




public class QuickSort {

	public static void main(String[] args) {

		int[] arr = { 72, 6, 57, 88, 60, 42, 83, 73, 48, 85 };

		System.out.println(Arrays.toString(arr));

		quickSort(arr);

		System.out.println(Arrays.toString(arr));

	}

	public static void quickSort(int[] arrs) {

		int low = 0;
		int high = arrs.length - 1;
		quickSort(arrs, low, high);

	}

	public static void quickSort(int[] arrs, int low, int high) {

		// 递归的停止条件
		if (low > high) {
			return;
		}
		// 设置左右两个指针
		int i = low;
		int j = high;

		// 设置参考值
		int x = arrs[low];

		while (i < j) {

			// 实现分区
			// 先从右边找比基准值小的数
			while (arrs[j] >= x && j > i) {
				j--;
			}
			
			if (i < j) {	
				// 找到以后把小的数移到左边
				arrs[i] = arrs[j];
				i++;
				
			}
			// 再从左边找到比基准值大的数
			while (arrs[i] <= x && j > i) {
				i++;
			}
			if (i < j) {	
				// 找到以后把大的数移到右边
				arrs[j] = arrs[i];
				j--;
				
			}

		}

		//把基准值填到i=j的坑中，把i=j                  
		arrs[i] = x ;

		// 左边的分区
		quickSort(arrs, low, i - 1);

		// 右边的分区
		quickSort(arrs, j + 1, high);

	}

}













