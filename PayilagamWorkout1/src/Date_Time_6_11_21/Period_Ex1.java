package Date_Time_6_11_21;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

public class Period_Ex1 {
public static void main(String[] args) {
	Period p=Period.ofDays(40);
	Temporal te=p.addTo(LocalDate.now());
	System.out.println(te);
	//System.out.println(p);
}
}
//2021-12-16