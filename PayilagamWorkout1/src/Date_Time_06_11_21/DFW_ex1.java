package Date_Time_06_11_21;

import java.util.Calendar;

public class DFW_ex1 {
	public static void main(String[] args) {  
	      // create a calendar  
	      Calendar calobj = Calendar.getInstance();  
	      calobj.set(Calendar.YEAR, 1996);  
	      calobj.set(Calendar.MONTH , 9);  
	      calobj.set(Calendar.DAY_OF_MONTH , 23);  
	       System.out.println(" Today is :" + calobj.getTime());  
	      int day  = calobj.getMinimalDaysInFirstWeek();  
	      // print the result  
	      System.out.println("Minimal days  in first week required :" + day);  
	   }  
}
/*
  Today is :Wed Oct 23 23:23:32 IST 1996
Minimal days  in first week required :1

*/