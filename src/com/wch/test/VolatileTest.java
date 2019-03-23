package com.wch.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

import javafx.scene.shape.VLineTo;

public class VolatileTest {
	
	public static void main(String[] args) {
		
		Container container = new Container();
		
		new Thread(new AddThread(container)).start();
		
		new Thread(new ListenerThread(container)).start();
		
	}

}

class AddThread implements Runnable {

//	private Container container;
	private volatile Container container;

	public AddThread(Container container) {
		this.container = container;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			this.container.add(i);
			System.out.println("添加了" + i + "  此时size=" + container.size());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}

		}

	}
}

class ListenerThread implements Runnable {

//	private   Container container;
	
	//有volatile关键字表示当前线程会中该属性一旦变化，当前线程会马上知道该属性发生了变化
	private volatile Container container;

	

		public ListenerThread(Container container) {
		this.container = container;
	}

		@Override
		public void run() {
			while(true)
			{
				if(container.size()==5) {
					System.out.println("监听线程监听成功");
					break;

					
				}
			}
			// TODO Auto-generated method stub

		}

}

class Container{
	
	private List list = new ArrayList<>();
	
	public void add(Object e) {
		this.list.add(e);
	}
	
	public int size() {
		return list.size();
	}
}