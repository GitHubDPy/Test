package com.wch.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TestRunnable{

	public static void main(String[] args) {
		MyRunnable myRunnable =  new MyRunnable();
	
		}

}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		boolean flag=true;
		int i = 0;
		while(flag) {
			try {
				Thread.sleep(1000);
				System.out.println("进行中");
				i++;
				if(i>20)
				{
					flag  = false;
				}
			} catch (InterruptedException e) {
				
			
		}

	}
	}
}


