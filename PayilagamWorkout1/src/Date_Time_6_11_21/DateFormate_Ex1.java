package Date_Time_6_11_21;

import java.text.DateFormat;
import java.util.Date;

public class DateFormate_Ex1 {
public static void main(String[] args) {
	Date d=new Date();
	System.out.println(d);
	String dt=DateFormat.getInstance().format(d);
	System.out.println(dt);
}
}
/*
Sat Nov 06 15:43:28 IST 2021
06/11/21, 3:43 PM
*/