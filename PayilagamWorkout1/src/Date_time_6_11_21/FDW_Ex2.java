package Date_time_6_11_21;

import java.util.Calendar;
import java.util.Locale;

public class FDW_Ex2 {
	public static void main(String[] args) {  
	    Calendar mycal = Calendar.getInstance(new Locale("us"));  
	    int first = mycal.getFirstDayOfWeek();  
	    System.out.println(" First Day Of week is :" + first );  
	    //cchecking if first day is monday or not  
	    if (first != Calendar.MONDAY) {  
	         System.out.println("First day of week should be monday !!");  
	    }  
	  
	    Calendar mycal2 = Calendar.getInstance(new Locale("uk","UA"));  
	    int first2 = mycal2.getFirstDayOfWeek();  
	    if ( first2 == Calendar.MONDAY) {  
	        System.out.println(" in uk local  First day of week is Monday  !!");  
	    }  
	}  
}
/*
irst Day Of week is :1
First day of week should be monday !!
 in uk local  First day of week is Monday  !!

*/