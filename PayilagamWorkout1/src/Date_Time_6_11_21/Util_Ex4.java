package Date_Time_6_11_21;

import java.util.Date;

public class Util_Ex4 {
public static void main(String[] args) {
	Date d=new Date(1998,9,21);
	Date d2=new Date(2020,3,19);
	System.out.println("Date d is after date d2:"+d.after(d2));

}
}
//Date d is after date d2:true
//Date d is after date d2:false