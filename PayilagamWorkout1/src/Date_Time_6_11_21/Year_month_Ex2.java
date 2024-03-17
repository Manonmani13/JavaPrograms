package Date_Time_6_11_21;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Year_month_Ex2 {
public static void main(String[] args) {
	YearMonth ym=YearMonth.now();
	String s=ym.format(DateTimeFormatter.ofPattern("MM yyyy"));
	System.out.println(s);
}
}
//11 2021