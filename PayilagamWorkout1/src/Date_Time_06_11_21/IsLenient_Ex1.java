package Date_Time_06_11_21;
import java.util.*;
public class IsLenient_Ex1 {
	public static void main(String[] args) {  
	      // create a calendar  
	      Calendar mycal = Calendar.getInstance();  
	      // displays the current calendar  
	      System.out.println("Current Date and Time is " + mycal.getTime());  
	      boolean b = mycal.isLenient();  
	      System.out.println("Interpretation is lenient: " + b);  
	      mycal.set(Calendar.YEAR, 1996);  
	       mycal.set(Calendar.MONTH, 10);  
	        mycal.set(Calendar.DAY_OF_WEEK,23);  
	        System.out.println("NOW Date and Time is " + mycal.getTime());  
	      // check if date/time interpretation is lenient.  
	      boolean C = mycal.isLenient();  
	      System.out.println("Interpretation is lenient: " + C);  
	   }  

}/*
Current Date and Time is Sun Nov 07 00:00:51 IST 2021
Interpretation is lenient: true
NOW Date and Time is Mon Nov 04 00:00:51 IST 1996
Interpretation is lenient: true
*/
