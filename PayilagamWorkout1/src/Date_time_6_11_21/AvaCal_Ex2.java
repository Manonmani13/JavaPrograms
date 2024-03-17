package Date_time_6_11_21;

import java.util.Calendar;
import java.util.Set;

public class AvaCal_Ex2 {
	public static void main(String[] args) throws InterruptedException {  
        System.out.println(" All Available Calendar types: ");  
        Set set = Calendar.getAvailableCalendarTypes();  
        for(Object s:set){  
            System.out.println(s);  
        }                     
    }  

}
/*
 All Available Calendar types: 
gregory
buddhist
japanese
*/