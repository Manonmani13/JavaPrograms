package Date_Time_06_11_21;
import java.util.*;
public class ToStringg_Ex2 {
	public static void main(String[] args) {  
		  // create a new calendar  
		     Calendar cal = (Calendar) Calendar.getInstance();  
		      // print the current date and time  
		      System.out.println("  cal " + cal.getTime());  
		      // add 4 MONTHS  
		      cal.add((Calendar.MONTH), 2);  
		      cal.add((Calendar.YEAR), 4);  
		      cal.add((Calendar.DAY_OF_MONTH), 24);  
		      cal.add((Calendar.HOUR), 5);  
		      cal.add((Calendar.MINUTE), 60);  
		      cal.add((Calendar.SECOND), 360);  
		      System.out.println("cal.toString() : " + cal.toString());  
		      }  
}
/*
cal Sun Nov 07 00:44:14 IST 2021
cal.toString() : java.util.GregorianCalendar[time=1769822414643,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Kolkata",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2026,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=31,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=50,SECOND=14,MILLISECOND=643,ZONE_OFFSET=19800000,DST_OFFSET=0]

*/