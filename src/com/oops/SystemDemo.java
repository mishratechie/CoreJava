package com.oops;

import java.util.Properties;

public class SystemDemo {

   public static void main(String[] args) {

   // this will list the current system properties
   Properties p = System.getProperties();
   p.list(System.out);
      
   
   }
} 