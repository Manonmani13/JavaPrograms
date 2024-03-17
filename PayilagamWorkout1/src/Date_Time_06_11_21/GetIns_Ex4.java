package Date_Time_06_11_21;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;  
public class GetIns_Ex4 {
	public static void main(String args[]){  
	    //get instance method with locale as parameter  
	    Calendar mycal1 = Calendar.getInstance(new Locale("ja"));  
	    Calendar mycal2 = (GregorianCalendar)  GregorianCalendar.getInstance(Locale.US);  
	     System.out.println("mycal1 :" + mycal1.getTime());  
	     System.out.println("mycal2 :" + mycal2.getTime());  
	     if(mycal1.equals(mycal2))  
	    {  
	        System.out.println("both the instance of calendat are equal");  
	    }  
	     else{  
	         System.out.println("both the instance of calendat are not equal");  
	          mycal1.clear();  
	         mycal2.clear();  
	         System.out.println("mycal1 :" + mycal1.getTime());  
	     System.out.println("mycal2 :" + mycal2.getTime());  
	     }  
	}  
}
/*
mycal1 :Sat Nov 06 23:04:01 IST 2021
mycal2 :Sat Nov 06 23:04:01 IST 2021
both the instance of calendat are not equal
mycal1 :Thu Jan 01 00:00:00 IST 1970
mycal2 :Thu Jan 01 00:00:00 IST 1970

*/