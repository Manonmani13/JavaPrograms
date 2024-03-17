package Date_time_6_11_21;

import java.util.Calendar;

public class Clear_Ex1 {
	public static void main(String[] args) {  
	      // create a calendar  
	       Calendar cal = (Calendar) Calendar.getInstance();  
	      // display the current date and time  
	      System.out.println("Current Calendar Date: " + cal.getTime());  
	      // use clear method to set year as undefined.  
	       cal.clear(Calendar.MONTH);  
	      // print the result  
	     System.out.println("The calendar shows : " + cal.getTime());        
	   }  
}
/*
Current Calendar Date: Sat Nov 06 18:55:11 IST 2021
The calendar shows : Wed Jan 06 18:55:11 IST 2021
*/