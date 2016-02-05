package com.collections;

import java.util.*;
import java.util.Map.Entry;

public class Hashmap {
        public static void main(String[] args) {
        	  
        	HashMap<Object,Object> hash = new HashMap<Object,Object>();
                hash.put("roll", new Integer(12));
                hash.put("rollno", 13);
                hash.put(null,null);
                hash.put("name", "ashu");
                hash.put("age", 22);
                hash.put("age", 22);
                hash.put(null,null);
                //It wont allow dublicates
                
                
                System.out.println("Get Method : "+hash.get("age"));
                System.out.println();
                
                Set<Entry<Object, Object>> s = hash.entrySet();
                Iterator<Entry<Object, Object>> i = s.iterator();
                while (i.hasNext()) {
                        System.out.println(i.next());
                }
        }
}