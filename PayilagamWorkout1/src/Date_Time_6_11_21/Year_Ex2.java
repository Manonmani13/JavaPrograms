package Date_Time_6_11_21;

import java.time.LocalDate;
import java.time.Year;

public class Year_Ex2 {
public static void main(String[] args) {
	Year y=Year.of(2020);
	LocalDate l=y.atDay(30);
	System.out.println(l);
}
}
//2020-01-21