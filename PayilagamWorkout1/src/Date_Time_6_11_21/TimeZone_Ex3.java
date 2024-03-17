package Date_Time_6_11_21;

import java.util.TimeZone;

public class TimeZone_Ex3 {
public static void main(String[] args) {
	TimeZone tz=TimeZone.getTimeZone("Asia");
	System.out.println(tz.getID());
}
}
//GMT