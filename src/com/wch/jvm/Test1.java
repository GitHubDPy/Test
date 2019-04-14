package com.wch.jvm;

public class Test1 {

	public static void main(String[] args) {

		System.out.println(Runtime.getRuntime().maxMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().totalMemory());
		int[] a = new int[1024];
		System.out.println(Runtime.getRuntime().maxMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().totalMemory());
	}

}
