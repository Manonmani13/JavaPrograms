package Date_Time_06_11_21;
import java.util.*;
public class WY_Ex2 {
	public static void main(String args[])  
    {  
      
       Calendar mycal = Calendar.getInstance();  
    mycal.setFirstDayOfWeek(Calendar.SUNDAY);  
    mycal.setMinimalDaysInFirstWeek(7);  
    mycal.setTimeInMillis(100);  
  
    int wk = mycal.get(Calendar.WEEK_OF_YEAR);  
    System.out.println("Week : " +wk);  
    int wY = mycal.getWeekYear();  
    System.out.println("Weekayear  : " +wY);  
    int y = mycal.get(Calendar.YEAR);  
    System.out.println("Year  : " +y);  
        
     
    }  
}
/*
Week : 52
Weekayear  : 1969
Year  : 1970

*/