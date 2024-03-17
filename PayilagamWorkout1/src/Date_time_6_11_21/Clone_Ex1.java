package Date_time_6_11_21;

import java.util.Calendar;

public class Clone_Ex1 {
	public static void main(String[] args) {  
	      // create new calendar object.  
	     Calendar cal = (Calendar)  Calendar.getInstance();  
	      // print date for default value  
	      System.out.println("Actual Calendar Object : " + cal.getTime());  
	      // create a clone of first calendar object  
	     Calendar cal2 = (Calendar) cal.clone();  
	      // display the copy  
	      System.out.println("Cloned calendar object : " + cal2.getTime());  
	   }  
}
/*
Actual Calendar Object : Sat Nov 06 19:04:58 IST 2021
Cloned calendar object : Sat Nov 06 19:04:58 IST 2021

*/