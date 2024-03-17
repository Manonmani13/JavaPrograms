package Date_time_6_11_21;

import java.util.Calendar;

public class Calender_Ex8 {
    public static void main(String[] args){  
        // create a new calendar  
       Calendar cal = (Calendar) Calendar.getInstance();  
         // print the current date and time  
       System.out.println("" + cal.getTime());  
         int weekday = cal.get(Calendar.DAY_OF_WEEK);  
         cal.add(Calendar.DAY_OF_MONTH, 10);  
         // print the modified date and time  
       System.out.println("" + cal.getTime());          
     }  
}
/*
Sat Nov 06 18:22:02 IST 2021
Tue Nov 16 18:22:02 IST 2021
*/