package Date_Time;

import java.time.MonthDay;

public class Mont_Date_Ex2 {
	public static void main(String[] args) {  
	    MonthDay month = MonthDay.now();  
	    boolean b = month.isValidYear(2012);  
	    System.out.println(b);  
	  }  
}
//true