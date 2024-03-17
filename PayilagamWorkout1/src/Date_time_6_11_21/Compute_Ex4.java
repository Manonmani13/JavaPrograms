package Date_time_6_11_21;
import java.util.*;
public class Compute_Ex4 extends GregorianCalendar{
	public static void main(String[] args) {  
	      // create a new calendar  
	  Compute_Ex4 cal = new Compute_Ex4();  
	 // print the current date  
	       System.out.println("The current date is : " + cal.getTime());  
	      // clear the calendar  
	      cal.clear();  
	      // set a new year and call computeFields()  
	      cal.set(GregorianCalendar.HOUR, 22);  
	      cal.set(GregorianCalendar.SECOND, 400);  
	      cal.set(GregorianCalendar.MINUTE, 70);  
	      System.out.println("New date is : " + cal.getTime());  
	      cal.computeFields();  
	      // print the current date  
	      System.out.println("New date is : " + cal.getTime());  
	   }  

}
/*
The current date is : Sat Nov 06 19:50:49 IST 2021
New date is : Thu Jan 01 23:16:40 IST 1970
New date is : Thu Jan 01 23:16:40 IST 1970

*/