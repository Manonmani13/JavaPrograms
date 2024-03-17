package Date_time_6_11_21;
import java.util.Calendar;  
import static java.util.Calendar.DAY_OF_WEEK;  
import static java.util.Calendar.DECEMBER;  
import static java.util.Calendar.JANUARY;  
import static java.util.Calendar.LONG;  
import static java.util.Calendar.MONTH;  
import static java.util.Calendar.SATURDAY;  
import static java.util.Calendar.SUNDAY;  
import java.util.Locale; 
public class DisName_Ex2 {
	public static void main(String[] args) {  
        //getting the instance of calendar class using getinstance() method.  
      Calendar cal1 = Calendar.getInstance(new Locale("ja", "JP", "JP"));  
    Calendar cal2 = Calendar.getInstance(Locale.US);  
    // for loop starting from Sunday and running till Saturday\  
    System.out.println("Days of week are");  
         for (int i = JANUARY; i <= DECEMBER; i++) {  
        cal1.set(MONTH, i);  
        String c2 = cal1.getDisplayName(MONTH, LONG, Locale.US);  
        System.out.println(c2);  
    }  
    System.out.println("Months of year are");  
    for (int i = SUNDAY; i <= SATURDAY; i++) {    
       cal2.set(DAY_OF_WEEK, i);  
        String c1 = cal2.getDisplayName(DAY_OF_WEEK, LONG, Locale.US);  
        System.out.println(c1);  
              }  
}  
}
/*
Days of week are
January
February
March
April
May
June
July
August
September
October
November
December
Months of year are
Sunday
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday

*/