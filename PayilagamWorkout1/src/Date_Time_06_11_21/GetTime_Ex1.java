package Date_Time_06_11_21;
import java.util.*;
public class GetTime_Ex1 {
	public static void main(String[] args) {  
	      // create a calendar      
	      Calendar mycal = new GregorianCalendar(1996, 10, 23);  
	      System.out.println(" Date :" + mycal.getTime() );  
	      mycal.add(Calendar.MONTH, 2);  
	       mycal.add(Calendar.YEAR, 2);  
	        mycal.add(Calendar.DAY_OF_WEEK, 2);  
	        System.out.println(" new Date is :" + mycal.getTime() );  
	   }  
}
/*
public static void main(String[] args) {  
      // create a calendar      
      Calendar mycal = new GregorianCalendar(1996, 10, 23);  
      System.out.println(" Date :" + mycal.getTime() );  
      mycal.add(Calendar.MONTH, 2);  
       mycal.add(Calendar.YEAR, 2);  
        mycal.add(Calendar.DAY_OF_WEEK, 2);  
        System.out.println(" new Date is :" + mycal.getTime() );  
   }  
*/