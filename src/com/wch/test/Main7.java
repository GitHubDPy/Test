package com.wch.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()){
            
            int inp = scan.nextInt();
            
            
            
            System.out.println(count(inp));
            System.out.println("end");
            
        }
        
    }
    
    public static int count(int n) {
    	
    	if(n>0) {
    		int count = 0;
        	for(int i  = 2 ;i <= n;i++) {
        		
        		List<Integer> list = new ArrayList<>();
        		int sum = 0;
        		
        		for(int j = 1;j<=i/2;j++) {
        			if(i % j == 0 ) {
        				list.add(j);
        				
        			}
        		}
        		
        		for (Integer integer : list) {
    				sum += integer;
    			}
        		if(sum == i) {
        			count++;
        			System.out.println("有"+i);
        		}
        		
        	}
        	
        	return count ;
    	}
    	else {
			return -1;
		}
    }
    
}