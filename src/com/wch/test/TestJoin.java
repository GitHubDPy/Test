package com.wch.test;

public class TestJoin {

	public static void main(String[] args) throws InterruptedException {

		Print print = new Print();
		Thread []threads = new Thread[5];
		for(int i = 0 ;i<5;i++) {
			threads[i] = new Thread(print);
		}
		
			
		
		for (Thread thread : threads) {
			
			try {
				thread.start();
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}


class Print implements Runnable{

	@Override
	public void run() {

		for(int i = 0;i<5;i++) {
			if(i == 3)
			{
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
	
}