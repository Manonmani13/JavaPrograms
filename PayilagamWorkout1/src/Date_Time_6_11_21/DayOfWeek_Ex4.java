package Date_Time_6_11_21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DayOfWeek_Ex4 {
public static void main(String[] args) {
	LocalDate d=LocalDate.of(2020, Month.JULY, 22);
	DayOfWeek da=DayOfWeek.from(d);
	System.out.println(da.getValue());
	da=da.minus(2);
	System.out.println(da.getValue());
}
}
/*
3
1

*/