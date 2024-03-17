package Date_Time;

import java.time.LocalDate;

public class Local_Date_Ex1 {
public static void main(String[] args) {
	   LocalDate date = LocalDate.now();    
	    LocalDate yesterday = date.minusDays(1); 
	    LocalDate tomorrow = yesterday.plusDays(2);    
	    System.out.println("Today date: "+date);    
	    System.out.println("Yesterday date: "+yesterday);    
	    System.out.println("Tomorrow date: "+tomorrow);   
}
}
/*
Today date: 2021-10-31
Yesterday date: 2021-10-30
Tomorrow date: 2021-11-01
*/