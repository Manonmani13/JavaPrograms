package Date_Time_6_11_21;

import java.time.Period;
import java.time.YearMonth;

public class Year_month_Ex5 {
public static void main(String[] args) {
	YearMonth ym=YearMonth.now();
	YearMonth ym1=ym.minus(Period.ofYears(2));
	System.out.println(ym1);
}
}
//2019-11