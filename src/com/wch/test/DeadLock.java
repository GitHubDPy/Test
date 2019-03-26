package com.wch.test;

import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.sun.org.apache.regexp.internal.recompile;

public class DeadLock {
	private static Lock lock1 = new ReentrantLock();
	private static Lock lock2 = new ReentrantLock();

	public static void main(String[] args) throws Exception {
		MyThread1 myThread1 = new MyThread1(lock1, lock2);
		MyThread2 myThread2 = new MyThread2(lock1, lock2);
		Thread thread1 = new Thread(myThread1);
		Thread thread2 = new Thread(myThread2);
		thread1.start();
		thread2.start();

		Random random = new Random();
	}
}

class MyThread1 implements Runnable {

	private Lock lock1;

	// 定义一个公平锁
	ReentrantLock reentrantLock = new ReentrantLock(true);

	private Lock lock2;

	public MyThread1(Lock lock1, Lock lock2) {
		super();
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	@Override
	public void run() {
		while (true) {
			lock1.lock();
			System.out.println("获得1号");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			lock2.lock();
			System.out.println("获得2号");
			lock2.unlock();
			lock1.unlock();
		}
	}
}

class MyThread2 implements Runnable {

	private Lock lock1;
	private Lock lock2;

	public MyThread2(Lock lock1, Lock lock2) {
		super();
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	@Override
	public void run() {
		while (true) {
			lock2.lock();
			System.out.println("获得3号");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			lock1.lock();
			System.out.println("获得4号");
			lock1.unlock();
			lock2.unlock();

		}

	}
}
