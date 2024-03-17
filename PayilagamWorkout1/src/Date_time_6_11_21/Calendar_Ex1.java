package Date_time_6_11_21;

import java.util.Calendar;

public class Calendar_Ex1 {
	 public static void main(String[] args) {  
		   Calendar calendar = Calendar.getInstance();  
		   System.out.println("The current date is : " + calendar.getTime());  
		   calendar.add(Calendar.DATE, -15);  
		   System.out.println("15 days ago: " + calendar.getTime());  
		   calendar.add(Calendar.MONTH, 4);  
		   System.out.println("4 months later: " + calendar.getTime());  
		   calendar.add(Calendar.YEAR, 2);  
		   System.out.println("2 years later: " + calendar.getTime());  
		   }  
}
/*
The current date is : Sat Nov 06 18:01:07 IST 2021
15 days ago: Fri Oct 22 18:01:07 IST 2021
4 months later: Tue Feb 22 18:01:07 IST 2022
2 years later: Thu Feb 22 18:01:07 IST 2024
*/