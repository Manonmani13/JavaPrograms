package Date_Time_06_11_21;
import java.util.*;
public class FDOW_Ex2 {
	public static void main(String[] args) {  
	    Calendar mycal = Calendar.getInstance(new Locale("us"));  
	     mycal.setFirstDayOfWeek(3);  
	     int first = mycal.getFirstDayOfWeek();  
	     System.out.println(" First Day Of week is :" + mycal.getFirstDayOfWeek() );  
	    //checking if first day is monday or not  
	    if (first != Calendar.MONDAY) {  
	         System.out.println("First day of week should be monday !!");  
	    }  
	    Calendar mycal2 = Calendar.getInstance(new Locale("uk","UA"));  
	    int first2 = mycal2.getFirstDayOfWeek();  
	     mycal.setFirstDayOfWeek(Calendar.YEAR);  
	    if ( first2 == Calendar.MONDAY) {  
	        System.out.println(" in uk local  First day of week is Monday  !!");  
	    }  
}
}
/*
First Day Of week is :3
First day of week should be monday !!
 in uk local  First day of week is Monday  !!

*/