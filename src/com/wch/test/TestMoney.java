
package com.wch.test;


public class TestMoney {
	
	
	public int getMinNum(int price) {
	
		int minNum = 0;
		int num = 0;
		
		int []prices = {64,16,4,1};
		
		for(int i=0;i<4;i++) {
			if(price % prices[i]==0)
			{
				 num = price / prices[i];
				 minNum += num;
				 break;
			}
			else {
				 num = price/ prices[i];
				
				price = price % prices[i];			
				
			}
			minNum += num;
		}
		
		return minNum;
		
	}
	
	public static void main(String[] args) {
		
	
		TestMoney testMoney =  new TestMoney();
		
		int minNum = testMoney.getMinNum(20);
		
		System.out.println("最少个数为"+minNum);
		
		
	}

}
