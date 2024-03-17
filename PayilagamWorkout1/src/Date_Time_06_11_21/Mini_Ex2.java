package Date_Time_06_11_21;

import java.util.*;

public class Mini_Ex2 {

public static void main(String[] args) {  
    // create a calendar      
    Calendar mycal = new GregorianCalendar(1996, 10, 23);  
    System.out.println(" Date :" + mycal.getTime() );  
    // print themax value for year field  
    int outp1 = mycal.getMinimum(Calendar.YEAR);  
    System.out.println("The  Minimum  (Year) is: " + outp1);  
     int outp2 = mycal.getMinimum(Calendar.MONTH);  
    System.out.println("The  Minimum  (Month)  is: " + outp2);  
     int outp3 = mycal.getMinimum(Calendar.DAY_OF_WEEK);  
    System.out.println("The  Minimum  (Day) is: " + outp3);  
 }  
}
/*
 Date :Sat Nov 23 00:00:00 IST 1996
The  Minimum  (Year) is: 1
The  Minimum  (Month)  is: 0
The  Minimum  (Day) is: 1

*/