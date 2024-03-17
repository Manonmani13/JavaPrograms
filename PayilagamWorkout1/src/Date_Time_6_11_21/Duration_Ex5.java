package Date_Time_6_11_21;

import java.time.Duration;
import java.time.LocalTime;

public class Duration_Ex5 {
public static void main(String[] args) {
	Duration d=Duration.between(LocalTime.NOON,LocalTime.MAX);
	System.out.println(d.getNano());
	Duration d1=d.plus(d);
	System.out.println(d1.getSeconds());
}
}
/*
999999999
86399
*/