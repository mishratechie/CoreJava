package com.StringBufferBuilder;


public class Stringbuf{

    public static void main(String args[]){
       StringBuffer sBuffer = new StringBuffer("test");
       StringBuffer sBuffer2 = new StringBuffer("test");
       String ss1="test";
       
       System.out.println(sBuffer==sBuffer2);
       System.out.println(sBuffer.equals(sBuffer2));
       System.out.println(sBuffer.equals(ss1));
       System.out.println("Poddar".substring(3));
       
       
       
       String s="he";
       s.charAt(0);
       //sBuffer.append(" String Buffer");
      // System.out.println(sBuffer);  
       
       
   }
}