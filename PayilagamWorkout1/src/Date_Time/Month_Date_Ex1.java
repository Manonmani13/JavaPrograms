package Date_Time;

import java.time.LocalDate;
import java.time.MonthDay;

public class Month_Date_Ex1 {
	public static void main(String[] args) {  
	    MonthDay month = MonthDay.now();  
	    LocalDate date = month.atYear(1994);  
	    System.out.println(date);  
	  }  
}
//1994-10-31