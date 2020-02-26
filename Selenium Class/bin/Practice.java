package com.selenium.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) throws Throwable {

		/*8. A time input is received as stirng.
		 * Find if the hour format is in 12 hour format.
		 * the suffix am/pm is case insensitive.
		input:"09:36 am"
		output:true*/
		
		 LocalTime time = LocalTime.now();
	        // Pattern 
	        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("hh:mm:ss a");
	        System.out.println("Time in 12 Hour format - " + time.format(pattern));
	    }
		
		
		
		
		
		
		
		
		
		/*		7. Two dates are given as input in "yyyy-MM-dd" format.
		 * Find the number of months between the two dates
			input1:"2012-12-01"
			input2:"2012-01-03"
			output:11
		 * 
		 
		
		String date1,date2;
		int result;
		
		
		 DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		

  		 LocalDate d1= LocalDate.of(2012,01,01);
		 System.out.println("Input1: "+d1);
		 
		 LocalDate d2= LocalDate.of(2012,12,03);
		 System.out.println("Input2: "+d2);

		 Period diff=Period.between(d1,d2);
		 result=diff.getMonths();
		 System.out.println("OutPut: "+result);
		
*/		
		
		/*For Practice of Date Format
		 * 
		  Date todaysDate = new Date();
	       DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	       DateFormat df2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	       DateFormat df3 = new SimpleDateFormat("dd-MMM-yyyy");
	       DateFormat df4 = new SimpleDateFormat("MM dd, yyyy");
	       DateFormat df5 = new SimpleDateFormat("E, MMM dd yyyy");
	       DateFormat df6 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
	       try
	       {
	           //format() method Formats a Date into a date/time string. 
	           String testDateString = df.format(todaysDate);
	           System.out.println("String in dd/MM/yyyy format is: " + testDateString);
	           String str2 = df2.format(todaysDate);
	           System.out.println("String in dd-MM-yyyy HH:mm:ss format is: " + str2);
	           String str3 = df3.format(todaysDate);
	           System.out.println("String in dd-MMM-yyyy format is: " + str3);
	           String str4 = df4.format(todaysDate);
	           System.out.println("String in MM dd, yyyy format is: " + str4);
	           String str5 = df5.format(todaysDate);
	           System.out.println("String in E, MMM dd yyyy format is: " + str5);
	           String str6 = df6.format(todaysDate);
	           System.out.println("String in E, E, MMM dd yyyy HH:mm:ss format is: " + str6);

	       }
	       catch (Exception ex ){
	          System.out.println(ex);
	       }
*/	}
	

