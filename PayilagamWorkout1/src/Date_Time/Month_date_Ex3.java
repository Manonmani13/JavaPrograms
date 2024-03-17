package Date_Time;

import java.time.MonthDay;
import java.time.temporal.ChronoField;

public class Month_date_Ex3 {
	public static void main(String[] args) {  
	    MonthDay month = MonthDay.now();  
	    long n = month.get(ChronoField.MONTH_OF_YEAR);  
	    System.out.println(n);  
	  }  
}
//10