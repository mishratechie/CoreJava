package com.constructorJava;

public class Chaining {

	public static void main(String[] args) {
		new C();
	}
	
}

class A //Base class  or parent or super class
{
	A()
	{
		System.out.println("in Class A");
	}
	
}

class B extends A //child extending the parent class A
{
	B()
	{
		System.out.println("in Class B");
	}
}

class C extends B //B=super class for class C...c=child class
{
	C()
	{
		System.out.println("in Class C");
	}
}