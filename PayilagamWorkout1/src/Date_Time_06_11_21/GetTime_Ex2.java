package Date_Time_06_11_21;
import java.util.*;
public class GetTime_Ex2 {
	public static void main(String[] args) {  
	      // create a calendar      
	       Calendar mycal = (Calendar) Calendar.getInstance();  
	      System.out.println(" Date :" + mycal.getTime() );  
	      mycal.set(Calendar.MONTH, 9);  
	      mycal.set(Calendar.YEAR, 1996);  
	       mycal.set(Calendar.DAY_OF_WEEK, 23);          
	        System.out.println(" new Date is :" + mycal.getTime() );  
	   }  
}
/*Date :Sat Nov 06 23:40:56 IST 2021
 new Date is :Mon Sep 30 23:40:56 IST 1996

*/