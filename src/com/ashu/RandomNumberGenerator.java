package com.ashu;

import java.util.Random;

public class RandomNumberGenerator {

	
	 
		  
	  public static int getRandomNumber(int length){  
	  
	        Random r = new Random();  
	  
	         String number="";  
	  
	         int counter=0;  
	  
	         while(counter++< length) number+= r.nextInt(9);  
	  
	        return Integer.parseInt(number);  
	  
	    }  
	  
	    public static void main(String[] args) {  
	     
	        System.out.println(getRandomNumber(8));  
	  
	    }  
	
	
}
