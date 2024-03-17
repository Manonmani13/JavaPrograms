package Date_Time_3_11_21;
import java.time.*;
public class ZoneId_Ex3 {
	  public static void main(String[] args) {  
		    ZoneId z = ZoneId.systemDefault();  
		    String s = z.getId();  
		    System.out.println(s);  
		  }   
}
//Asia/Kolkata