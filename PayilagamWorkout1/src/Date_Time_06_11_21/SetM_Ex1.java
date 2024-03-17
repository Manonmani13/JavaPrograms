package Date_Time_06_11_21;
import java.util.*;
public class SetM_Ex1 {
	public static void main(String[] args) {  
	      // create a calendar object mycalobj  
	      Calendar mycalobj =  Calendar.getInstance();  
	      System.out.println("Today  :" + mycalobj.getTime());  
	      System.out.println("Year  :" + mycalobj.get(Calendar.YEAR));  
	      System.out.println("Month :" + mycalobj.get(Calendar.MONTH));  
	      System.out.println("Day  :" + mycalobj.get(Calendar.DAY_OF_WEEK));  
	      // set the year,month and day   
	      mycalobj.set(1996, 5, 23, 10, 15, 20);  
	      System.out.println("Now Today  :" + mycalobj.getTime());  
	      System.out.println(" Now Year  :" + mycalobj.get(Calendar.YEAR));  
	      System.out.println("Now Month :" + mycalobj.get(Calendar.MONTH));  
	      System.out.println("Now Day  :" + mycalobj.get(Calendar.DAY_OF_WEEK));  
	   }  

}
/*
Today  :Sun Nov 07 00:18:35 IST 2021
Year  :2021
Month :10
Day  :1
Now Today  :Sun Jun 23 10:15:20 IST 1996
 Now Year  :1996
Now Month :5
Now Day  :1
*/