package com.Threading;

public class ThreadSleep2{
	  public static void main(String[] args){
	  Thread th = new Thread();
	  System.out.println("Numbers are printing line by line after 2 seconds : ");
	  try{
		  for(int i = 1;i <= 10;i++)
		    {
			 
			  System.out.println(i);
			  
//U can use this getId to get the Id of thread
//and as the concept says ..all id's should be same.
			 // System.out.println("id is :" +th.getId());
//TO get thread Name			  
			  //System.out.println(th.getName());
			  
			  
			  th.sleep(2000);
			  if(i==3)
			  {
				  //U can use the method destroy when i turns 3
				 //th.destroy();
				  
				  //System.out.println(th.getContextClassLoader());
			  }
		  
		 	}
	  	}
	  catch(InterruptedException e){
	    System.out.println("Thread interrupted!");
	    e.printStackTrace();
	  }
	  }
	} 