package Date_Time_6_11_21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

public class MonthEnum_Ex1 {
public static void main(String[] args) {
	Month m=Month.valueOf("January".toUpperCase());
	System.out.printf("For the month of %s all sunday are:%n",m);
	LocalDate ld=Year.now().atMonth(m).atDay(2).
			with(TemporalAdjusters.firstInMonth(DayOfWeek.SATURDAY));
	Month mi=ld.getMonth();
	while(mi==m)
	{
		System.out.printf("%s%n",ld);
		ld=ld.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		mi=ld.getMonth();
	}
	
}
}
/*
For the month of JANUARY all sunday are:
2021-01-02
2021-01-08
2021-01-15
2021-01-22
2021-01-29
*/