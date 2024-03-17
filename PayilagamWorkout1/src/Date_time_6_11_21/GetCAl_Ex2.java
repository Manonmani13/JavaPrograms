package Date_time_6_11_21;

import java.util.GregorianCalendar;

public class GetCAl_Ex2 {
	public static void main(String[] args) {  
	     // creating an instance of type GregorianCalendar  
	    GregorianCalendar calinstance = (GregorianCalendar)     GregorianCalendar.getInstance();  
	    //  getting the Calendar type using getCalendarType method.  
	    System.out.println("Type of Calendar is: " +  
	                        calinstance.getCalendarType());     
	}  
}
//Type of Calendar is: gregory