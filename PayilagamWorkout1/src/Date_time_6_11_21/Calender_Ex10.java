package Date_time_6_11_21;

import java.util.Date;
import java.util.Calendar;

public class Calender_Ex10 {
	public static void main(String[] args) {     
	      // create calendar objects.  
	       Calendar cal = (Calendar) Calendar.getInstance();  
	      Calendar future = (Calendar) Calendar.getInstance();  
	      // print the current date  
	      System.out.println("Current date: " + cal.getTime());  
	      // change year in future calendar  
	      future.set(Calendar.YEAR, 2015);  
	      System.out.println("Year is " + future.get(Calendar.YEAR));  
	      // check if calendar date is after current date  
	      Date time = future.getTime();        
	      if (!future.after(cal)) {  
	         System.out.println("Date " + time + " is before current date.");  
	      }  
	   }  
}
/*
 Current date: Sat Nov 06 18:30:04 IST 2021
Year is 2015
Date Fri Nov 06 18:30:04 IST 2015 is before current date.

 */
