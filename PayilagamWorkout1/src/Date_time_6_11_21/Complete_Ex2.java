package Date_time_6_11_21;
import java.util.*;
public class Complete_Ex2 extends GregorianCalendar {
	public static void main(String[] args) {  
	      // create a new calendar  
	      Complete_Ex2 cal = new Complete_Ex2();  
	      // print the current date  
	      System.out.println("The current date is : " + cal.getTime());  
	      // clear the calendar  
	      cal.clear();  
	      // set a new year and call complete()  
	      cal.set(GregorianCalendar.MONTH, 10);  
	      //protected method  
	      cal.complete();  
	      // print the current date  
	      System.out.println("New Month is : " + cal.getTime());  
	   }  
}
/*
The current date is : Sat Nov 06 19:34:10 IST 2021
New Month is : Sun Nov 01 00:00:00 IST 1970
*/