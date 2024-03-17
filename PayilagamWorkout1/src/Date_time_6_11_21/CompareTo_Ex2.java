package Date_time_6_11_21;

import java.util.Calendar;

public class CompareTo_Ex2 {
	 public static void main(String[] args) {  
	      // create two calendar at the different dates  
	       Calendar cal1 =  (Calendar) Calendar.getInstance();  
	      Calendar cal2 = (Calendar) Calendar.getInstance();;  
	      // compare the time values represented by two calendar objects.  
	       cal2.add(Calendar.HOUR, 10);  
	       cal2.add(Calendar.MINUTE, 10);  
	       cal2.add(Calendar.SECOND, 10);  
	       int z = cal1.compareTo(cal2);  
	      // It should return a negative integer( -1),  
	      //if the current triggering object is less than the passed one  
	      System.out.println("The result is :" + z);  
	   }  
}
//The result is :-1