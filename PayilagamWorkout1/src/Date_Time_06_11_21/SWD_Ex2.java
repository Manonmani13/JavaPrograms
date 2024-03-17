package Date_Time_06_11_21;
import java.util.*;
public class SWD_Ex2 {
	public static void main(String[] args){  
        // creating  2 new calendar object mycal andmycal2  
   Calendar mycal = Calendar.getInstance();  
           Calendar mycal2 = Calendar.getInstance();  
         //by using getTime method geting the Todays Time   
   System.out.println("  Time Today(mycal):" + mycal.getTime());  
           int woy = mycal.get(Calendar.WEEK_OF_YEAR);  
            int dow = mycal.get(Calendar.DAY_OF_WEEK);  
            int wy = mycal.get(Calendar.YEAR);  
           // setting the weekyear , weekofyear and dayofweek using setWeekDate  
   mycal2.setWeekDate(wy , woy , dow);  
   System.out.println("Time Today (mycal2):"+mycal2.getTime());  
}  
}
/*
Time Today(mycal):Sun Nov 07 00:33:15 IST 2021
Time Today (mycal2):Sun Nov 07 00:33:15 IST 2021

*/