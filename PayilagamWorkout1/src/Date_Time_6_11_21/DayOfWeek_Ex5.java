package Date_Time_6_11_21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DayOfWeek_Ex5 {
public static void main(String[] args) {
	LocalDate lc=LocalDate.of(2020, Month.DECEMBER, 20);
	DayOfWeek d=DayOfWeek.from(lc);
	System.out.println("Day of the week on"+"13th September 2021-"+d.name());
	int val=d.getValue();
	System.out.println("int value of"+d.name()+" "+val);
}
}
/*
Day of the week on13th September 2021-SUNDAY
int value ofSUNDAY 7
*/