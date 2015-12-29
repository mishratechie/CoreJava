package com.ashu;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class NoticePeriod {

	
	public static void main(String[] args) {
		
		
		DateFormat dateFormat = new SimpleDateFormat("dd - MMM");
		Date date = new Date();
		System.out.println("My current Date is "+dateFormat.format(date));
		//For August i=currentDate j=notice period
		int i,j,k,p,q,r;
		for(i=14,j=8;i<=31 & j<=i;i++,j++){
			System.out.println("Date :"+i+" Aug "+" Notice period count "+j);
			System.out.println();
		}
		
		System.out.println("final value of j is "+j);
		System.out.println();
		//For Sept k=currentDate p=Notice period date
		for(k=1,p=j; k<=30 & p<=90; k++,p++)
		{
			System.out.println("Date :"+k+" Sept "+" Notice period day "+p);
			System.out.println();
		}
		
		for(q=1,r=p; q<=31 & r<=90; q++,r++)
		{
			System.out.println("Date :"+q+" oct "+" Notice period day "+r);
			System.out.println();
		}
		
	}
}
