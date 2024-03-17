package Date_time_6_11_21;

import java.util.Calendar;

public class Calender_Ex9 {
	public static void main(String[] args){  
	       // create a new calendar  
	     Calendar cal = (Calendar) Calendar.getInstance();  
	        // print the current date and time  
	      System.out.println("" + cal.getTime());  
	        int weekday = cal.get(Calendar.DAY_OF_WEEK);  
	        cal.add(Calendar.HOUR, 10);  
	        // print the modified date and time  
	      System.out.println("" + cal.getTime());       
	      cal.add(Calendar.MINUTE, 10);       
	     System.out.println("" + cal.getTime());  
	       cal.add(Calendar.SECOND, 10);        
	      System.out.println("" + cal.getTime());         

}
}
/*
Sat Nov 06 18:25:04 IST 2021
Sun Nov 07 04:25:04 IST 2021
Sun Nov 07 04:35:04 IST 2021
Sun Nov 07 04:35:14 IST 2021
*/