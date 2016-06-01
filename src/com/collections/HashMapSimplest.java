package com.collections;

import java.util.*;  
class HashMapSimplest{  
 public static void main(String args[]){  
   
  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
  
  hm.put(100,"Pattrick");  
  hm.put(101,"Jesse");  
  hm.put(102,"Kurt");  
  
  for(Map.Entry m:hm.entrySet()){ 
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  
