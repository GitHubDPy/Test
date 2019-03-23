package com.wch.test;

class SingleTon {

	private static volatile SingleTon singleTon = null;

	private SingleTon() {};

	public static SingleTon getInstance() {

		if (singleTon == null) {
			synchronized (SingleTon.class) {
				if (singleTon == null) {
					singleTon = new SingleTon();
				}
			}
		}

		return singleTon;
	}

	public static void main(String[] args) {

		SingleTon singleTon1 = SingleTon.getInstance();

		SingleTon singleTon2 = SingleTon.getInstance();

		System.out.println(singleTon1==(singleTon2));
	}

}
