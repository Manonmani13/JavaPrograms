package Date_Time_06_11_21;

import java.util.Calendar;

public class Millis_ex1 {
	public static void main(String[] args) throws InterruptedException {  
	      // create a calendar  
	      Calendar mycal = Calendar.getInstance();  
	      // print current time in milliseconds  
	      System.out.println("Current time : " + mycal.getTime());  
	      System.out.println("Current time in Millis : " + mycal.getTimeInMillis());  
	         // create a new calendar mycal2  
	      Calendar mycal2 = Calendar.getInstance();  
	 // print the next time in milliseconds  
	      long l = mycal2.getTimeInMillis();  
	      System.out.println("Next time is : " + l);  
	}
}
/*
Current time : Sat Nov 06 23:37:41 IST 2021
Current time in Millis : 1636222061139
Next time is : 1636222061238

*/