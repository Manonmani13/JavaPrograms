package Date_time_6_11_21;

import java.util.Calendar;

public class Clear_Ex4 {
	public static void main(String[] args) {  
	      // create a calendar  
	      Calendar cal = (Calendar) Calendar.getInstance();  
	     // display the current date and time  
	      System.out.println("Current Calendar Date: " + cal.getTime());       
	      cal.clear(Calendar.HOUR);  
	      cal.clear(Calendar.MINUTE);  
	      cal.clear(Calendar.SECOND);  
	      // print the result  
	      System.out.println("The calendar shows : " + cal.getTime());  
	   }  
}
/*
Current Calendar Date: Sat Nov 06 19:01:02 IST 2021
The calendar shows : Sat Nov 06 19:00:00 IST 2021

*/