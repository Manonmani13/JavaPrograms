package Date_Time_6_11_21;

import java.time.Period;

public class Period_Ex4 {
public static void main(String[] args) {
	Period p=Period.ofMonths(3);
	Period p1=p.plus(Period.ofMonths(2));
	System.out.println(p1);
}
}
//P5M