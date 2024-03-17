package Date_time_6_11_21;

import java.util.Calendar;

public class CompareTo_Ex3 {
	public static void main(String[] args) {  
	      // create two calendar at the different dates  
	       Calendar cal1 =  (Calendar) Calendar.getInstance();  
	     Calendar cal2 = (Calendar) Calendar.getInstance();;  
	      // compare the time values represented by two calendar objects.  
	       cal2.add(Calendar.HOUR, 10);  
	       cal2.add(Calendar.MINUTE, 10);  
	       cal2.add(Calendar.SECOND, 10);  
	      // compare again but with the two calendars swapped  
	      int j = cal1.compareTo(cal1);  
	      // It should return 0 ,  
	      //if the current triggering object is less equal to the  passed one  
	      System.out.println("The result is :" + j);  
	      }
}
//The result is :0