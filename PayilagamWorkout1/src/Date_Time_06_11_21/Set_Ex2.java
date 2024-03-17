package Date_Time_06_11_21;
import java.util.*;
public class Set_Ex2 {
	public static void main(String[] args) {  
	      // create a calendar object calobj  
	      Calendar calobj = Calendar.getInstance();  
	      // display the current date  
	      System.out.println(" Today " + calobj.getTime());  
	      // determine if the given calendar field has a value set  
	      boolean b = calobj.isSet(Calendar.YEAR);  
	      System.out.println("Year is set: " + b);  
	       boolean M = calobj.isSet(Calendar.MONTH);  
	      System.out.println("Month is set: " + M);  
	       boolean d = calobj.isSet(Calendar.DAY_OF_WEEK);  
	      System.out.println("Day of week is set: " + d);  
	      calobj.clear();  
	      // determine if the given calendar field has a value set  
	      System.out.println("After clearing calendar");  
	      b = calobj.isSet(Calendar.YEAR);  
	      System.out.println("Year is set: " + b);  
	      M = calobj.isSet(Calendar.MONTH);  
	      System.out.println("Month is set: " + M);  
	     d = calobj.isSet(Calendar.DAY_OF_WEEK);  
	      System.out.println("Day of week is set: " + d);  
	   }  
}
/*
 Today Sun Nov 07 00:05:00 IST 2021
Year is set: true
Month is set: true
Day of week is set: true
After clearing calendar
Year is set: false
Month is set: false
Day of week is set: false

*/