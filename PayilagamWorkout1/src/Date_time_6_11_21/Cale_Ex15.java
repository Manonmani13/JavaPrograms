package Date_time_6_11_21;

import java.util.Calendar;
import java.util.Date;

public class Cale_Ex15 {
	public static void main(String[] args) {    
	     // create calendar objects.  
	       Calendar cal = (Calendar) Calendar.getInstance();  
	     Calendar cal2 = (Calendar) Calendar.getInstance();  
	      // print the current date  
	      System.out.println("Current date: " + cal.getTime());  
	      // change year in future calendar  
	      cal2.set(Calendar.MONTH, 4);  
	      System.out.println("Year is " + cal2.get(Calendar.MONTH));  
	      // check if calendar date is after current date  
	      Date time = cal2.getTime();       
	      if (cal2.before(cal)) {  
	         System.out.println("Date " + time + " is before current date.");  
	      }  
	   }  
}
/*
 Current date: Sat Nov 06 18:43:01 IST 2021
Year is 4
Date Thu May 06 18:43:01 IST 2021 is before current date.

 */
