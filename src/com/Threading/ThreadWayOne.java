package com.Threading;
//This is way one of executing threads by extending thread class.
//Debug and see how both the t.start() gets completed and then run() will get executed for,
//both the threads concurrently when you directly run and one my one when you run in debug mode.
//thing to observe is start() method -kind on initialization for both thread compltes first,after that the run will be called.
class ThreadDemo extends Thread {
	   private Thread t;
	   private String threadName;
	   
	   ThreadDemo( String name){
	       threadName = name;
	       System.out.println("Creating " +  threadName );
	   }
	   public void run() {
	      System.out.println("Running " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);
	            // Let the thread sleep for a while.
	            Thread.sleep(50);
	         }
	     } catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	     }
	     System.out.println("Thread " +  threadName + " exiting.");
	   }
	   
	   public void start ()
	   {
	      System.out.println("Starting " +  threadName );
	      if (t == null)
	      {
	         t = new Thread (this, threadName);//This will be same in both the Way's as we need to instantiale the thread
	         t.start ();
	      }
	   }

	}

	public class ThreadWayOne {
	   public static void main(String args[]) {
	   
	      ThreadDemo T1 = new ThreadDemo("Thread-1");
	      T1.start();
	      
	      ThreadDemo T2 = new ThreadDemo("Thread-2");
	      T2.start();
	   }   
	}