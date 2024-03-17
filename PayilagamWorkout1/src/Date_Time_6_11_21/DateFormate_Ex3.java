package Date_Time_6_11_21;

import java.text.DateFormat;
import java.util.Date;

public class DateFormate_Ex3 {
public static void main(String[] args) {
	Date d=new Date();
	System.out.println(d);
	String da=DateFormat.getInstance().format(d);
	System.out.println(da);
	da=DateFormat.getDateInstance().format(d);
	System.out.println(da);
	da=DateFormat.getTimeInstance().format(d);
	System.out.println(da);
	da=DateFormat.getDateTimeInstance().format(d);
	System.out.println(da);
	da=DateFormat.getTimeInstance(DateFormat.SHORT).format(d);
	System.out.println(da);
	da=DateFormat.getTimeInstance(DateFormat.MEDIUM).format(d);
	System.out.println(da);
	da=DateFormat.getTimeInstance(DateFormat.LONG).format(d);
	System.out.println(da);
	da=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(d);
	System.out.println(da);
}
}
/*
Sat Nov 06 15:54:40 IST 2021
06/11/21, 3:54 PM
06-Nov-2021
3:54:40 PM
06-Nov-2021, 3:54:40 PM
3:54 PM
3:54:40 PM
3:54:40 PM IST
6 November 2021, 3:54 PM
*/