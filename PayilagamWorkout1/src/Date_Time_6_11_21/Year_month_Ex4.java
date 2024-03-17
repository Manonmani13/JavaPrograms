package Date_Time_6_11_21;

import java.time.Period;
import java.time.YearMonth;

public class Year_month_Ex4 {
public static void main(String[] args) {
	YearMonth ym=YearMonth.now();
	YearMonth ym1=ym.plus(Period.ofYears(2));
	System.out.println(ym1);
}
}
//2023-11