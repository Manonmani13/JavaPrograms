package Date_Time_6_11_21;

import java.util.Date;

public class CompareTo_Ex3 {
	public static void main(String[] args) {
		Date d=new Date(2021,3,10);
		Date d1=new Date(1997,3,10);
		int com=d.compareTo(d1);
		System.out.println(com);
	}
}
//1