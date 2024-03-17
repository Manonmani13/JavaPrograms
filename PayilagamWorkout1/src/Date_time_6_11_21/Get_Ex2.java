package Date_time_6_11_21;

import java.util.Calendar;

public class Get_Ex2 {
	public static void main(String[] args) {  
	    // creating a calendar named  as cal1  
	    Calendar cal1 = Calendar.getInstance();  
	    //  HOUR field is passed as parameter to get method  
	    System.out.println("Hour is : " +  
	                        cal1.get(Calendar.HOUR));  
	    //  MINUTE field DATE field is passed as parameter to get method  
	    System.out.println("Minute is: " +  
	                        cal1.get(Calendar.MINUTE));  
	    //  SECOND field DATE field is passed as parameter to get method  
	    System.out.println("Second is" +   
	                        cal1.get(Calendar.SECOND));  
	    System.out.println("Time : "+cal1.get(Calendar.HOUR) + ":" + cal1.get(Calendar.MINUTE)  
	    + ":" + cal1.get(Calendar.SECOND) );  
	}  
}
/*
Hour is : 8
Minute is: 20
Second is22
Time : 8:20:22
*/