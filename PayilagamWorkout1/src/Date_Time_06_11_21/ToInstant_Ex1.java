package Date_Time_06_11_21;
import java.util.*;
public class ToInstant_Ex1 {
	public static void main(String[] args) {  
		  // create new calendar at specific date.  
		     Calendar cal = (Calendar)  Calendar.getInstance();  
		      // print date for default value  
		      System.out.println("Past calendar : " + cal.getTime());  
		      System.out.println("calendar after using toInstant() : " +  cal.toInstant());  
		   }  
}
/*
Past calendar : Sun Nov 07 00:40:29 IST 2021
calendar after using toInstant() : 2021-11-06T19:10:29.861Z

*/