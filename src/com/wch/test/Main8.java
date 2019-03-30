package com.wch.test;

import java.math.BigInteger;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) { 

		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			
			String nextLine = scanner.nextLine();
			
			String[] splits = nextLine.split(" ");
			
			BigInteger aBigInteger = new BigInteger(splits[0]);
			
			BigInteger bBigInteger = new BigInteger(splits[1]);
			
			System.out.println(aBigInteger.add(bBigInteger));
			
			

		}
		
		
	}

}
