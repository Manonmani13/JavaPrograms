package Date_Time_06_11_21;
import java.util.*;
public class TimeZone_Ex2 {
	 public static void main(String[] args) {  
         Calendar mycal2 = Calendar.getInstance();  
         TimeZone timezoneobj = mycal2.getTimeZone();  
            System.out.println(" Display Name of Current TimeZone :" + timezoneobj.getDisplayName());  
    }
}
//Display Name of Current TimeZone :India Standard Time