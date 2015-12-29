package com.oops;

// Abstract classes

abstract class  Aa1
{
	  void callme(){};

	  void callmetoo()
	  {
				System.out.println("This is a concrete method");	   
	  }
}

class Bb1 extends Aa1
{
	   void callme()
	   {
				System.out.println("B's implementation of A's abstract method");	   
	   }

	   void childMethod()
	   {
				System.out.println("Child Class Method..");	   
	   }
}

class AbstractDemo
{
		public static void main(String[] args) 
		{
				Bb1 b = new Bb1();
				Aa1 a = new Bb1();

				System.out.println("Sub Class reference...");	

				b.callme();
				b.callmetoo();
				b.childMethod();
				
				System.out.println("---------------------------------");

				System.out.println("Super Class reference...");	
				a.callme();
				a.callmetoo();
				//a.childMethod(); //learn error
		}
}
