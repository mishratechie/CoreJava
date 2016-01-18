package com.MonitorAKeywordInLog;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.StringTokenizer;

//This program will monitor a log file for a expected word to appear into it.
//Here we are searching for the word Tehie

/*
 * How to run ?
 * open MonitorAKeywordLog.txt file and delete the word Techie.
 * 
 * Now run this program.
 * 
 * Watch the output saying Expected last line Exist ? : False
 * 
 * Now let the program run and on fly add a linw in the last with the word techie.
 * 
 * Observe the output in console and program terminates as the word gets found
 * 
 * */

public class MonitorLog {

  public static void main(String[] args) {

	  try { 
	    	
	    	Properties prop = new Properties();
	    	prop.load(new FileInputStream("MonitorAKeywordInLog.properties"));
	    	   		
		    String logFileToMonitor = prop.getProperty("logFileToMonitor");

		    
		 	boolean lastExist=false;
		 						
			// Continuously monitors log file for updates 
			do{
					Thread.sleep(1000);//30000 = 30sec
					lastExist=KeyWordReader.lastLine(logFileToMonitor);
					System.out.println("Expected Last Line Exist ? : " + lastExist);
				}while(false==lastExist);
			
			System.out.println(lastExist);
			
						
			

	    } catch (Exception e) {
	      System.err.println("log file cannot be read : " + e);
	    }
	  }

}//class close
  



