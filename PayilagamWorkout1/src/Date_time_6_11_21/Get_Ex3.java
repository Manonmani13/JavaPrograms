package Date_time_6_11_21;

import java.util.Calendar;

public class Get_Ex3 {
	public static void main(String[] args) {  
	    // creating a calendar  
	    Calendar cal1 = Calendar.getInstance();  
	    // Print the value of Calendar   
	    System.out.println("Date when objectt is created : " + cal1.getTime());  
	    cal1.add((Calendar.MONTH), 10);  
	    cal1.add((Calendar.YEAR), 2017);  
	      cal1.add((Calendar.DAY_OF_MONTH), 23);  
	 System.out.println("date after using add method : " + cal1.getTime());       
	      System.out.println("HOUR : " +  
	                        cal1.get(Calendar.HOUR));  
	    // print the value of MONTH field  
	    System.out.println("MINUTE : " +  
	                        cal1.get(Calendar.MINUTE));  
	    // print the value of YEAR field  
	    System.out.println("SECOND : " +   
	                        cal1.get(Calendar.SECOND));  
	}  
}
/*
Date when objectt is created : Sat Nov 06 20:21:38 IST 2021
date after using add method : Thu Sep 29 20:21:38 IST 4039
HOUR : 8
MINUTE : 21
SECOND : 38
*/