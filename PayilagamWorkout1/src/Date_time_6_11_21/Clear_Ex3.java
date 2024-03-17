package Date_time_6_11_21;

import java.util.Calendar;

public class Clear_Ex3 {
	public static void main(String[] args) {  
	      // create a calendar  
	      Calendar cal = (Calendar) Calendar.getInstance();  
	      // display the current date and time  
	      System.out.println("Current Calendar Date: " + cal.getTime());       
	      // use clear method to set month as undefined.  
	      cal.clear(Calendar.DAY_OF_MONTH);  
	      // print the result  
	      System.out.println("The calendar shows : " + cal.getTime());        
	      cal.clear(Calendar.HOUR);  
	      cal.clear(Calendar.MINUTE);  
	      cal.clear(Calendar.SECOND);  
	      // print the result  
	      System.out.println("The calendar shows : " + cal.getTime());  
	   }  
}
/*
 Current Calendar Date: Sat Nov 06 18:59:37 IST 2021
The calendar shows : Sat Nov 06 18:59:37 IST 2021
The calendar shows : Sat Nov 06 18:00:00 IST 2021
 */
