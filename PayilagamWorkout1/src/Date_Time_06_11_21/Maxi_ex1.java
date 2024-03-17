package Date_Time_06_11_21;

import java.util.*;

public class Maxi_ex1 {
	public static void main(String[] args) {  
	      // create a calendar      
	      Calendar mycal = new GregorianCalendar(1996, 10, 23);  
	      System.out.println(" Date :" + mycal.getTime() );  
	      // print the greatest min. for year field  
	      int outp1 = mycal.getLeastMaximum(Calendar.YEAR);  
	      System.out.println("The Least Maximum  (Year) is: " + outp1);  
	       int outp2 = mycal.getLeastMaximum(Calendar.MONTH);  
	      System.out.println("The Least Maximum  (Month)  is: " + outp2);  
	       int outp3 = mycal.getLeastMaximum(Calendar.DAY_OF_WEEK);  
	      System.out.println("The Least Maximum  (Day) is: " + outp3);  

}
}
/*
 Date :Sat Nov 23 00:00:00 IST 1996
The Least Maximum  (Year) is: 292269054
The Least Maximum  (Month)  is: 11
The Least Maximum  (Day) is: 7

*/