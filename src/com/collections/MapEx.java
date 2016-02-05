package com.collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class MapEx {

	
	public static void main(String[] args) {
		HashMap<String, Object> m = new HashMap<String, Object>();
		//LinkedHashMap  m=new LinkedHashMap();
		//TreeMap m=new TreeMap();
        m.put("roll", new Integer(12));
        m.put("rollno", 13);
        m.put(null,null);
        m.put("name", "ashu");
        m.put("age", 22);
        m.put("age", 22);
        m.put(null,null);
        
        System.out.println("Get Method : " + m.get("age"));
        
        //entrySetReturns a Set view of the mappings contained in this map. 
        //The set is backed by the map, so changes to the map are reflected in the set, and vice-versa. 
        Set<Entry<String, Object>> s = m.entrySet();
        Iterator<Entry<String, Object>> i = s.iterator();
        while (i.hasNext()) {
                System.out.println(i.next());
        }

	}

}
