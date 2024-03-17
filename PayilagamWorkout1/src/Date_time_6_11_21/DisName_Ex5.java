package Date_time_6_11_21;

import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class DisName_Ex5 {
	public static void main(String[] args) {  
	     // create calendar and locale  
	      Calendar cal1 = Calendar.getInstance();  
	      Locale loc = Locale.getDefault();  
	  // geting all the days of week using getDisplayName method   
	      //and assigning it to a String tree set  
	      Map< String, Integer> tset =   
	      cal1.getDisplayNames(Calendar.DAY_OF_WEEK, Calendar.LONG, loc);  
	      NavigableMap< String, Integer> Map =    
	      new TreeMap< String, Integer>(tset);  
	      // print the results  
	      System.out.printf("List of Days in a week are :%n%s%n", Map);  
}
}
/*
List of Days in a week are :
{Friday=6, Monday=2, Saturday=7, Sunday=1, Thursday=5, Tuesday=3, Wednesday=4}

*/