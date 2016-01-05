package com.InterviewReputation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class LongestWord {

public static void main(String[] args) throws FileNotFoundException {


	File file = new File("LongLineABC.txt");
	Scanner sc=new Scanner(file);
	
	String longestSoFar = "";
	while (sc.hasNext()) {
	    String current = sc.next();
	    if (current.length() > longestSoFar.length()) {
	        longestSoFar = current;
	    }
	}
	System.out.println("Longest word : "+longestSoFar);

}
}
