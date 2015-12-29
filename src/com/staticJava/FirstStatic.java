package com.staticJava;

public class FirstStatic extends mainStatic {

	
	
	public static void main(String[] args) 
	{
		System.out.println("inside main()");
		System.out.println(" a value is : "+ mainStatic.a);
		
	}
	
}
class mainStatic{
	
	//static variable a
	static int a;

	//static block
	static
    {
		System.out.println("Inside static Block");
		a = 20;

	}
}