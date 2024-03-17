package Date_Time_6_11_21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class DayOfWeek_Ex1 {
public static void main(String[] args) {
	LocalDate lc=LocalDate.of(2017,Month.OCTOBER,13);
	DayOfWeek dw=DayOfWeek.from(lc);
	System.out.println(dw.get(ChronoField.DAY_OF_WEEK));
}
}
//