package Date_Time_06_11_21;

import java.util.Calendar;

public class Maxim_ex1 {
	public static void main(String[] args) {  
	      // create a calendar      
	      Calendar mycal = Calendar.getInstance();  
	      System.out.println(" Date :" + mycal.getTime() );  
	      // print the max value for year field  
	      int outp1 = mycal.getMaximum(Calendar.YEAR);  
	      System.out.println("The  Maximum (Year) is: " + outp1);  
	       int outp2 = mycal.getMaximum(Calendar.MONTH);  
	      System.out.println("The  Maximum (Month)  is: " + outp2);  
	       int outp3 = mycal.getLeastMaximum(Calendar.DAY_OF_WEEK);  
	      System.out.println("The  Maximum (Day) is: " + outp3);  
	      mycal.add(Calendar.YEAR, 2020);  
	       mycal.add(Calendar.MONTH, 9);  
	        mycal.add(Calendar.DAY_OF_WEEK, 23);  
	         System.out.println(" Date :" + mycal.getTime() );  
	      int outp11 = mycal.getMaximum(Calendar.YEAR);  
	      System.out.println("The  Maximum (Year) is: " + outp11);  
	       int outp21 = mycal.getMaximum(Calendar.MONTH);  
	      System.out.println("The  Maximum (Month)  is: " + outp21);  
	       int outp31 = mycal.getMaximum(Calendar.DAY_OF_WEEK);  
	      System.out.println("The  Maximum (Day) is: " + outp31);  
	   }  
}
/*
 *  Date :Sat Nov 06 23:19:20 IST 2021
The  Maximum (Year) is: 292278994
The  Maximum (Month)  is: 11
The  Maximum (Day) is: 7
 Date :Fri Aug 29 23:19:20 IST 4042
The  Maximum (Year) is: 292278994
The  Maximum (Month)  is: 11
The  Maximum (Day) is: 7
 */