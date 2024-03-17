package Date_Time_6_11_21;

import java.time.Duration;
import java.time.LocalTime;

public class Duration_Ex2 {
public static void main(String[] args) {
	Duration d=Duration.between(LocalTime.MAX, LocalTime.NOON);
	System.out.println(d.isNegative());
	Duration d1=Duration.between(LocalTime.NOON,LocalTime.MAX);
	System.out.println(d1.isNegative());
}
}
/*
true
false
*/