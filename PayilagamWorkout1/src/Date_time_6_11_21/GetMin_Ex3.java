package Date_time_6_11_21;

import java.util.Calendar;

public class GetMin_Ex3 {
	public static void main(String[] args) {  
	      // create a calendar  
	      Calendar cal = Calendar.getInstance();  
	      // get minimum value of passed fields and stores in corresponding parameter.  
	      int day1 = cal.getActualMinimum(Calendar.DAY_OF_WEEK_IN_MONTH);  
	      System.out.println("Minimum  value for DAY_OF_WEEK_IN_MONTH  is :" + day1);  
	      int day2 = cal.getActualMinimum(Calendar.DAY_OF_MONTH);  
	        System.out.println("Minimum  value for DAY_OF_MONTH is :" + day2);  
	        int dt = cal.getActualMinimum(Calendar.DATE);  
	        System.out.println("Minimum value for  DATE is :" + dt);  
	   }  
}
/*
Minimum  value for DAY_OF_WEEK_IN_MONTH  is :1
Minimum  value for DAY_OF_MONTH is :1
Minimum value for  DATE is :1
*/