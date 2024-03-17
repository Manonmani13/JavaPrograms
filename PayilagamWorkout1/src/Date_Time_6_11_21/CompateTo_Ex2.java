package Date_Time_6_11_21;

import java.util.Date;

public class CompateTo_Ex2 {
	public static void main(String[] args) {
		Date d=new Date(1997,3,10);
		Date d1=new Date(1997,3,10);
		int com=d.compareTo(d1);
		System.out.println(com);
	}
}
//0