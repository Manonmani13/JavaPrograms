package Date_Time_06_11_21;
import java.util.*;
public class WD_Ex2 {
	public static void main(String[] args) {  
        // creating a Calendar Object calobj  
Calendar calobj = Calendar.getInstance();  
        System.out.println(" week date  :" + calobj.get(Calendar.DAY_OF_WEEK));  
boolean c = calobj.isWeekDateSupported();  
System.out.println("Is  week date supported :"  + c);  
        calobj.add(Calendar.DAY_OF_WEEK,8);  
         System.out.println(" week date  :" + calobj.get(Calendar.DAY_OF_WEEK));  
        c = calobj.isWeekDateSupported();  
System.out.println("Is  week date supported :"  + c);  
          
         calobj.set(Calendar.DAY_OF_WEEK,10);  
        System.out.println(" week date  :" + calobj.get(Calendar.DAY_OF_WEEK));  
        c = calobj.isWeekDateSupported();  
System.out.println("Is  week date supported :"  + c);  
}  
}
/*
 week date  :1
Is  week date supported :true
 week date  :2
Is  week date supported :true
 week date  :3
Is  week date supported :true
*/