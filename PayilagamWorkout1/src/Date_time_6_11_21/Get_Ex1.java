package Date_time_6_11_21;

import java.util.Calendar;

public class Get_Ex1 {
	public static void main(String[] args) {  
	    // creating a calendar named  as cal1  
	    Calendar cal1 = Calendar.getInstance();  
	    //  DATE field is passed as parameter to get method  
	    System.out.println("Day of month is: " +  
	                        cal1.get(Calendar.DATE));  
	    //  MONTH field DATE field is passed as parameter to get method  
	    System.out.println("Month of year is: " +  
	                        cal1.get(Calendar.MONTH));  
	    //  YEAR field DATE field is passed as parameter to get method  
	    System.out.println("and year is : " +   
	                        cal1.get(Calendar.YEAR));  
	    System.out.println("Today is "+cal1.get(Calendar.DATE) + " Day  of " + cal1.get(Calendar.MONTH)  
	    + " Month  of  the year " + cal1.get(Calendar.YEAR) );  
	}  
}
/*
Day of month is: 6
Month of year is: 10
and year is : 2021
Today is 6 Day  of 10 Month  of  the year 2021

*/