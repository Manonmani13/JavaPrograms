package Date_Time_06_11_21;
import java.util.*;
public class MDIFW_Ex1 {
	public static void main(String[] args) {  
	      // create a calendar  
	      Calendar calobj = Calendar.getInstance();  
	      calobj.setMinimalDaysInFirstWeek(5);  
	       System.out.println(" Today is :" + calobj.getTime());  
	      int day  = calobj.getMinimalDaysInFirstWeek();  
	      // print the result  
	      System.out.println("Minimal days  in first week required :" + day);  
	   }  
}
/*
Today is :Sun Nov 07 00:26:15 IST 2021
Minimal days  in first week required :5

*/