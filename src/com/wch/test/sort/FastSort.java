package com.wch.test.sort;

public class FastSort {

	
	public static void main(String[] args) {
		

		int[] arrays = {9,2,6,23,15,8};
		
		for (int i : arrays) {
			
			System.out.print(i+" ");
							
		}
		
		System.out.println();
		sort(arrays);
		
		for (int i : arrays) {
			
			System.out.print(i+" ");
			
		}
		
		
		
	}
	
	public static void sort(int[] array) {
		
		int low = 0;
		
		int high = array.length-1;
		
		sort(array,low,high);
		
		
	}

	private static void sort(int[] array, int low, int high) {
		
		if(array==null||low >= high) {
			return;
		}
		int i = low;
		
		int j = high;
		
		int base = array[low];
		
		while(i < j) {
			
			while(array[j] >= base && i< j) {
				
				j--;
			}
			
			if(i<j) {
				
				array[i] = array[j];
			}
			
			while(array[i] <= base && i <j) {
				
				i++;
			}
			
			if(i<j) {
				
				array[j] = array[i];
			}
			
			array[i] = base;			
			
			sort(array,low,i-1);
			
			
			sort(array,i+1,high);
			
		}
		
		
	}
}
