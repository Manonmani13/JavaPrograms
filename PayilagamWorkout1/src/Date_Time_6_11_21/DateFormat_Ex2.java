package Date_Time_6_11_21;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormat_Ex2 {
	public static void main(String[] args) throws Exception {
		Date d=new Date();
		System.out.println(d);
		Date dt=DateFormat.getDateInstance().parse("31 Mar,2015");
		System.out.println(dt);
	}
}
//Sat Nov 06 15:45:40 IST 2021