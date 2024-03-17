package Date_Time_06_11_21;
import java.util.*;
public class WIY {
	 public static void main(String[] args){  
	        Calendar mycal = Calendar.getInstance();  
	        System.out.println(" Current Time:" + mycal.getTime());   
	                System.out.println("Weeks in week year :"  
	                + mycal.getWeeksInWeekYear());  
	        mycal.setWeekDate(1996, 23, 6 );  
	        System.out.println("Changed Time:"+mycal.getTime());  
	        System.out.println("Weeks in week year :"  
	                + mycal.getWeeksInWeekYear());  
	}  
}
/*
Current Time:Sat Nov 06 23:44:52 IST 2021
Weeks in week year :52
Changed Time:Fri Jun 07 23:44:52 IST 1996
Weeks in week year :52

*/