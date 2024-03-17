package Date_Time_06_11_21;
import java.util.*;
public class TID_Ex2 {
	public static void main(String[] args) throws InterruptedException {  
	      Calendar mycal = Calendar.getInstance();  
	      System.out.println("Current time in Millis (mycal) : " + mycal.getTimeInMillis());  
	      mycal.add(Calendar.HOUR,20);  
	      mycal.add(Calendar.YEAR,2020);  
	      mycal.add(Calendar.DAY_OF_WEEK,23);  
	      mycal.add(Calendar.MONTH,11);  
	      long l = mycal.getTimeInMillis();  
	      Calendar mycal2 = Calendar.getInstance();  
	      mycal2.setTimeInMillis(l);  
	      System.out.println("Current time in Millis (mycal2) : " + mycal.getTimeInMillis());  
	   }  
}
/*
Current time in Millis (mycal) : 1636225534145
Current time in Millis (mycal2) : 65412198334145

*/