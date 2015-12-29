package com.collections;

import java.util.*;

public class Hashmap {
        public static void main(String[] args) {
        	  
        	HashMap hash = new HashMap();
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
                
                Set s = hash.entrySet();
                Iterator i = s.iterator();
                while (i.hasNext()) {
                        System.out.println(i.next());
                }
        }
}