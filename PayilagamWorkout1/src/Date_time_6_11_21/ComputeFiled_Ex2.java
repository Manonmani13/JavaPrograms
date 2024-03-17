package Date_time_6_11_21;
import java.util.*;
public class ComputeFiled_Ex2 extends GregorianCalendar {
	 public static void main(String[] args) {  
	      // create a new calendar  
	      ComputeFiled_Ex2 cal = new ComputeFiled_Ex2();  
	      // print the current date  
	      System.out.println("The current date is : " + cal.getTime());  
	      // clear the calendar  
	      cal.clear();  
	      // set a new year and call computeFields()  
	      cal.set(GregorianCalendar.MONTH, 10);  
	      System.out.println("New date is : " + cal.getTime());  
	      cal.computeFields();  
	      // print the current date  
	      System.out.println("New date is : " + cal.getTime());  
	   }  
}
/*
The current date is : Sat Nov 06 19:46:00 IST 2021
New date is : Sun Nov 01 00:00:00 IST 1970
New date is : Sun Nov 01 00:00:00 IST 1970
*/