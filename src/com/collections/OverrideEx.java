package com.collections;
 class Parent{

	public void move()
	{
		System.out.println("ParentClass move");
	}
	
}
class Child extends Parent
{
	public void move()
	{
		System.out.println("child class move");
	}
	public void walk()
	{
		System.out.println("child class walk");
	}
}

public class OverrideEx{
	public static void main(String[] args) {
		Parent a=new Parent();
		//Parent Class reference holding child class object,and overriding  Parent b=new Child();
		Parent b=new Child();
		a.move();
		b.move();//overriding
		
		
		
		Child c=new Child();

		c.walk();
		c.move();
		
	}
}