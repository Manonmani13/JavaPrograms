package Date_Time_06_11_21;
import java.util.*;
public class FDOW_Ex1 {
	public static void main(String[] args) {  
		  Calendar calobj = Calendar.getInstance();   
		  System.out.println("first day of current week:"+ calobj.getFirstDayOfWeek());  
		  calobj.setFirstDayOfWeek(5);  
		  System.out.println("Date is " + calobj.getTime() +   " so first day of week  is " + calobj.getFirstDayOfWeek());   
		  calobj.setFirstDayOfWeek(Calendar.TUESDAY);  
		  System.out.println("Date is " + calobj.getTime() + "  then first day of week :" + calobj.getFirstDayOfWeek());  
		}  
}
/*
first day of current week:1
Date is Sun Nov 07 00:21:51 IST 2021 so first day of week  is 5
Date is Sun Nov 07 00:21:51 IST 2021  then first day of week :3

*/