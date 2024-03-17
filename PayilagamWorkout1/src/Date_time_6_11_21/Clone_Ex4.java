package Date_time_6_11_21;

import java.util.Calendar;

public class Clone_Ex4 {
	public static void main(String[] args) {  
	      // create a new calendar  
	     Calendar cal = (Calendar) Calendar.getInstance();  
	      // print the current date and time  
	      System.out.println("" + cal.getTime());  
	      cal.add((Calendar.MONTH), 2);  
	      cal.add((Calendar.YEAR), 4);  
	      cal.add((Calendar.DAY_OF_MONTH), 24);  
	      cal.add((Calendar.HOUR), 5);  
	      cal.add((Calendar.MINUTE), 60);  
	      cal.add((Calendar.SECOND), 360);  
	Calendar cal2 = (Calendar) cal.clone();  
	      // display the copy  
	      System.out.println("Cloned calendar object : " + cal2.getTime());  
	}  
}
/*
 Sat Nov 06 19:12:55 IST 2021
Cloned calendar object : Sat Jan 31 01:18:55 IST 2026

 */
