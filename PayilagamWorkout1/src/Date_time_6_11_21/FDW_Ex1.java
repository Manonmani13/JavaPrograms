package Date_time_6_11_21;

import java.util.Calendar;

public class FDW_Ex1 {
	public static void main(String[] args) {  
        Calendar calobj = Calendar.getInstance();   
        System.out.println("first day of current week:"  
                + calobj.getFirstDayOfWeek());  
                  
                calobj.add(Calendar.YEAR, 1996);  
                 calobj.add(Calendar.MONTH, 9);  
                  calobj.add(Calendar.DAY_OF_WEEK, 23);  
                    
                  System.out.println("If date is  " + calobj.getTime() + "  then first day of week is  "  
                + calobj.getFirstDayOfWeek());  
                  
        calobj.setFirstDayOfWeek(Calendar.TUESDAY);  
        System.out.println("now first day of week :"   
                + calobj.getFirstDayOfWeek());  
    }  
}
/*
first day of current week:1
If date is  Wed Aug 29 21:10:10 IST 4018  then first day of week is  1
now first day of week :3

*/