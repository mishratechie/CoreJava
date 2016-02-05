package com.collections;
import java.util.*;

class LinkedListDemo
{
	public static void main(String[] args) 
	{
		// add elements to linked list 
		LinkedList<String> ll =new LinkedList<String>();
		
		ll.add("A");
		ll.add("E");
		ll.add("B");
		ll.add("D");
		ll.add("F");
		ll.addLast("Z");
		ll.addFirst("G");
		ll.add(1, "A2");

		System.out.println("original contents of linked list : " + ll);

		System.out.println("Size : " + ll.size());

		//remove elements from linked list
		ll.remove("F");
		ll.remove(2);

		System.out.println("Contents of linked list after deletion : " + ll);

		//remove first and last elements
		ll.removeFirst();
	    ll.removeLast();
    
		System.out.println("linked list after deleting first and last : " + ll);
		
		//get and set values
		Object val = ll.get(2);
		
		ll.set(2,(String)val+ "changed");

		System.out.println("linked list after change:" +ll);
	}
}