package com.wch.test;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


public class CallAbleThread{
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallAble callAble =  new CallAble();
		
		FutureTask futureTask =  new FutureTask<>(callAble);		
		
		new Thread(futureTask).start();
		
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
