package com.oops;



 class Animal{

	   public void move(){
	      System.out.println("Animals can move");
	   }
	}

 class Dog extends Animal{

	   public void move(){
	      System.out.println("Dogs can walk and run");
	   } 
	   public void bark(){
	          System.out.println("Dogs can bark");
	   }
	   
	}

public class MethodOverriding{

	   public static void main(String args[]){
	      //Trial#1
		  Animal a = new Animal(); // Animal reference and object
	      Animal b = new Dog(); // Animal reference but Dog object

	      a.move();// runs the method in Animal class

	      b.move();//Runs the method in Dog class
	      
	      
	      
	      //-------
	      //Trial#2 will result in Error
	      /*
	  Animal a = new Animal(); // Animal reference and object
      Animal b = new Dog(); // Animal reference but Dog object

      a.move();// runs the method in Animal class
      b.move();//Runs the method in Dog class
      b.bark(); //Will result in error
	       * */
	      
	   }
	}
