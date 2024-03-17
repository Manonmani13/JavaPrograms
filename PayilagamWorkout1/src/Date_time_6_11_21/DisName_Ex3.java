package Date_time_6_11_21;
import java.util.Calendar;  
import static java.util.Calendar.DAY_OF_YEAR;  
import static java.util.Calendar.LONG;  
import static java.util.Calendar.SATURDAY;  
import static java.util.Calendar.SUNDAY;  
import java.util.Locale;   
public class DisName_Ex3 {
	public static void main(String[] args) {  
        //getting the instance of calendar class using getinstance() method.  
      Calendar cal1 = Calendar.getInstance(new Locale("ja"));  
    Calendar cal2 = Calendar.getInstance(Locale.US);  
  
    // for loop starting from Sunday and running till Saturday  
    System.out.println("Days of year do not have String representation");  
    for (int i = SUNDAY; i <= SATURDAY; i++) {  
        cal1.set(DAY_OF_YEAR, i);  
       String c1 = cal1.getDisplayName(DAY_OF_YEAR, LONG, Locale.US);  
        System.out.println(c1);  
          
    }  
}
}
/*
Days of year do not have String representation
null
null
null
null
null
null
null
*/