package com.wch.test.sort;

public class BubbleSort {

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
		
		for(int i=0;i<array.length-1;i++) {
			
			int temp = 0 ; 
			
			for(int j = 0; j<array.length-i-1;j++) {
				
				if(array[j] > array[j+1]) { 
					
					temp = array[j];
					
					array[j] = array[j+1];
					
					array[j+1] = temp;
					
				}
				
			}
			
		}
		
	}

}
