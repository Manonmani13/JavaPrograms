package StringMethods;

import java.util.Arrays;

public class Concat1 {
	public String concat(String str) {    
	       int otherLen = str.length();    
	       if (otherLen == 0) {    
	           //return this;    
	       }    
	      /* int len = value.length;    
	       char buf[] = Arrays.copyOf(value, len + otherLen);    
	       str.getChars(buf, len);    
	       return new String(buf, true);    
	   } */
		return str;
	}
}
