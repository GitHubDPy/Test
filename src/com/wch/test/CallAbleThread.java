package com.wch.test;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;


public class CallAbleThread{
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallAble callAble =  new CallAble();
		
		FutureTask futureTask =  new FutureTask<>(callAble);		
		
		new Thread(futureTask).start();
		
		
		//获取call方法的返回值
		int i = (int) futureTask.get();
		
		
		
		System.out.println("i="+i);
		
	}
}


class CallAble implements Callable{

	@Override
	public Object call() throws Exception {
		for(int i = 0; i<10;i++)
		{
			System.out.println(i);
		}
		return 10;
	}

}
