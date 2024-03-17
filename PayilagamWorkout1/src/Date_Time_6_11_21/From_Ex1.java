package Date_Time_6_11_21;

import java.util.Date;
import java.time.Instant;

public class From_Ex1 {
	public static void main(String[] args) {
		Date d=new Date();
		Instant i=Instant.now();
		System.out.println(d.from(i));
	}	
}
//Sat Nov 06 14:37:47 IST 2021