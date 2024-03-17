package Date_Time_06_11_21;
import java.util.GregorianCalendar;  
import java.util.*;
public class InternalGet_Ex2  extends GregorianCalendar {
	public static void main(String[] args) {  
	      InternalGet_Ex2 mycal = new InternalGet_Ex2();  
	      System.out.println("Todays date is : " + mycal.getTime());  
	 // prints the value for the  hour field passed as parameter to internalGet()  
	      System.out.println(" HOUR  : " + mycal.internalGet(HOUR));  
	// prints the value for the  minute field passed as parameter to internalGet()  
	      System.out.println(" MINUTE : " + mycal.internalGet(MINUTE));  
	      // prints the value for the  second field passed as parameter to internalGet()  
	      
}
}
/*
Todays date is : Sat Nov 06 23:58:52 IST 2021
 HOUR  : 11
 MINUTE : 58
*/