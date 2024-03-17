package Date_time_6_11_21;

import java.util.Calendar;

public class Equal_Ex4 {
	public static void main(String[] args) {  
	      // create a new calendar object  
	   Calendar cal1 =  (Calendar) Calendar.getInstance();  
	      // print the current date and time  
	      System.out.println("" + cal1.getTime());  
	      // create a clone of first calendar object  
	      Calendar cal2 = (Calendar) (Calendar) cal1.clone();  
	      // print cal2  
	      System.out.println("" + cal2.getTime());  
	      // change YEAR field of cloned calendar object  
	      cal2.add(Calendar.YEAR, 5);  
	      // compare the two calendars  
	      System.out.println("Cal1 and Cal2 are equal:" + cal1.equals(cal2));  
	   }  
}
/*
Sat Nov 06 20:16:22 IST 2021
Sat Nov 06 20:16:22 IST 2021
Cal1 and Cal2 are equal:false
*/