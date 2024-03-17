package Date_time_6_11_21;

import java.util.Calendar;

public class GetMinu_Ex2 {
	public static void main(String[] args) {  
	      // create a calendar  
	      Calendar cal = Calendar.getInstance();  
	      // get the maximum value that year field can have  
	      int  month = cal.getActualMaximum(Calendar.MONTH);  
	      System.out.println("Maximum Month:" + month);  
	      int day = cal.getActualMaximum(Calendar.DAY_OF_MONTH);  
	      System.out.println("Maximum DAY:" + day);  
	   }  
}
/*
Maximum Month:11
Maximum DAY:30

*/