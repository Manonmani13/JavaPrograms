package Date_time_6_11_21;

import java.util.Calendar;
import java.util.Date;

public class Cale_Ex16 {
	public static void main(String[] args) {  
	      // create calendar objects.  
	       Calendar cal = (Calendar) Calendar.getInstance();  
	      Calendar cal3 = (Calendar) Calendar.getInstance();  
	      // print the current date  
	      System.out.println("Current date: " + cal.getTime());  
	      // change year in future calendar  
	      cal3.set(Calendar.DAY_OF_MONTH, 23);  
	      System.out.println("Year is " + cal3.get(Calendar.DAY_OF_MONTH));  
	      // check if calendar date is after current date  
	      Date time = cal3.getTime();  
	      if (cal3.before(cal)) {  
	         System.out.println("Date " + time + " is before current date.");  
	      }     
	  }
}
/*
 Current date: Sat Nov 06 18:44:55 IST 2021
Year is 4
Date Thu May 06 18:44:56 IST 2021 is before current date.
 */
