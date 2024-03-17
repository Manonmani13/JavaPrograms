package Date_time_6_11_21;
import java.util.*;
public class Complete_Ex4 extends GregorianCalendar{
	public static void main(String[] args) {  
	      // create a new calendar  
	      Complete_Ex4 cal = new Complete_Ex4();  
	      // print the current date  
	      System.out.println("The current date is : " + cal.getTime());  
	      // clear the calendar  
	      cal.clear();  
	      // set a new year and call complete()  
	      cal.set(GregorianCalendar.DAY_OF_MONTH, 23);  
	      cal.set(GregorianCalendar.MONTH, 9);  
	      cal.set(GregorianCalendar.YEAR, 1996);  
	      cal.set(GregorianCalendar.HOUR, 22);  
	       cal.set(GregorianCalendar.MINUTE, 1);  
	        cal.set(GregorianCalendar.SECOND, 0);  
	      //protected method  
	      cal.complete();  
	      // print the current date  
	      System.out.println("New DATE is : " + cal.getTime());  
	   }  

}
/*
The current date is : Sat Nov 06 19:39:12 IST 2021
New DATE is : Wed Oct 23 22:01:00 IST 1996
*/