package com.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ListEx {

	
	public static void main(String[] args) {
	
		List l=new ArrayList();
		//List l=new LinkedList();
		
		l.add(1);
		l.add(2);
		l.add(null);
		Iterator i=l.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("size of our list is :"+(l.size()));
	}

}
