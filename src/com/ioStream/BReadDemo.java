package com.ioStream;

import java.io.*;

class BReadDemo
{
	public static void main(String args[]) throws IOException
	{
		char c;	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter characters . 'q' to quit.");

		// read Characters

		do
		{
			c = (char) br.read();
			System.out.println(c);
		}while(c != 'q');
	}
}