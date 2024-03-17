package Date_Time_6_11_21;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Duration_Ex3 {
public static void main(String[] args) {
	Duration d=Duration.between(LocalTime.NOON,LocalTime.MAX);
	System.out.println(d.get(ChronoUnit.SECONDS));
}
}
//43199