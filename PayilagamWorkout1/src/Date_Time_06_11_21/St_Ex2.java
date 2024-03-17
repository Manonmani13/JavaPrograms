package Date_Time_06_11_21;
import java.util.*;
public class St_Ex2 {
	public static void main(String[] args) {  
	      // create a calendar      
	       Calendar mycal = (Calendar) Calendar.getInstance();  
	      Calendar mycal2 = (Calendar) Calendar.getInstance();  
	      System.out.println(" Date  (mycal):" + mycal.getTime() );  
	      mycal.set(Calendar.MONTH, 9);  
	       mycal.set(Calendar.YEAR, 1996);  
	        mycal.set(Calendar.DAY_OF_WEEK, 23);  
	        Date dt = mycal.getTime();  
	        mycal2.setTime(dt);  
	        System.out.println("  Date (mycal2) :" + mycal2.getTime() );  
	   }  
}
/*
 Date  (mycal):Sun Nov 07 00:37:53 IST 2021
  Date (mycal2) :Mon Oct 07 00:37:53 IST 1996

*/