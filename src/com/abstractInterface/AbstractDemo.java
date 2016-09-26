package com.abstractInterface;

// Abstract classes

abstract class  Aa1
{
	  void callme(){};

	  void callmetoo()
	  {
				System.out.println("This is a concrete method callmetoo Aa1");	   
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
				System.out.println("Child Class Method.. of Bb1");	   
	   }
}

class AbstractDemo
{
		public static void main(String[] args) 
		{
				/*Bb1 b = new Bb1();
				Aa1 a = new Bb1();

				System.out.println("Sub Class reference...");	

				b.callme();
				b.callmetoo();
				b.childMethod();
				
				System.out.println("---------------------------------");

				System.out.println("Super Class reference...");	
				a.callme();
				a.callmetoo();
				//a.childMethod();*/



			Aa1 aa1=new Aa1(){};/*
			//Good to read :http://javarevisited.blogspot.in/2013/04/10-abstract-class-and-interface-interview-question-java-answers.html
			http://stackoverflow.com/questions/13670991/interview-can-we-instantiate-abstract-class
			No, you are not creating the instance of your abstract class here. Rather you are creating an instance of an anonymous subclass of your abstract class. And then you are invoking the method on your abstract class reference pointing to subclass object.

This behaviour is clearly listed in JLS - Section # 15.9.1: -

If the class instance creation expression ends in a class body, then the class being instantiated is an anonymous class. Then:

If T denotes a class, then an anonymous direct subclass of the class named by T is declared. It is a compile-time error if the class denoted by T is a final class.
If T denotes an interface, then an anonymous direct subclass of Object that implements the interface named by T is declared.
In either case, the body of the subclass is the ClassBody given in the class instance creation expression.
The class being instantiated is the anonymous subclass.*/
			aa1.callmetoo();
			aa1.callme();
		}
}
