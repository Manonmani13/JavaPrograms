package Date_Time_3_11_21;
import java.time.*;
public class ZoneID_Ex1 {
	public static void main(String... args) {  
	    ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");  
	    LocalTime id1 = LocalTime.now(zoneid1);  
	    LocalTime id2 = LocalTime.now(zoneid2);  
	    System.out.println(id1);  
	    System.out.println(id2);  
	    System.out.println(id1.isBefore(id2));    
	  }  
}
/*
23:11:45.740804
02:41:45.740934
false

*/