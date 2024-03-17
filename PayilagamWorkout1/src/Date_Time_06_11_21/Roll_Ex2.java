package Date_Time_06_11_21;
import java.util.*;
public class Roll_Ex2 {
	public static void main(String[] args) {  
	     // create a calendar object mycalobj  
	      Calendar mycalobj = Calendar.getInstance();  
	      // displays  todays date  
	      System.out.println("Date : " + mycalobj.getTime());  
	      // roll month , year , day   
	      // here we are passing amount of time in integer form  
	      mycalobj.roll(Calendar.MONTH, 2);  
	      mycalobj.roll(Calendar.YEAR, 9);  
	      mycalobj.roll(Calendar.DAY_OF_WEEK, 3);  
	       mycalobj.roll(Calendar.HOUR, 2);  
	      mycalobj.roll(Calendar.MINUTE, 9);  
	      mycalobj.roll(Calendar.SECOND, 3);  
	       System.out.println("Date after rolling : " + mycalobj.getTime());        
	   }  
}
/*
Date : Sun Nov 07 00:16:44 IST 2021
Date after rolling : Thu Jan 10 02:25:47 IST 2030

*/