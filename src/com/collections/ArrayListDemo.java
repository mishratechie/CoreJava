package com.collections;

import java.util.*;

class ArrayListDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		// create an ArrayList
		ArrayList al = new ArrayList();

		// Initial size of an ArrayList
		System.out.println("Initial size of al : " + al.size());

		// add elements to the ArrayList
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		
		Iterator s=al.iterator();
		while(s.hasNext())
		{
			System.out.println(s.next());
		
		}
		Thread.sleep(10000);
		//add at specific location 0 to maxSize of array
		al.add(5, "A2");

		System.out.println("Size of al after additions : " + al.size());

		// Display ArrayList
		System.out.println("Contents of al : " + al);

		// Remove elements from ArrayList
		al.remove("F");
		al.remove(2);

		System.out.println("Size of al after deletions : " + al.size());

		// Display ArrayList
		System.out.println("Contents of al : " + al);
	}
}