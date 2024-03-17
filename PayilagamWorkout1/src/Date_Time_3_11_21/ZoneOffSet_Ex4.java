package Date_Time_3_11_21;
import java.time.ZoneOffset;  
import java.time.temporal.ChronoField;
public class ZoneOffSet_Ex4 {
	public static void main(String[] args) {  
	    ZoneOffset zone = ZoneOffset.UTC;  
	    boolean b1 = zone.isSupported(ChronoField.OFFSET_SECONDS);  
	    System.out.println(b1);  
	    boolean b2 = zone.isSupported(ChronoField.SECOND_OF_MINUTE);  
	    System.out.println(b2);  
	  }  
}
/*
true
false
*/