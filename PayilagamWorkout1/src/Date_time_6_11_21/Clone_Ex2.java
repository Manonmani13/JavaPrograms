package Date_time_6_11_21;

import java.util.Calendar;

public class Clone_Ex2 {
	public static void main(String[] args) {  
	      // create a new calendar object  
	     Calendar cal = (Calendar) Calendar.getInstance();  
	      // print the current date and time  
	      System.out.println("" + cal.getTime());  
	// add 9 years to the YEAR feild  
	      cal.add((Calendar.YEAR), 9);  
	// create clone of first calendar object        
	Calendar cal2 = (Calendar) cal.clone();  
	      // display the copy  
	      System.out.println("Cloned calendar object : " + cal2.getTime());  
	}  
}
/*
Sat Nov 06 19:07:34 IST 2021
Cloned calendar object : Wed Nov 06 19:07:34 IST 2030

*/