package Date_Time_06_11_21;
import java.util.*;
public class IsLEenient_Ex2 {
	public static void main(String[] args) {  
	       Calendar objcal = Calendar.getInstance();  
	      System.out.println("Date and Time is " + objcal.getTime());  
	      boolean b = objcal.isLenient();  
	      System.out.println(" Is lenient: " + b);  
	   }  
}
/*
Date and Time is Sun Nov 07 00:02:11 IST 2021
 Is lenient: true
*/