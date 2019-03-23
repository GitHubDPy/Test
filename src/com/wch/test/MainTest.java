package com.wch.test;



public class MainTest {
	public Dog changeColor(Dog dog) {
		dog.setColor("red");
		return dog;
	}
	
	public int  changeAge(int x) {
		x=x+1;
		return x;
	}
	
	
	

	public static void main(String[] args) {
		int x =1;
		Dog dog = new Dog("black");
		
		MainTest mainTest =  new MainTest();
		Dog changeColor = mainTest.changeColor(dog);
		int changeAge = mainTest.changeAge(x);
		System.out.println(dog.hashCode());
		System.out.println(changeColor.hashCode());
		System.out.println(x);
		System.out.println(changeAge);
		

	}

}
class Dog
{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Dog(String color)
	{
		this.color=color;
	}
}
