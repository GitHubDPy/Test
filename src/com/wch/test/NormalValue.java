package com.wch.test;

public class NormalValue {

	public static void main(String[] args) {

		int y = 1;		
		
		NormalValue normalValue  = new NormalValue();
		int m = normalValue.changeValue(y);
		
		System.out.println("y=" + y);
		System.out.println("m=" + m);		
		
		
		Integer a1 = 128;
		Integer a2 = 128;
		int a3 = 128;
		System.out.println(a1);
		
	}
	
	
	
	public int changeValue(int x) {
		
		x = x + 1;
		return x;
		
	}

}
