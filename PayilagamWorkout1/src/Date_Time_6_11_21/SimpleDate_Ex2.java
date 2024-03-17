package Date_Time_6_11_21;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDate_Ex2 {
public static void main(String[] args) {
	Date d=new Date();
	SimpleDateFormat f=new SimpleDateFormat("MM/dd/yyyy");
	String strDate=f.format(d);
	System.out.println(strDate);
	f=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
	strDate=f.format(d);
	System.out.println(strDate);
	f=new SimpleDateFormat("dd MMMM yyyy");
	strDate=f.format(d);
	System.out.println(strDate);
	f=new SimpleDateFormat("E,dd MMMM yyyy HH:mm:ss z");
	strDate=f.format(d);
	System.out.println(strDate);
}
}
/*
11/06/2021
06-11-2021 03:32:51
06 November 2021
Sat,06 November 2021 15:32:51 IST
*/