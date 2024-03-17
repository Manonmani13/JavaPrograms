package Date_Time_6_11_21;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Instant_Ex5 {
	public static void main(String[] args) {
		Instant in=Instant.parse("2020-09-02T11:30:25.00Z");
		//in=in.plus(Duration.ofDays(120));
		System.out.println(in.isSupported(ChronoUnit.DAYS));
		System.out.println(in.isSupported(ChronoUnit.YEARS));
	}
}
/*
true
false
*/