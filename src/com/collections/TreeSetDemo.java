package com.collections;
import java.util.*;

class  TreeSetDemo
{
	public static void main(String[] args) 
	{
		TreeSet<String> hs = new TreeSet<String>();

		//add elements to tree set
		hs.add("C");
		hs.add("J");
		hs.add("A");
		hs.add("N");
		hs.add("F");
		hs.add("Z");

		System.out.println("Contents of Hash set : " +hs);

		System.out.println("Size : " + hs.size());

		hs.remove("C");

		System.out.println("Contents of Hash set after deletion : " + hs);
	}
}