package Date_Time_06_11_21;
import java.util.Calendar;  
import java.util.GregorianCalendar;  
public class MDIFW_Ex2 {
	public static void main(String[] args) {  
		  // create 2 calendar  
		      Calendar calobj = Calendar.getInstance();  
		      GregorianCalendar calobj2 =(GregorianCalendar) GregorianCalendar.getInstance();  
		            System.out.println(" Today (Calendarobject) :" + calobj.getTime());  
		         System.out.println(" Today (GregorianCalendarobject) :" + calobj.getTime());  
		       calobj.setMinimalDaysInFirstWeek(9);  
		       calobj2.setMinimalDaysInFirstWeek(9);  
		       if(calobj.getMinimalDaysInFirstWeek()== calobj2.getMinimalDaysInFirstWeek())  
		               System.out.println("both the calendar object require same Minimal days  in first week  " +calobj.getMinimalDaysInFirstWeek());  
		               }
}
/*
 Today (Calendarobject) :Sun Nov 07 00:27:23 IST 2021
 Today (GregorianCalendarobject) :Sun Nov 07 00:27:23 IST 2021
both the calendar object require same Minimal days  in first week  9
*/