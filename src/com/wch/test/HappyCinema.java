package com.wch.test;

import java.util.ArrayList;
import java.util.List;

public class HappyCinema {

	String name;
	List<Integer> avaliable;

	public HappyCinema(String name, List<Integer> avaliable) {
		super();
		this.name = name;
		this.avaliable = avaliable;
	}

	boolean bookTicket(List<Integer> seats) {

		List<Integer> copy = new ArrayList<Integer>();
		copy.addAll(avaliable);

		copy.removeAll(seats);
		if (avaliable.size() - copy.size() == seats.size()) {
			avaliable.removeAll(seats);
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		
		List<Integer> avaliable = new ArrayList<>();
		avaliable.add(1);
		avaliable.add(2);
		avaliable.add(3);
		avaliable.add(4);
		avaliable.add(5);	
		avaliable.add(6);	
		HappyCinema cinema =  new HappyCinema("happy", avaliable);
		
		
		List<Integer> seat1 = new ArrayList<>();
		seat1.add(1);
		seat1.add(2);
		seat1.add(3);
		
		List<Integer> seat2 = new ArrayList<>();
		seat2.add(1);
		seat2.add(2);
		seat2.add(3);
		new Thread(new Customer("张三", cinema, seat1)).start();
		new Thread(new Customer("李四", cinema, seat2)).start();
		
		
		
	}

}

class Customer implements Runnable {

	String name;
	HappyCinema cinema;
	List<Integer> seats;
	

	public Customer(String name, HappyCinema cinema, List<Integer> seats) {
		super();
		this.name = name;
		this.cinema = cinema;
		this.seats = seats;
	}


	@Override
	public void run() {

		synchronized (cinema) {
			
			System.out.println("当前位置剩余为：" + cinema.avaliable);
			boolean flag = cinema.bookTicket(seats);
			if (flag) {
				System.out.println(name + "购票成功,剩余票为" + cinema.avaliable);

			} else {
				System.out.println(name + "购票成失败");
			}
		}
	}

}
