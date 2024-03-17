package Date_Time_06_11_21;
import java.util.*;
public class ToInstant_Ex2 {
	public static void main(String[] args) {  
		  // create a new calendar  
		     Calendar cal = (Calendar) Calendar.getInstance();  
		      // print the current date and time  
		      System.out.println("  cal " + cal.getTime());  
		      // add 4 MONTHS  
		      cal.add((Calendar.MONTH), 2);  
		      cal.add((Calendar.YEAR), 4);  
		      cal.add((Calendar.DAY_OF_MONTH), 24);  
		      cal.add((Calendar.HOUR), 5);  
		      cal.add((Calendar.MINUTE), 60);  
		      cal.add((Calendar.SECOND), 360);  
		      System.out.println("cal.toInstant() : " + cal.toInstant());  
		      }  
}
/*
cal Sun Nov 07 00:41:42 IST 2021
cal.toInstant() : 2026-01-31T01:17:42.123Z

*/