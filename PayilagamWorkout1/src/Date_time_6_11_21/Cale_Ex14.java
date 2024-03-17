package Date_time_6_11_21;

import java.util.Calendar;
import java.util.Date;

public class Cale_Ex14 {
	public static void main(String[] args) {  
		   // create calendar objects.  
		       Calendar cal = (Calendar) Calendar.getInstance();  
		      Calendar past = (Calendar) Calendar.getInstance();  
		      // print the current date  
		      System.out.println("Current date: " + cal.getTime());  
		      // change year in future calendar  
		      past.set(Calendar.YEAR, 2015);  
		      System.out.println("Year is " + past.get(Calendar.YEAR));  
		      // check if calendar date is after current date  
		      Date time = past.getTime();  
		           if (past.before(cal)) {  
		         System.out.println("Date " + time + " is before current date.");  
		      }  
		   }  
}
/*
Current date: Sat Nov 06 18:40:58 IST 2021
Year is 2015
Date Fri Nov 06 18:40:58 IST 2015 is before current date.

*/