package Date_time_6_11_21;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class getMininum_Ex1 {
	public static void main(String[] args) {  
	      // create a calendar  
	      Calendar cal1 = Calendar.getInstance();  
	     GregorianCalendar cal2 = (GregorianCalendar) GregorianCalendar.getInstance();  
	      // get the maximum value that year field can have  
	      int year = cal1.getActualMaximum(Calendar.YEAR);  
	      int year2 = cal2.getActualMaximum(GregorianCalendar.YEAR);  
	      System.out.println("Maximum year value of Calendar is:" + year);  
	System.out.println("Maximum year value of Gregorian Calendar is :" + year2);     
	   }  
}
/*
Maximum year value of Calendar is:292278993
Maximum year value of Gregorian Calendar is :292278993
*/