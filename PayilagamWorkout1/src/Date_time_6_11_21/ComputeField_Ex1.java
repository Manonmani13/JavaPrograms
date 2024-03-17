package Date_time_6_11_21;
import java.util.*;
public class ComputeField_Ex1 extends GregorianCalendar{
	public static void main(String[] args) {  
	     // create a new calendar  
	      ComputeField_Ex1 cal = new ComputeField_Ex1();  
	     // print the current date  
	      System.out.println("The current date is : " + cal.getTime());  
	      // clear the calendar  
	      cal.clear();  
	      // set a new year and call computeFields()  
	      cal.set(GregorianCalendar.YEAR, 3018);  
	      System.out.println("New date is : " + cal.getTime());  
	      cal.computeFields();  
	      // print the current date  
	      System.out.println("New date is : " + cal.getTime());  
	   }  
}
/*
The current date is : Sat Nov 06 19:42:08 IST 2021
New date is : Thu Jan 01 00:00:00 IST 3018
New date is : Thu Jan 01 00:00:00 IST 3018
*/