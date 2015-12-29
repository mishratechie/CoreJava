package com.collections;
import java.util.*;

class IteratorDemo
{
	public static void main(String[] args) 
	{
		// create an array list
		ArrayList al = new ArrayList();

		// add elements to the array list
		al.add("C");
		al.add("A");
		al.add("B");
		al.add("E");
		al.add("F");
		al.add("D");

		// use iterator to display contents of 'al'		
		System.out.println("Original contents of al : ");

		Iterator itr = al.iterator();

		while(itr.hasNext())
		{
			Object obj = itr.next();
			System.out.print(obj + " ");
		}

		System.out.println();

		// Modify objects being itareted
		ListIterator litr = al.listIterator();

		while(litr.hasNext())
		{
			Object obj = litr.next();
			litr.set(obj + "+");
		}

		System.out.println("Modified contents of al : ");

		itr = al.iterator();

		while(itr.hasNext())
		{
			Object obj = itr.next();
			System.out.print(obj + "");
		}

		System.out.println();

		// Now display the list backwards

		while(litr.hasPrevious())
		{
			Object obj = litr.previous();
			System.out.print(obj + "");
		}

		System.out.println();
	}
}