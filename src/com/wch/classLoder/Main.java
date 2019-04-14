package com.wch.classLoder;
/**
 * 测试类静态代码块，构造函数加载顺序；
 * @author 吴超辉
 *
 */
public class Main {

	public static void main(String[] args) {

		B b = new B();

		System.out.println(B.high);

		System.out.println("----------------------");

		B b1 = new B("hello");
		System.out.println(B.high);

	}

}

class A {

	static int width;

	static {

		width = 200;
		System.out.println("A静态代码块,");
	}

	public A() {
		System.out.println("A构造函数");
	}

}

class B extends A {

	String name;

	static int high;

	static {

		high = 200;
		System.out.println("B静态代码块,");
	}

	public B() {
		
		System.out.println("B构造函数");
	}

	public B(String name) {
		this.name = name;
	}

}
