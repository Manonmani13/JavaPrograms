package Date_time_6_11_21;

import java.util.Calendar;

public class Equal_Ex1 {
	public static void main(String[] args) {  
	      // create a new calendar object  
	     Calendar cal1 =  (Calendar) Calendar.getInstance();  
	      // print the current date and time  
	      System.out.println("" + cal1.getTime());  
	      // create a second calendar object  
	        Calendar cal2 = (Calendar) Calendar.getInstance();  
	      // print cal2  
	      System.out.println("" + cal2.getTime());  
	      // compare the first and second calendar object  
	      System.out.println("Cal1 and Cal2 are equal:" + cal1.equals(cal2));  
	   }  
}
/*
Sat Nov 06 20:13:41 IST 2021
Sat Nov 06 20:13:41 IST 2021
Cal1 and Cal2 are equal:false
*/