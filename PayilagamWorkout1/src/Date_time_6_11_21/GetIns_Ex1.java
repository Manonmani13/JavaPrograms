package Date_time_6_11_21;

import java.util.Calendar;

public class GetIns_Ex1 {
	public static void main(String args[]){  
	    Calendar mycal1 = Calendar.getInstance();  
	    Calendar mycal2 = Calendar.getInstance();  
	     mycal2.set(1996, 9 , 23);  
	     System.out.println("mycal1 :" + mycal1.getTime());  
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
mycal1 :Sat Nov 06 21:26:35 IST 2021
mycal2 :Wed Oct 23 21:26:35 IST 1996
both the instance of calendat are not equal
*/