package Date_Time_06_11_21;
import java.util.*;
public class STZ_Ex2 {
	public static void main(String[] args) {  
		 Calendar mycal2 = Calendar.getInstance();  
		  TimeZone timezoneobj = mycal2.getTimeZone();  
		   System.out.println(" Display Name of Current TimeZone (mycal2) :" + timezoneobj.getDisplayName());  
		              Calendar mycal3 = Calendar.getInstance();  
		                mycal3.setTimeZone(timezoneobj);  
		                timezoneobj = mycal3.getTimeZone();  
		                System.out.println(" Display Name of TimeZone (mycal3):" + timezoneobj.getDisplayName());  
		                   }  
}
/*
Display Name of Current TimeZone (mycal2) :India Standard Time
 Display Name of TimeZone (mycal3):India Standard Times
*/