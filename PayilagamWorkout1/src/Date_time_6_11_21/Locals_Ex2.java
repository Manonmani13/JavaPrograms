package Date_time_6_11_21;

import java.util.Locale;

public class Locals_Ex2 {
	public static void main(String args[]) {  
		  // // an object of local class called lclarray(array) is created   
		       Locale[] lclarray = new Locale[5];  
		  
		      // all available locals are accessed and stored in strlocal  
		      lclarray = Locale.getAvailableLocales();  
		  
		      // print the results  
		      System.out.println("The first 5 locales installed in runtime environment are :-\n");  
		      for (int i = 0; i < 6; i++) {  
		          //here locals are printed without getISO3Country() method  
		         System.out.println(lclarray[i]);  
		      }  
		   }  
}
/*
The first 5 locales installed in runtime environment are :-


nn
ar_JO
bg
kea
nds
*/