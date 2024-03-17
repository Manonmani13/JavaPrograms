package Date_time_6_11_21;

import java.util.Calendar;

public class Calender_Ex5 {
	public static void main(String[] args) {  
		   Calendar cal = Calendar.getInstance();  
		   int maximum = cal.getMinimum(Calendar.DAY_OF_WEEK);  
		   System.out.println("Minimum number of days in week: " + maximum);  
		   maximum = cal.getMinimum(Calendar.WEEK_OF_YEAR);  
		   System.out.println("Minimum number of weeks in year: " + maximum);  
		   }  
}
/*
Minimum number of days in week: 1
Minimum number of weeks in year: 1
*/