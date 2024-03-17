package Date_Time_6_11_21;

import java.time.YearMonth;
import java.time.temporal.ChronoField;

public class Year_month_Ex3 {
public static void main(String[] args) {
	YearMonth y=YearMonth.now();
	long l=y.get(ChronoField.YEAR);
	System.out.println(l);
	long l1=y.getLong(ChronoField.MONTH_OF_YEAR);
	System.out.println(l1);
}
}
/*
2021
11

*/