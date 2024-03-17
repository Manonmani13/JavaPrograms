package Date_time_6_11_21;

import java.util.Calendar;

public class GreatMini_Ex2 {
	public static void main(String[] args) {  
		  
	      // create a calendar      
	      Calendar mycal = Calendar.getInstance();  
	        
	      System.out.println(" Date :" + mycal.getTime() );  
	        
	      int outp1 = mycal.getGreatestMinimum(Calendar.YEAR);  
	      System.out.println("The minimum (Year) is: " + outp1);  
	        
	       int outp2 = mycal.getGreatestMinimum(Calendar.MONTH);  
	      System.out.println("The minimum (Month)  is: " + outp2);  
	        
	       int outp3 = mycal.getGreatestMinimum(Calendar.DAY_OF_WEEK);  
	      System.out.println("The minimum (Day) is: " + outp3);  
	  
	        
	      mycal.add(Calendar.YEAR, 2020);  
	       mycal.add(Calendar.MONTH, 9);  
	        mycal.add(Calendar.DAY_OF_WEEK, 23);  
	        
	         System.out.println(" Date :" + mycal.getTime() );  
	      int outp11 = mycal.getGreatestMinimum(Calendar.YEAR);  
	      System.out.println("The minimum (Year) is: " + outp11);  
	        
	       int outp21 = mycal.getGreatestMinimum(Calendar.MONTH);  
	      System.out.println("The minimum (Month)  is: " + outp21);  
	        
	       int outp31 = mycal.getGreatestMinimum(Calendar.DAY_OF_WEEK);  
	      System.out.println("The minimum (Day) is: " + outp31);  
	   }  
}
/*
The minimum (Day) is: 1
 Date :Fri Aug 29 21:07:12 IST 4042
The minimum (Year) is: 1
The minimum (Month)  is: 0
The minimum (Day) is: 1

*/