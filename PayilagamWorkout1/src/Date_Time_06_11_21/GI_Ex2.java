package Date_Time_06_11_21;
import java.util.*;
public class GI_Ex2  extends GregorianCalendar {
	public static void main(String[] args) {  
	      GI_Ex2 mycal = new GI_Ex2();  
	      System.out.println("Todays date is : " + mycal.getTime());  
	 // prints the value for the  hour field passed as parameter to internalGet()  
	      System.out.println(" HOUR  : " + mycal.internalGet(HOUR));  
	// prints the value for the  minute field passed as parameter to internalGet()  
	      System.out.println(" MINUTE : " + mycal.internalGet(MINUTE));  
	      // prints the value for the  second field passed as parameter to internalGet()  
	      System.out.println("SECOND : " + mycal.internalGet(SECOND));  
	   }  
}
/*Todays date is : Sun Nov 07 00:13:11 IST 2021
 HOUR  : 0
 MINUTE : 13
SECOND : 11

*/