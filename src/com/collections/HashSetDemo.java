package com.collections;
import java.util.*;

class HashSetDemo
{
	public static void main(String[] args) 
	{
		//Create a hash set
		HashSet hs = new HashSet();

		//add elements to hash set
		hs.add("E");
		hs.add("N");
		hs.add("O");
		hs.add("O");
		hs.add("C");
		hs.add("H");
		hs.add("P");

		System.out.println(hs);

		System.out.println("Size : " + hs.size());

		hs.remove("P");

		System.out.println("Contents of Hash set after deletion : " + hs);
	}
}