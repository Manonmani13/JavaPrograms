package Date_Time_3_11_21;
import java.time.*;  
import java.time.temporal.Temporal;  
public class ZoneOffSet_Ex1 {
	  public static void main(String[] args) {  
		    ZoneOffset zone = ZoneOffset.UTC;  
		    //System.out.println(zone);
		    Temporal temp = zone.adjustInto(ZonedDateTime.now());  
		    System.out.println(temp);  
		  }  
}
//2021-11-03T23:21:12.633341+05:30[Asia/Kolkata]