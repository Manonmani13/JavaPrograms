package Date_time_6_11_21;

import java.util.Calendar;

public class Calender_Ex6 {
	public static void main(String[] args) {  
	      // create a new calendar  
	      Calendar cal = (Calendar) Calendar.getInstance();  
	      // print the current date and time  
	      System.out.println("" + cal.getTime());        
	// add 9 years   
	      cal.add((Calendar.YEAR), 9);  
	      // print the modified date and time  
	      System.out.println("" + cal.getTime());  
	   }  
}
/*
Sat Nov 06 18:17:42 IST 2021
Wed Nov 06 18:17:42 IST 2030
*/