package Date_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Local_Date_timeEx1 {
	public static void main(String[] args) {  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println("Before Formatting: " + now);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime = now.format(format);  
        System.out.println("After Formatting: " + formatDateTime);  
    }  
}
/*
Before Formatting: 2021-10-31T21:41:51.721579
After Formatting: 31-10-2021 21:41:51

*/