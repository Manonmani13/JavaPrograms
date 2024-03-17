package Date_Time_06_11_21;
import java.util.*;
import java.util.GregorianCalendar;  
public class InternalGet_Ex1 extends GregorianCalendar {
	public static void main(String[] args) {  
	      // create a new calendar object  
	     InternalGet_Ex1 mycal = new InternalGet_Ex1();  
	      // print the current date  
	      System.out.println("The current date is : " + mycal.getTime());  
	      // use internal get to get the year  
	      System.out.println("Year  : " + mycal.internalGet(YEAR));  
	      // use internal get to get the month  
	      System.out.println("Month  : " + mycal.internalGet(MONTH));  
	      // use internal get to get the month  
	      System.out.println("Day : " + mycal.internalGet(DAY_OF_WEEK));  
	      System.out.println(" Year   " + mycal.internalGet(YEAR)  + " Month  " +   
	      mycal.internalGet(DAY_OF_WEEK)+" Day  "+ mycal.internalGet(DAY_OF_WEEK) );  
	   }  
}
/*
The current date is : Sat Nov 06 23:55:33 IST 2021
Year  : 2021
Month  : 10
Day : 7
 Year   2021 Month  7 Day  7

*/