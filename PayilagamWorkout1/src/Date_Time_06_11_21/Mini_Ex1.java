package Date_Time_06_11_21;

import java.util.Calendar;

public class Mini_Ex1 {
	public static void main(String[] args) {  
		// create a calendar      
		 Calendar mycal = Calendar.getInstance();  
		      System.out.println(" Date :" + mycal.getTime() );  
		      int outp1 = mycal.getMinimum(Calendar.YEAR);  
		      System.out.println("The  Minimum (Year) is: " + outp1);  
		       int outp2 = mycal.getMinimum(Calendar.MONTH);  
		      System.out.println("The  Minimum (Month)  is: " + outp2);  
		       int outp3 = mycal.getMinimum(Calendar.DAY_OF_WEEK);  
		      System.out.println("The  Minimum (Day) is: " + outp3);  
		      mycal.add(Calendar.YEAR, 2020);  
		       mycal.add(Calendar.MONTH, 9);  
		        mycal.add(Calendar.DAY_OF_WEEK, 23);  
		         System.out.println(" Date :" + mycal.getTime() );  
		      int outp11 = mycal.getMinimum(Calendar.YEAR);  
		      System.out.println("The  Minimum (Year) is: " + outp11);  
		       int outp21 = mycal.getMinimum(Calendar.MONTH);  
		      System.out.println("The  Minimum (Month)  is: " + outp21);  
		       int outp31 = mycal.getMinimum(Calendar.DAY_OF_WEEK);  
		      System.out.println("The  Minimum (Day) is: " + outp31);  
		   }  
}
/*
 Date :Sat Nov 06 23:32:13 IST 2021
The  Minimum (Year) is: 1
The  Minimum (Month)  is: 0
The  Minimum (Day) is: 1
 Date :Fri Aug 29 23:32:13 IST 4042
The  Minimum (Year) is: 1
The  Minimum (Month)  is: 0
The  Minimum (Day) is: 1
*/