package Date_Time_06_11_21;

import java.util.Calendar;

public class Millis_Ex2 {
	 public static void main(String[] args) throws InterruptedException {  
		 Calendar mycal = Calendar.getInstance();  
		  System.out.println("Current time in Millis : " + mycal.getTimeInMillis());  
		  mycal.add(Calendar.HOUR,20);  
		       System.out.println("Current time in Millis  after adding 20 hours : " + mycal.getTimeInMillis());  
		       Calendar mycal2 = Calendar.getInstance();  
		       long l = mycal2.getTimeInMillis();  
		       System.out.println("Next time is : " + l);  
		    }  
}
/*
Current time in Millis : 1636222120457
Current time in Millis  after adding 20 hours : 1636294120457
Next time is : 1636222120677

*/