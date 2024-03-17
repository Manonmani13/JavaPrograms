package Date_Time_6_11_21;

import java.util.TimeZone;

public class TimeZone_Ex4 {
public static void main(String[] args) {
	TimeZone z=TimeZone.getDefault();
	String name=z.getDisplayName();
	System.out.println(name);
}
}
//India Standard Time