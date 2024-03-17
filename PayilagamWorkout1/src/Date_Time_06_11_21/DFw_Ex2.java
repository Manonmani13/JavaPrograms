package Date_Time_06_11_21;

import java.util.*;

public class DFw_Ex2 {
	public static void main(String[] args) {  
		  
	      // create 2 calendar  
	      Calendar calobj = Calendar.getInstance();  
	      GregorianCalendar calobj2 =(GregorianCalendar) GregorianCalendar.getInstance();  
	       System.out.println(" Today (Calendarobject) :" + calobj.getTime());  
	       System.out.println(" Today (GregorianCalendarobject) :" + calobj.getTime());  
	       if(calobj.getMinimalDaysInFirstWeek()== calobj2.getMinimalDaysInFirstWeek())  
	               System.out.println("both the calendar object require same Minimal days  in first week  "   
	+calobj.getMinimalDaysInFirstWeek());  
	   }  
}
/*
Today (Calendarobject) :Sat Nov 06 23:26:42 IST 2021
 Today (GregorianCalendarobject) :Sat Nov 06 23:26:42 IST 2021
both the calendar object require same Minimal days  in first week  1
*/