package Date_Time_06_11_21;
import java.util.*;
public class ToString_Ex1 {
	public static void main(String[] args) {  
	      // create new calendar at specific date.  
	     Calendar cal = (Calendar)  Calendar.getInstance();  
	      // print date for default value  
	      System.out.println("Past calendar : " + cal.getTime());  
	      System.out.println("calendar after using toString() : " +  cal.toString());  
	   }  
}
/*
Past calendar : Sun Nov 07 00:43:06 IST 2021
calendar after using toString() : java.util.GregorianCalendar[time=1636225986948,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Kolkata",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=10,WEEK_OF_YEAR=46,WEEK_OF_MONTH=2,DAY_OF_MONTH=7,DAY_OF_YEAR=311,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=43,SECOND=6,MILLISECOND=948,ZONE_OFFSET=19800000,DST_OFFSET=0]

*/