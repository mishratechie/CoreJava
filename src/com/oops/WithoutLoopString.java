package com.oops;

public class WithoutLoopString {

	
	
	
	public static void main(String[] args) {
		
		recursiveMe("Hello",5);
	}
	
	
	
	public static void recursiveMe(String s,int howManyTimes) {
	    if(howManyTimes <= 10) {// 10 is the max limit
	        
	    	System.out.println(s);//print n
	        recursiveMe(s,howManyTimes+1);//call recursiveMe with n=n+1
	    }
	}
	//recursiveMe(1); // call the function with 1.
}


