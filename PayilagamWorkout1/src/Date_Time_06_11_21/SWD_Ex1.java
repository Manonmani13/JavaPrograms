package Date_Time_06_11_21;
import java.util.*;
public class SWD_Ex1 {
	public static void main(String[] args){  
        // creating new calendar object mycal  
Calendar mycal = Calendar.getInstance();  
//by using getTime method geting the Todays Time   
System.out.println("  Time Today:" + mycal.getTime());  
// setting the weekyear , weekofyear and dayofweek using setWeekDate  
mycal.setWeekDate(1996, 23, 6);  
System.out.println("Now Time Today:"+mycal.getTime());    
}  
}
/*
Time Today:Sun Nov 07 00:32:17 IST 2021
Now Time Today:Fri Jun 07 00:32:17 IST 1996

*/