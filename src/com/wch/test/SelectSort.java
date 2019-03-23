package com.wch.test;


public class SelectSort {

	public static void main(String[] args) {
	
		SelectSort selectSort = new SelectSort();
		int[] array= {2,564,343,34,4,63,34,23,3};
		selectSort.selectsore(array);
		selectSort.showArray(array);
		

	}
	
	public void selectsore(int[] array){
		
		
		for(int i=0;i<array.length;i++) {
			int min = array[i];
			int minIndex = i;
			for(int j=i+1;j<array.length;j++) {
				if(min>array[j]) {
					min = array[j];
					minIndex = j;
				}
			}
			
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
			
		}
	}
	
	
	public void showArray(int[ ] array)
	{
		for (int i : array) {
			System.out.println(i+  "你好 ");
		}
	}

}
