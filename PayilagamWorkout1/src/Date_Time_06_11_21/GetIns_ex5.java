package Date_Time_06_11_21;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.GregorianCalendar;  
public class GetIns_ex5 {
	public static void main(String args[]){  
	    //get instance method with  time zone  as parameter  
	    Calendar mycal1 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));  
	    Calendar mycal2 = (GregorianCalendar)  GregorianCalendar.getInstance(TimeZone.getTimeZone("UTC") );  
	     System.out.println("mycal1 :" + mycal1.getTime());  
	     System.out.println("mycal2 :" + mycal2.getTime());  
	     if(mycal1.equals(mycal2))  
	    {  
	        System.out.println("both the instance of calendar are equal");  
	    }  
	     else{  
	         System.out.println("both the instance of calendar are not equal");  
	          mycal1.clear();  
	         mycal2.clear();  
	         System.out.println("mycal1 :" + mycal1.getTime());  
	     System.out.println("mycal2 :" + mycal2.getTime());  
	     }  
	    } 
}
/*
mycal1 :Sat Nov 06 23:07:47 IST 2021
mycal2 :Sat Nov 06 23:07:48 IST 2021
both the instance of calendar are not equal
mycal1 :Thu Jan 01 05:30:00 IST 1970
mycal2 :Thu Jan 01 05:30:00 IST 1970

*/