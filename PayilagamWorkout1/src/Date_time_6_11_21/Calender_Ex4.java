package Date_time_6_11_21;

import java.util.Calendar;

public class Calender_Ex4 {
	 public static void main(String[] args) {  
		   Calendar calendar = Calendar.getInstance();  
		   int maximum = calendar.getMaximum(Calendar.DAY_OF_WEEK);  
		   System.out.println("Maximum number of days in week: " + maximum);  
		   maximum = calendar.getMaximum(Calendar.WEEK_OF_YEAR);  
		   System.out.println("Maximum number of weeks in year: " + maximum);  
		   }  
}
/*
Maximum number of days in week: 7
Maximum number of weeks in year: 53
*/