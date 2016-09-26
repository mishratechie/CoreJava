package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Ashutosh on 9/10/2016.
 */
public class PrintHashMap {

    public static void main(String[] args) {

        HashMap<String,Integer> hashmap=new HashMap();
        hashmap.put("Apple",1);
        hashmap.put("Banana",1);
        hashmap.put("Watermelon",1);
        hashmap.put("CustardApple",1);
        hashmap.put("Grapes",1);
        hashmap.put("Grapes",1);


        Set<Map.Entry<String,Integer>> set=hashmap.entrySet();

        //Print#1
        Iterator<Map.Entry<String,Integer>> itr=set.iterator();
        while(itr.hasNext()){

            System.out.println(itr.next());
        }

        //Print#2
        for(Map.Entry<String,Integer> m :set){

            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }


        //Print#3
        Set<String> myKeys=hashmap.keySet();
        for(String key :myKeys){

            System.out.println("Key "+key);
            System.out.println("Value "+hashmap.get(key));

        }







    }
}
