package Date_Time_6_11_21;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZone_Ex2 {
public static void main(String[] args) {
	TimeZone z=TimeZone.getTimeZone("Asiz/kolkata");
	System.out.println(z.getOffset(Calendar.ZONE_OFFSET));
}
}
//0