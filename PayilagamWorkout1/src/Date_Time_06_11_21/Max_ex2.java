package Date_Time_06_11_21;

import java.util.Calendar;

public class Max_ex2 {
	public static void main(String[] args) {  
	      // create a calendar      
	      Calendar mycal = Calendar.getInstance();     
	      System.out.println(" Date :" + mycal.getTime() );  
	      int outp1 = mycal.getLeastMaximum(Calendar.YEAR);  
	      System.out.println("The Least Maximum (Year) is: " + outp1);  
	       int outp2 = mycal.getLeastMaximum(Calendar.MONTH);  
	      System.out.println("The Least Maximum (Month)  is: " + outp2);  
	       int outp3 = mycal.getLeastMaximum(Calendar.DAY_OF_WEEK);  
	      System.out.println("The Least Maximum (Day) is: " + outp3);  
	      mycal.add(Calendar.YEAR, 2020);  
	       mycal.add(Calendar.MONTH, 9);  
	        mycal.add(Calendar.DAY_OF_WEEK, 23);  
	         System.out.println(" Date :" + mycal.getTime() );  
	      int outp11 = mycal.getLeastMaximum(Calendar.YEAR);  
	      System.out.println("The Least Maximum (Year) is: " + outp11);  
	       int outp21 = mycal.getLeastMaximum(Calendar.MONTH);  
	      System.out.println("The Least Maximum (Month)  is: " + outp21);  
	       int outp31 = mycal.getLeastMaximum(Calendar.DAY_OF_WEEK);  
	      System.out.println("The Least Maximum (Day) is: " + outp31);  
	   }  
}
/*
 Date :Sat Nov 06 23:16:17 IST 2021
The Least Maximum (Year) is: 292269054
The Least Maximum (Month)  is: 11
The Least Maximum (Day) is: 7
 Date :Fri Aug 29 23:16:17 IST 4042
The Least Maximum (Year) is: 292269054
The Least Maximum (Month)  is: 11
The Least Maximum (Day) is: 7
*/
