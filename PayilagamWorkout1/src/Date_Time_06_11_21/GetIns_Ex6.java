package Date_Time_06_11_21;

import java.util.Calendar;
import java.util.TimeZone;

public class GetIns_Ex6 {
	public static void main(String args[]){  
		   //get instance method with  timezone as parameter  
		       Calendar mycal1 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));  
		      Calendar mycal2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));  
		     mycal2.set(1996, 9 , 23);  
		     System.out.println("mycal1 :" + mycal1.getTime() );  
		     System.out.println("mycal2 :" + mycal2.getTime());  
		     if(mycal1.equals(mycal2))  
		    {  
		        System.out.println("both the instance of calendar are equal");  
		    }  
		     else{  
		         System.out.println("both the instance of calendar are not equal");  
		     }  
		}  
}
/*
mycal1 :Sat Nov 06 23:10:33 IST 2021
mycal2 :Wed Oct 23 23:10:33 IST 1996
both the instance of calendar are not equal

*/