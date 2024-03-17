package Date_Time_6_11_21;

import java.time.Duration;
import java.time.LocalTime;

public class Duration_Ex4 {
public static void main(String[] args) {
	Duration d=Duration.between(LocalTime.NOON,LocalTime.MAX);
	System.out.println(d.getSeconds());
	Duration d1=d.minus(d);
	System.out.println(d1.getSeconds());
}
}
/*
43199
0

*/