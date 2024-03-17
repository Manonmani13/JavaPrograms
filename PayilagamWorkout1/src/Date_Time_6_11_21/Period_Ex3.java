package Date_Time_6_11_21;

import java.time.Period;

public class Period_Ex3 {
public static void main(String[] args) {
	Period p=Period.ofMonths(8);
	Period p1=p.minus(Period.ofMonths(7));
	System.out.println(p1);
}
}
//P1M