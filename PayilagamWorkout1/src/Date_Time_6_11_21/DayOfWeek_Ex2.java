package Date_Time_6_11_21;

import java.time.DayOfWeek;

public class DayOfWeek_Ex2 {
public static void main(String[] args) {
	DayOfWeek d=DayOfWeek.of(4);
	System.out.println(d.name());
	System.out.println(d.equals(d));
	System.out.println(d.TUESDAY);
}
}
/*
THURSDAY
true
TUESDAY
*/