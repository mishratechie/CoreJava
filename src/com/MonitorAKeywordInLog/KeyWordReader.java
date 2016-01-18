package com.MonitorAKeywordInLog;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class KeyWordReader {

	
	public static boolean lastLine(String fName) throws IOException{
		
		String fn=fName;
		
		BufferedReader input = new BufferedReader(new FileReader(fn));
	    String last=null, line;
	    
	    //line variable will be fed with the one complete line
	    while ((line = input.readLine()) != null) {
	        last = line;
	    }
	    
	    input.close();
	    String toContain="Techie";
	    
	    //now the toContain string will be searched in the line variable
	    if(last.contains(toContain)){
	    	System.out.println(last);	    	
	    }
	       
	    
	    boolean retval = last.contains(toContain);
	    //System.out.println(retval);
		
		return retval;
		
	}
}
