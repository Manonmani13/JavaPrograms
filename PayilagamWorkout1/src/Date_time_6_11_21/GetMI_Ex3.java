package Date_time_6_11_21;

import java.util.Calendar;

public class GetMI_Ex3 {
	 public static void main(String[] args) {  
	      // create a calendar  
	      Calendar cal = Calendar.getInstance();  
	 // get the maximum value that year field can have  
	      int hour = cal.getActualMaximum(Calendar.HOUR);  
	      System.out.println("Maximum HOUR value:" + hour);  
	      int mnt = cal.getActualMaximum(Calendar.MINUTE);  
	      System.out.println("Maximum MINUTE value:" + mnt);  
	      int scnd = cal.getActualMaximum(Calendar.SECOND);  
	      System.out.println("Maximum SECOND value:" + scnd);  
	   }  
}
/*
Maximum HOUR value:11
Maximum MINUTE value:59
Maximum SECOND value:59
*/