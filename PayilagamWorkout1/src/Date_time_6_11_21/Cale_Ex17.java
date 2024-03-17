package Date_time_6_11_21;

import java.util.Calendar;
import java.util.Date;

public class Cale_Ex17 {
	public static void main(String[] args) {     
	      // create calendar objects.  
	       Calendar cal = (Calendar) Calendar.getInstance();  
	      Calendar cal3 = (Calendar) Calendar.getInstance();  
	      // print the current date  
	      System.out.println("Current date: " + cal.getTime());  
	      // change year in future calendar  
	      cal3.set(Calendar.HOUR, 30);  
	      System.out.println("Now date is  " + cal3.getTime());  
	       cal3.set(Calendar.MINUTE, 60);  
	      System.out.println("Now date is  " + cal3.getTime());    
	       cal3.set(Calendar.SECOND, 30);  
	      System.out.println("Now date is  " + cal3.getTime());      
	      // check if calendar date is after current date  
	      Date time = cal3.getTime();       
	      if (cal3.before(cal)) {  
	         System.out.println("Date " + time + " is after current date.");  
	      }  
	}  
}
/*
Current date: Sat Nov 06 18:47:06 IST 2021
Now date is  Sun Nov 07 18:47:06 IST 2021
Now date is  Sun Nov 07 19:00:06 IST 2021
Now date is  Sun Nov 07 19:00:30 IST 2021
*/