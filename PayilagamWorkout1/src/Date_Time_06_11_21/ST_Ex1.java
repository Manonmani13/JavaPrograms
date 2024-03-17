package Date_Time_06_11_21;
import java.util.*;
public class ST_Ex1 {
	public static void main(String[] args) {  
	      // create a calendar      
	      Calendar mycal = new GregorianCalendar(1996, 10, 23);  
	      System.out.println(" Date :" + mycal.getTime() );  
	      Date date = new Date(18, 10, 10);  
	      mycal.setTime(date);  
	        System.out.println(" new Date is :" + mycal.getTime() );  
	   }  
}
/*
 Date :Sat Nov 23 00:00:00 IST 1996
 new Date is :Sun Nov 10 00:00:00 IST 1918

*/