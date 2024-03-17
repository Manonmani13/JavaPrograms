package Date_Time_06_11_21;
import java.util.*;
public class Roll_Ex1 {
	public static void main(String[] args) {  
	      // create a calendar object mycalobj  
	      Calendar mycalobj = Calendar.getInstance();  
	      // displays  todays date  
	      System.out.println("Date : " + mycalobj.getTime());  
	      // roll month , year , day   
	      mycalobj.roll(Calendar.MONTH, true);  
	      mycalobj.roll(Calendar.YEAR, true);  
	      mycalobj.roll(Calendar.DAY_OF_WEEK, true);  
	       System.out.println("Date after rolling : " + mycalobj.getTime());  
	    }  
}
/*
Date : Sun Nov 07 00:15:32 IST 2021
Date after rolling : Thu Dec 08 00:15:32 IST 2022

*/