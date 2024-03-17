package Date_time_6_11_21;
import java.util.*;
public class Complete_Ex1 extends GregorianCalendar {
	public static void main(String[] args) {  
	      // create a new calendar  
	      Complete_Ex1 cal = new Complete_Ex1();  
	      // print the current date  
	      System.out.println("The current date is : " + cal.getTime());  
	      // clear the calendar  
	      cal.clear();  
	      // set a new year and call complete()  
	      cal.set(GregorianCalendar.YEAR, 1998);  
	      //protected method  
	      cal.complete();  
	  // print the current date  
	      System.out.println("New date is : " + cal.getTime());  
	   }
}
/*
The current date is : Sat Nov 06 19:31:31 IST 2021
New date is : Thu Jan 01 00:00:00 IST 1998

*/