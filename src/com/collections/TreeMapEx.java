
package com.collections;
import java.util.TreeMap;


public class TreeMapEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeMap<String, Object> m=new TreeMap<String, Object>();
        m.put("roll", new Integer(12));
        m.put("rollno", 13);
        //m.put(null,null);
        //tree map doesnt take null values
        m.put("name", "ashu");
        m.put("age", 22);
        m.put("age", 22);
        
        
        
        System.out.println("Keys:" + m.keySet());
        System.out.println("Keys:" + m.values());
        
        
        

        

	}

}
