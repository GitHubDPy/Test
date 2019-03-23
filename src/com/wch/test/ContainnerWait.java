package com.wch.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ContainnerWait {

	public static void main(String[] args) {

		Containner containner = new Containner();

		Consumer consumer = new Consumer(containner);

		Producer producer = new Producer(containner);

		new Thread(consumer).start();
		new Thread(producer).start();
		
		Set set = new HashSet<>();
		

	}

}

//消费者
class Consumer implements Runnable {

	// 有一个管道容器
	Containner containner;

	public Consumer(Containner containner) {
		this.containner = containner;
	}

	@Override
	public void run() {
		synchronized (containner) {
			for (int i = 0; i < 100; i++) {
				// 检测是否有馒头
				if (containner.count == 0) {
					// 没有馒头
					try {
						containner.wait();
					} catch (InterruptedException e) {
					}
				}

				// 消费馒头
				containner.notifyAll();
				Mantou mantou = containner.pop();
				System.out.println("消费第" + mantou.id + "个馒头");
			}
		}

	}

}

//生产者
class Producer implements Runnable {

	// 有一个管道容器
	Containner containner;

	public Producer(Containner containner) {
		this.containner = containner;
	}

	@Override
	public  void run() {
		synchronized(containner) {
		// 生产100个
		for (int i = 0; i < 105; i++) {

			//如果管道已满，停止生产
			if(containner.count==containner.mantous.length) {
				//停止生产
				try {
					containner.wait();
				} catch (InterruptedException e) {
				}
			}
			
			containner.notifyAll();
			containner.push(new Mantou(i));
			System.out.println("生产第" + i + "个馒头");
		}
	}
		}

}

//管道容器
class Containner {
	// 容器只能装10个
	Mantou[] mantous = new Mantou[10];
	int count = 0;

	// 填充馒头
	public void push(Mantou mantou) {
		mantous[count] = mantou;
		count++;
	}

	// 取出馒头
	public Mantou pop() {

		count--;
		Mantou mantou = mantous[count];
		return mantou;
	}

}

//产品馒头
class Mantou {

	int id;

	public Mantou(int id) {
		super();
		this.id = id;
	}

}
