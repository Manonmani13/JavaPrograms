package Date_time_6_11_21;

import java.util.Calendar;

public class Calender_Ex7 {
	public static void main(String[] args) {  
	      // create a new calendar  
	      Calendar cal = (Calendar) Calendar.getInstance();  
	      // print the current date and time  
	      System.out.println("" + cal.getTime());  
	      // add 2 months   
	      cal.add((Calendar.MONTH), 2);  
	      // print the modified date and time  
	      System.out.println("" + cal.getTime());  
	       
	}
}
/*
Sat Nov 06 18:20:40 IST 2021
Thu Jan 06 18:20:40 IST 2022
*/