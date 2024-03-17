package Date_Time_06_11_21;
import java.util.*;
public class TID_Ex1 {
	  public static void main(String[] args) throws InterruptedException {  
	      // create a calendar  
	      Calendar mycal = Calendar.getInstance();  
	      Calendar mycal2 = Calendar.getInstance();  
	  
	      // print current time in milliseconds  
	      System.out.println("Current time (mycal) : " + mycal.getTime());  
	       System.out.println("Current time in Millis (mycal) : " + mycal.getTimeInMillis());  
	      mycal2.setTimeInMillis(mycal.getTimeInMillis());  
	      System.out.println("Current time (mycal2) : " + mycal2.getTime());  
	       System.out.println("Current time in Millis (mycal2) : " + mycal2.getTimeInMillis());  
	   }
}
/*
Current time (mycal) : Sun Nov 07 00:34:27 IST 2021
Current time in Millis (mycal) : 1636225467025
Current time (mycal2) : Sun Nov 07 00:34:27 IST 2021
Current time in Millis (mycal2) : 1636225467025

*/