package Date_Time_6_11_21;

import java.util.Date;

public class util_Ex3 {
public static void main(String[] args) {
Date d=new Date(2018,9,21);
Date d2=new Date(1990,3,19);
System.out.println("Date d is after date d2"+d.after(d2));
}
}
//Date d is after date d2true