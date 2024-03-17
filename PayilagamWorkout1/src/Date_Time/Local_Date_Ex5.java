package Date_Time;

import java.time.LocalDate;

public class Local_Date_Ex5 {
    public static void main(String ar[])   
    {   
        String dInStr = "2011-09-01";  
        LocalDate d1 = LocalDate.parse(dInStr);  
        System.out.println("String to LocalDate : " + d1);  
        // Example 2  
        String dInStr2 = "2015-11-20";  
        LocalDate d2 = LocalDate.parse(dInStr2);  
        System.out.println("String to LocalDate : " + d2);  
    }
}
/*
String to LocalDate : 2011-09-01
String to LocalDate : 2015-11-20
*/