package com.collections;
import java.util.*;
import java.util.Map.Entry;

class TreeMapDemo
{
	public static void main(String[] args) 
	{
		//create a Tree map
		TreeMap<String, Double> tm = new TreeMap<String, Double>();

		//put elements to Tree map
		tm.put("Aloke", new Double(3434.34));
        tm.put("Krishan", new Double(123.23));
        tm.put("Raman", new Double(1378.00));
        tm.put("Gopi", new Double(99.25));
        tm.put("Chiranjeevi", new Double(-19.08));
        
		//get a set of entries
		Set<Entry<String, Double>> set = tm.entrySet();

		//get an iterator
		Iterator<Entry<String, Double>> it = set.iterator();

		//display elements
		while(it.hasNext())
		{
			Entry<String, Double> me = it.next();

			System.out.print(me.getKey() + "  :  ");

			System.out.println(me.getValue());
		}

		System.out.println();
		
		// Deposit 1000 into Gopi's account
		double balance=tm.get("Gopi").doubleValue();

		tm.put("Gopi", new Double(balance+1000));
    
		System.out.println("Gopi's new balance : " + tm.get("Gopi"));
	}
}