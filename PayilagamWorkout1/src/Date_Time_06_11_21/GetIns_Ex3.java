package Date_Time_06_11_21;

import java.util.Calendar;
import java.util.Locale;

public class GetIns_Ex3 {
	public static void main(String args[]){  
		   //get instance method with locale as parameter  
		    Calendar mycal1 = Calendar.getInstance(new Locale("ja"));  
		    Calendar mycal2 = Calendar.getInstance(Locale.US);  
		     mycal2.set(1996, 9 , 23);  
		     System.out.println("mycal1 :" + mycal1.getTime() );  
		     System.out.println("mycal2 :" + mycal2.getTime());  
		     if(mycal1.equals(mycal2))  
		    {  
		        System.out.println("both the instance of calendat are equal");  
		    }  
		     else{  
		         System.out.println("both the instance of calendat are not equal");  
		     }  
	}
}
/*
mycal1 :Sat Nov 06 22:57:15 IST 2021
mycal2 :Wed Oct 23 22:57:15 IST 1996
both the instance of calendat are not equal
*/