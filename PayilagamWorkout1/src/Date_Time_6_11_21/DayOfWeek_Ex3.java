package Date_Time_6_11_21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DayOfWeek_Ex3 {
public static void main(String[] args) {
	LocalDate d=LocalDate.of(2017,Month.JANUARY,20);
	DayOfWeek da=DayOfWeek.from(d);
	System.out.println(da.getValue());
	da=da.plus(4);
	System.out.println(da.getValue());
}
}
/*
5
2
*/