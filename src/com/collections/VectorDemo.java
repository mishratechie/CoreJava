package com.collections;

import java.util.*;

class VectorDemo
{
	public static void main(String[] args) 
	{
		// Initial size is 3 increment is 2
		Vector v = new Vector(3, 2);

		// Size
		System.out.println("Initial size : " + v.size());

		// Capacity
		System.out.println("Initial capacity : " + v.capacity());

		// Add Elements
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));

		System.out.println("Capacity after additions : " + v.capacity());

		v.addElement(new Double(5.45));
		System.out.println("Current Capacity 1 : " + v.capacity());

		v.addElement(new Double(6.08));
		v.addElement(new Integer(7));
		System.out.println("Current Capacity 2 : " + v.capacity());

		v.addElement(new Float(9.4));
		v.addElement(new Integer(9));
		System.out.println("Current Capacity 3 : " + v.capacity());

		v.addElement(new Integer(11));
		v.addElement(new Integer(12));

		System.out.println("First Element : " + (Integer)v.firstElement());
		System.out.println("Last Element : " + (Integer)v.lastElement());

		System.out.println("Fourth Element : " + v.get(4));
	
		if(v.contains(new Integer(3)))
		{
				System.out.println("Vector contains element 3 : " + v.contains(new Integer(3)));
		}

		// Enumerate the elements in the Vector
		//Enumeration enum = v.elements();

		System.out.println("\nElements in Vector....");

		//while(enum.hasMoreElements())
		//{
		//	System.out.println(enum.nextElement() + "");
		//}

		System.out.println();
	}
}