package com.wch.test;

import java.util.List;

public class ThreadWait {

	private int age = 0;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		ThreadWait threadWait = new ThreadWait();
		Runnable runnable = new MyWait1(threadWait);
		Thread thread1 = new Thread(runnable);
		Runnable runnable2 = new MyWait2(threadWait);
		Thread thread2 = new Thread(runnable2);
		thread1.start();
		thread2.start();

	}

}



class MyWait1 implements Runnable {

	private ThreadWait threadwatit;
	

	public MyWait1(ThreadWait threadwatit) {
		super();
		this.threadwatit = threadwatit;
	}
	
	
	@Override
	public void run() {
		while (true) {
		
			synchronized (threadwatit) {
				try {
					System.out.println("wait1之前的代码在执行,age="+threadwatit.getAge());
					
					if (threadwatit.getAge() < 2) {
						threadwatit.wait();
					}
				} catch (Exception e) {

					
				}
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("wait2之后的代码也会执行,i="+threadwatit.getAge());
			}
		}
	}
}

class MyWait2 implements Runnable {

	private ThreadWait threadwatit;

	public MyWait2(ThreadWait threadwatit) {
		super();
		this.threadwatit = threadwatit;
	}

	@Override
	public void run() {
		int i=0;
		while (true) {
			i++;
			synchronized (threadwatit) {
				try {
					System.out.println("notify2之前的代码在执行,i="+threadwatit.getAge());

					Thread.sleep(2000);
					threadwatit.setAge(i);
					if (threadwatit.getAge() > 2) {

						threadwatit.notify();
					}
				} catch (Exception e) {
					e.printStackTrace();
				
				}

				System.out.println("notify2之后的代码也会执行,i="+threadwatit.getAge());
			}
		}
	}
}