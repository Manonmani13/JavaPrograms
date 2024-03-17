package Date_Time_06_11_21;
import java.util.*;
public class HashCode_Ex1 {
	public static void main(String[] args) {  
		  
	      // create a calendar  
	      Calendar mycal = Calendar.getInstance();  
	  
	      // display current calendar  
	      System.out.println("The current time: " + mycal.getTime());  
	  
	      // get the hash code and print it  
	      int i = mycal.hashCode();  
	      System.out.println(" Hash Code  " + i);  
	   }  
}
/*
The current time: Sat Nov 06 23:51:09 IST 2021
 Hash Code  927828

*/