package com.scannerClass;

import java.util.Scanner;

public class scannerEx {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter a num to be read :");
		System.out.println("number u have entered is :"+s.nextInt());
		
		System.out.println("\n enter a string to be read :");
		System.out.println("string u have entered is :"+s.next());
	}
}
