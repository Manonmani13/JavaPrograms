package Date_Time_6_11_21;

import java.time.Duration;
import java.time.Instant;

public class Instant_Ex4 {
	public static void main(String[] args) {
		Instant in=Instant.parse("2020-09-02T11:30:25.00Z");
		in=in.plus(Duration.ofDays(120));
		System.out.println(in);
	}
}
//2020-12-31T11:30:25Z