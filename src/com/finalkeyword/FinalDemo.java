package com.finalkeyword;

class FinalMethod 
{
	final int x = 25;

	void method()
    {
		System.out.println("Inside the final Method...");
	}
}

class SubClass extends FinalMethod
{
	void method()
	{
		System.out.println("Inside subclass");
		//x+= 5;
	}
}

class FinalDemo 
{
	public static void main(String[] args) 
	{
		SubClass sc = new SubClass();
		sc.method();
	}
}
