package Date_Time_06_11_21;
import java.util.*;
public class STZ_Ex1 {
	public static void main(String[] args) {  
	    Calendar mycal = Calendar.getInstance();  
	                //getting the display name of TimeZone therwise it will return in object form  
	        System.out.println(" TimeZone:"  
	                + mycal.getTimeZone().getDisplayName());  
	                // set the time zone of mycal to GMT  
	        mycal.setTimeZone(TimeZone.getTimeZone("GMT"));  
	        System.out.println("Time Zone after changing to GMT:"  
	                + mycal.getTimeZone().getDisplayName());  
	        }  
}
/*
TimeZone:India Standard Time
Time Zone after changing to GMT:Greenwich Mean Time

*/