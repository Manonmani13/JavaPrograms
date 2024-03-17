package Date_Time_6_11_21;

import java.sql.Date;

public class Before_Ex2 {
	public static void main(String[] args) {
		Date d=new Date(2020,4,10);
		Date d2=new Date(1999,4,20);
		System.out.println("Date d is before Date d2: "+d.before(d2));
	}
}
