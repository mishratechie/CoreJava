package com.collections;
import java.util.*;
import java.util.Map.Entry;

class  HashMapDemo
{
	public static void main(String[] args) 
	{
		//create a hash map
		HashMap<Object,Object> hm = new HashMap<Object,Object>();

		//put elements to map
		hm.put("Aloke", new Double(3434.34));
        hm.put("Krishan", new Double(123.23));
        hm.put("Raman", new Double(1378.00));
        hm.put("Gopi", new Double(99.25));
        hm.put("Chiranjeevi", new Double(-19.08));

		//get a set of entries
		Set<Entry<Object, Object>> set = hm.entrySet();

		//get an iterator
		Iterator<Entry<Object, Object>> i = set.iterator();

		//display elements
		while(i.hasNext())
		{
			//Map.Entry me=(Map.Entry)i.next(); // This will have warnings Uncomment to see the warning
			Entry<Object, Object> me=i.next();

			System.out.print(me.getKey() + " : ");

			System.out.println(me.getValue());
		}

		System.out.println();

		// Deposit 1000 into Aloke's account
		double balance=((Double)hm.get("Aloke")).doubleValue();

		hm.put("Aloke", new Double(balance+1000));

		System.out.println("Aloke's new balance : " + hm.get("Aloke"));

		String  s = ((Double)hm.get("Gopi")).toString();

		double d = Double.parseDouble(s);

		System.out.println("Gopi's balance : " + d);

		hm.put("Gopi", new Double(d+1000));

		System.out.println("Gopi's new balance : " + hm.get("Gopi"));
	}
}