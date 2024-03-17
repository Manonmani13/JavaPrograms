package Date_Time_6_11_21;

import java.text.SimpleDateFormat;
import java.sql.Date;
import java.text.*;

public class SimpleDate_Ex3 {
public static void main(String[] args) {
	SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
	try
	{
		java.util.Date d=f.parse("31/03/2021");
		System.out.println("Date is "+d);
		
	}catch(ParseException e)
	{
		e.printStackTrace();
	}
}
}
//Date is Wed Mar 31 00:00:00 IST 2021