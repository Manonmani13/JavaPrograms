package Date_Time_3_11_21;
import java.util.Locale;  
import java.time.ZoneId;  
import java.time.format.TextStyle; 
public class ZoneId_Ex4 {
	public static void main(String[] args) {  
	    ZoneId z = ZoneId.systemDefault();  
	    System.out.println(z.getDisplayName(TextStyle.FULL, Locale.ROOT));  
	  }   
}
//India Time