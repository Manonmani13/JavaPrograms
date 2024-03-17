package Date_Time_06_11_21;
import java.util.*;
public class Set_Ex1 {
	public static void main(String[] args) {  
	      // create a calendar object calobj  
	      Calendar calobj = Calendar.getInstance();  
	      // display the current date  
	      System.out.println(" Today " + calobj.getTime());  
	      // determine if the given calendar field has a value set  
	      boolean b = calobj.isSet(Calendar.YEAR);  
	      System.out.println("Year is set: " + b);  
	      calobj.clear(Calendar.YEAR);  
	      // determine if the given calendar field has a value set  
	      b = calobj.isSet(Calendar.YEAR);  
	      System.out.println("Year is set: " + b);  
	   }  
}
/*
 Today Sun Nov 07 00:03:44 IST 2021
Year is set: true
Year is set: false
*/