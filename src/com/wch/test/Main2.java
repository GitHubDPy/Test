package com.wch.test;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			
			String password = scanner.nextLine();
			
			if(password.length()<9) {
				System.out.println("NG");
			}else {
				//数字[0] 大写字母[1] 小写字母[2] 其他字符[3]
//				System.out.println("长度ok");
				int[] index = new int[4];
				
				
				for(int i = 0 ; i<password.length();i++) {
					
					if(password.charAt(i)>='0' && password.charAt(i)<='9') {
						
						index[0]++;
					}else if (password.charAt(i)>='A' && password.charAt(i)<='Z') {
						
						index[1]++;
						
					}else if (password.charAt(i)>='a' && password.charAt(i)<='z') {
						
						index[2]++;
						
					}else {
						index[3]++;
					}				
				}
				
				boolean isContainMoreThenThree = false;
				
				int contain = 0;
				
				for (int i : index) {
					
					if(i>0) {
						contain += 1;
					}
				}
				
				
				if(contain>=3) {
					isContainMoreThenThree = true;
//					System.out.println("包含三种以上字符");
				}
				
				//判断字符是否有重复子串
				boolean isContainString = true;
				
				for(int i = 0;i<password.length()-3;i++) {
					
					String str = password.substring(i, i+3);
					
					String lastString = password.substring(i+3);
					
					boolean contains = lastString.contains(str);
					
					if(contains) {
						
						isContainString = false;
//						System.out.println("包含重复字符"+str);
						break;
					}
					
				}
				
				if(isContainMoreThenThree && isContainString) {
					
					System.out.println("OK");
				}else {
					System.out.println("NG");
				}
			}
			
			
		}
	}
}
