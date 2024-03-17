package Date_time_6_11_21;
import java.util.*;
public class GreatMini_Ex1 extends GregorianCalendar {
	public static void main(String[] args) {  
		  
	      // create a calendar      
	      Calendar mycal = new GregorianCalendar(1996, 10, 23);  
	        
	      System.out.println(" Date :" + mycal.getTime() );  
	  
	      // print the greatest min. for year field  
	      int outp1 = mycal.getGreatestMinimum(Calendar.YEAR);  
	      System.out.println("The minimum (Year) is: " + outp1);  
	        
	       int outp2 = mycal.getGreatestMinimum(Calendar.MONTH);  
	      System.out.println("The minimum (Month)  is: " + outp2);  
	        
	       int outp3 = mycal.getGreatestMinimum(Calendar.DAY_OF_WEEK);  
	      System.out.println("The minimum (Day) is: " + outp3);  
	   }  
}
/*
 Date :Sat Nov 23 00:00:00 IST 1996
The minimum (Year) is: 1
The minimum (Month)  is: 0
The minimum (Day) is: 1
*/