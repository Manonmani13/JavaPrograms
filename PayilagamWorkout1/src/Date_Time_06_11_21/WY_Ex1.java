package Date_Time_06_11_21;
import java.util.*;
public class WY_Ex1 {
	public static void main(String[] args){  
		  
        Calendar mycal = Calendar.getInstance();  
        System.out.println(" Current Time:" + mycal.getTime());   
                System.out.println(" week year :"  
                + mycal.getWeekYear());  
        mycal.setWeekDate(1996, 23, 6 );  
        System.out.println("Changed Time:"+mycal.getTime());  
        System.out.println("Weeks in week year :"  
                + mycal.getWeekYear());  
      
}  
}
/*
 Current Time:Sat Nov 06 23:47:46 IST 2021
 week year :2021
Changed Time:Fri Jun 07 23:47:46 IST 1996
Weeks in week year :1996
*/