package com.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;
class DateTimeFormatDemo
{
   public static void main(String[] args)
   {
      String input = "Wed 08/05/2015__ 8:25:10.22";
      //Format of the date defined in the input String
      DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy__ hh:mm:ss.SS");
      //Desired format: 24 hour format: Change the pattern as per the need
      DateFormat outputformat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
      Date date = null;
      String output = null;
      try{
         //Converting the input String to Date
    	 date= df.parse(input);
         //Changing the format of date and storing it in String
    	 output = outputformat.format(date);
         //Displaying the date
    	 System.out.println(output);
      }catch(ParseException pe){
         pe.printStackTrace();
       }
   }
}