package Date_time_6_11_21;

import java.util.Calendar;

public class GetMin_Ex2 {
	public static void main(String[] args) {  
	      // create a calendar  
	      Calendar cal = Calendar.getInstance();  
	      // get minimum HOUR field value and assign it in hour variable  
	      int Hour = cal.getActualMinimum(Calendar.HOUR);  
	      System.out.println("Minimum HOUR value is:" + Hour);  
	      // get minimum HOUR field value and assign it in hour variable  
	      int Minute = cal.getActualMinimum(Calendar.MINUTE);  
	      System.out.println("Minimum Minute value is:" + Minute);  
	      // get minimum HOUR field value and assign it in hour variable  
	      int Second = cal.getActualMinimum(Calendar.SECOND);  
	      System.out.println("Minimum Second value is:" + Second);  
	     
	}
}
/*
Minimum HOUR value is:0
Minimum Minute value is:0
Minimum Second value is:0
*/