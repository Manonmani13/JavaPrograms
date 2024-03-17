package Date_Time_6_11_21;

import java.sql.Date;

public class Equals_Ex1 {
public static void main(String[] args) {
	Date d=new Date(2018,9,21);
	Date d1=new Date(1990,3,20);
	System.out.println(d.equals(d1));
}
}
//false