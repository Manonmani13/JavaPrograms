package Date_Time_06_11_21;

import java.util.*;

public class Maxi_Ex2 {
	public static void main(String[] args) {  
	      // create a calendar      
	      Calendar mycal = new GregorianCalendar(1996, 10, 23);  
	      System.out.println(" Date :" + mycal.getTime() );  
	      // print the max value for year field  
	      int outp1 = mycal.getMaximum(Calendar.YEAR);  
	      System.out.println("The  Maximum  (Year) is: " + outp1);  
	       int outp2 = mycal.getMaximum(Calendar.MONTH);  
	      System.out.println("The  Maximum  (Month)  is: " + outp2);  
	       int outp3 = mycal.getMaximum(Calendar.DAY_OF_WEEK);  
	      System.out.println("The  Maximum  (Day) is: " + outp3);  
	   }  
}
/*
 Date :Sat Nov 23 00:00:00 IST 1996
The  Maximum  (Year) is: 292278994
The  Maximum  (Month)  is: 11
The  Maximum  (Day) is: 7

*/