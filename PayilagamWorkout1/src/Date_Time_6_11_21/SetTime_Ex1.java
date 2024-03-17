package Date_Time_6_11_21;

import java.util.Date;

public class SetTime_Ex1 {
	public static void main(String[] args) {
		Date d=new Date(1999,6,11);
		long l=1000;
		d.setTime(l);
		System.out.println(d.toString());
	}
}
//Thu Jan 01 05:30:01 IST 1970