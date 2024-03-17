package Date_time_6_11_21;

import java.util.Calendar;

public class Clone_Ex3 {
	public static void main(String[] args) {  
	    // create a new calendar  
	       Calendar cal = (Calendar) Calendar.getInstance();  
	      // print the current date and time  
	      System.out.println("" + cal.getTime());  
	// add 4 months to the MONTH feild  
	      cal.add((Calendar.MONTH), 4);  
	      //clone the first calendar object  
	Calendar cal2 = (Calendar) cal.clone();  
	      // display the copy  
	      System.out.println("Cloned calendar object : " + cal2.getTime());        
	}  
}
/*
Sat Nov 06 19:10:31 IST 2021
Cloned calendar object : Sun Mar 06 19:10:31 IST 2022

*/