package Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDate_Ex3 {
	 public static void main(String[] args) {  
		    LocalDate date = LocalDate.of(2017, 1, 13);  
		    LocalDateTime datetime = date.atTime(1,50,9);      
		    System.out.println(datetime);   
		  }  
}
//2017-01-13T01:50:09