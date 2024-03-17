package Date_Time_06_11_21;
import java.util.*;
public class SetM_Ex2 {
	 public static void main(String[] args) {  
	      // create a calendar object mycalobj  
	      Calendar mycalobj =  Calendar.getInstance();  
	      System.out.println("Today  :" + mycalobj.getTime());  
	      mycalobj.set(Calendar.YEAR , 1996);  
	      System.out.println(" Altered Date(1) :" + mycalobj.getTime());  
	       mycalobj.set  (1996 , 9 , 23);  
	       System.out.println(" Altered Date (2) :" + mycalobj.getTime());  
	     }  
}
/*
Today  :Sun Nov 07 00:19:42 IST 2021
 Altered Date(1) :Thu Nov 07 00:19:42 IST 1996
 Altered Date (2) :Wed Oct 23 00:19:42 IST 1996

*/