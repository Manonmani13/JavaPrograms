package Date_time_6_11_21;
import java.util.*;
public class Complete_Ex3 extends GregorianCalendar{
	   public static void main(String[] args) {  
		      // create a new calendar  
		      Complete_Ex3 cal = new Complete_Ex3();  
		      // print the current date  
		      System.out.println("The current date is : " + cal.getTime());  
		  
		      // clear the calendar  
		      cal.clear();  
		      // set a new year and call complete()  
		      cal.set(GregorianCalendar.DAY_OF_MONTH, 23);  
		      //protected method  
		      cal.complete();  
		      // print the current date  
		      System.out.println("New day is : " + cal.getTime());  
		   }  
}
/*
 The current date is : Sat Nov 06 19:37:23 IST 2021
New day is : Fri Jan 23 00:00:00 IST 1970
 */
