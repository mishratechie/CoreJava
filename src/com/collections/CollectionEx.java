package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectionEx {

	
	public static void main(String[] args) {
		Collection c=new ArrayList();
		
		c.add(1);
		c.add("hello");
		c.add("2");
		c.add("welcome");
		
		Iterator i=c.iterator();
		
		
		if(c.isEmpty())
		{
			System.out.println("we have no elements");
		}
		else{
			System.out.println("we have elements as follows");
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		}
		
		

	}

}
