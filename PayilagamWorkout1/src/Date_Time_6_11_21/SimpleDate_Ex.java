package Date_Time_6_11_21;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate_Ex {
public static void main(String[] args) {
	Date d=new Date();
	SimpleDateFormat form=new SimpleDateFormat("dd/MM/yyyy");
	String strDate=form.format(d);
	System.out.println(strDate);
}
}
//06/11/2021