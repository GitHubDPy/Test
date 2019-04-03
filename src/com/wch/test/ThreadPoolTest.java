package com.wch.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class ThreadPoolTest {

	
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		
		 ExecutorService service = Executors.newFixedThreadPool(8);
				 
		for(int i = 0; i < 10 ;i++) {
			
//			service.execute(new Runnable());
//			service.submit(new Callable<T>);
			 service.submit(new Runnable() {
					
					@Override
					public void run() {
						System.out.println(Thread.currentThread().getName());
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
					}
				});
		}
	}
}
