package com.wch.test;

public class BinaryFind {

	public static void main(String[] args) {

		int []array  = {0,2,4,5,6,8,31,35,546};
		
		BinaryFind binaryFind  = new BinaryFind();
		int find = binaryFind.find(3, array);
		System.out.println(find);
		
		
	}

	public int find(int des, int[] array) {
		int mindex = 0;
		int maxdex = array.length - 1;
		int midDex = 0;
		while (mindex <= maxdex) {
			midDex = (maxdex - mindex) / 2 + mindex; // 防止溢出
			if (des < array[midDex]) {
				
				maxdex = midDex - 1;
			}
			if (des > array[midDex]) {
				
				mindex = midDex + 1;
			}
			if(des == array[midDex]) {
				return midDex;
			}

		}

		return -1;
	}
}
