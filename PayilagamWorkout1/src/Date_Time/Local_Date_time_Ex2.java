package Date_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Local_Date_time_Ex2 {
	public static void main(String[] args) {  
	    LocalDateTime datetime1 = LocalDateTime.now();  
	    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	    String formatDateTime = datetime1.format(format);   
	    System.out.println(formatDateTime);    
	  } 
}
//31-10-2021 21:44:49