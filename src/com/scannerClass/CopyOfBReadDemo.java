package com.scannerClass;

import java.io.*;

class CopyOfBReadDemo
{
	public static void main(String args[]) throws IOException
	{
		char c;	

		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter characters . 'q' to quit.");

		// read Characters

		do
		{
			c = (char) br.read();
			System.out.println(c);
		}while(c != 'q');
	}
}