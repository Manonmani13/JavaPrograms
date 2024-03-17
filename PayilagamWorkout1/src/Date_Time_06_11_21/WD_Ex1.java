package Date_Time_06_11_21;
import java.util.*;
public class WD_Ex1 {
	public static void main(String[] args) {  
        // creating a Calendar Object calobj  
Calendar calobj = Calendar.getInstance();  
        System.out.println(" week date  :" + calobj.get(Calendar.DAY_OF_WEEK));  
boolean c = calobj.isWeekDateSupported();  
System.out.println("Is  week date supported :"  + c);  
        System.out.println("after clearing week date:");  
        calobj.clear();  
         System.out.println(" week date  :" + calobj.get(Calendar.DAY_OF_WEEK));  
        c = calobj.isWeekDateSupported();  
System.out.println("Is  week date supported :"  + c);  
}  
}
/*
 week date  :1
Is  week date supported :true
after clearing week date:
 week date  :5
Is  week date supported :true
*/