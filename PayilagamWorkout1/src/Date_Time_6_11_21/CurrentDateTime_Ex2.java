package Date_Time_6_11_21;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime_Ex2 {
public static void main(String[] args) {
	SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date d=new Date();
	System.out.println(f.format(d));
	System.out.println(java.time.LocalDate.now());
	System.out.println(java.time.LocalTime.now());
	System.out.println(java.time.LocalDateTime.now());
	System.out.println(java.time.Clock.systemUTC().instant());
	long millis=System.currentTimeMillis();
	java.util.Date date=new java.util.Date(millis);
	System.out.println(date);
	Date da=java.util.Calendar.getInstance().getTime();
	System.out.println(da);
}
}
//06/11/2021 15:14:12
/*
06/11/2021 15:19:37
2021-11-06
15:19:37.936478
2021-11-06T15:19:37.937153
2021-11-06T09:49:37.938452Z
Sat Nov 06 15:19:37 IST 2021
Sat Nov 06 15:19:38 IST 2021
*/