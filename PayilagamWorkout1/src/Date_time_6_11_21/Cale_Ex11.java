package Date_time_6_11_21;

import java.util.Date;
import java.util.Calendar;

public class Cale_Ex11 {
	public static void main(String[] args) {     
	      // create calendar objects.  
	       Calendar cal = (Calendar) Calendar.getInstance();  
	      Calendar cal2 = (Calendar) Calendar.getInstance();  
	      // print the current date  
	      System.out.println("Current date: " + cal.getTime());  
	      // change year in future calendar  
	      cal2.set(Calendar.MONTH, 10);  
	      System.out.println("Year is " + cal2.get(Calendar.MONTH));  
	      // check if calendar date is after current date  
	      Date time = cal2.getTime();       
	      if (cal2.after(cal)) {  
	         System.out.println("Date " + time + " is after current date.");  
	      }  
	   }  
}
/*
 Current date: Sat Nov 06 18:32:35 IST 2021
Year is 10
Date Sat Nov 06 18:32:35 IST 2021 is after current date.
 */
