package Date_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_time_ex1 {
public static void main(String[] args) {
	  LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	  
}
}
/*
Before formatting: 2021-10-31T14:52:53.631420
After formatting: 31-10-2021 14:52:53

*/