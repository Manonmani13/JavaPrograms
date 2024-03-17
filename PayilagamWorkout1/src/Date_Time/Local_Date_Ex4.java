package Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Local_Date_Ex4 {
	public static void main(String ar[])  
    {  
        LocalDate d1 = LocalDate.now();  
        String d1Str = d1.format(DateTimeFormatter.ISO_DATE);  
        System.out.println("Date1 in string :  " + d1Str);  
        // Example 2  
        LocalDate d2 = LocalDate.of(2021, 05, 01);  
        String d2Str = d2.format(DateTimeFormatter.ISO_DATE);  
        System.out.println("Date2 in string :  " + d2Str);  
        // Example 3  
        LocalDate d3 = LocalDate.of(2016, 11, 01);  
        String d3Str = d3.format(DateTimeFormatter.ISO_DATE);  
        System.out.println("Date3 in string :  " + d3Str);  
    }  

}
/*
Date1 in string :  2021-10-31
Date2 in string :  2021-05-01
Date3 in string :  2016-11-01

*/