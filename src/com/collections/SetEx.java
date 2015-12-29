package com.collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetEx {

	
	public static void main(String[] args) {
		
		//Set s=new HashSet();
		//Set s=new LinkedHashSet();
		Set s=new TreeSet();
		
		s.add(58);
		s.add(2);
		s.add(s.hashCode());
		//s.add(null); 
		
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
