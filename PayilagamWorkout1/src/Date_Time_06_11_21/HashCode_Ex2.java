package Date_Time_06_11_21;
import java.util.*;
public class HashCode_Ex2 {
	 public static void main(String[] args) {  
		  
	      // create a new calendar   
	      GregorianCalendar mycal = (GregorianCalendar) GregorianCalendar.getInstance();  
	  
	      // print the current date and time  
	      System.out.println(" current Time : " + mycal.getTime());  
	  
	      // print a hashcode for this calendar  
	      System.out.println("Hash Code:" + mycal.hashCode());  
	   }  
}
/*
 current Time : Sat Nov 06 23:52:30 IST 2021
Hash Code:610962
*/