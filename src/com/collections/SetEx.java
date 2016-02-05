package com.collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class SetEx {

	
	public static void main(String[] args) {
		
		//Set s=new HashSet();
		//Set s=new LinkedHashSet();
		Set<Integer> s=new TreeSet<Integer>();
		
		s.add(58);
		s.add(2);
		s.add(s.hashCode());
		//s.add(null); 
		
		Iterator<Integer> i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
