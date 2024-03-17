package Date_Time_6_11_21;

import java.time.LocalDate;
import java.time.Month;

public class MonthEnum_Ex4 {
public static void main(String[] args) {
	Month m=Month.from(LocalDate.now());
	System.out.println(m.plus(2));
}
}
//JANUARY